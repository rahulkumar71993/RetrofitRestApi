package com.example.rahul.retrofitrestapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        findViewById(R.id.tLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadData();
            }
        });
        hitProductApi();

    }

    private void loadData() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BaseUrl.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        ApiInterface api = retrofit.create(ApiInterface.class);
        Call<ModelCommanResponse> call = api.login("a@nish.com", "123456", "4646546565", "2");
        call.enqueue(new Callback<ModelCommanResponse>() {
            @Override
            public void onResponse(Call<ModelCommanResponse> call, Response<ModelCommanResponse> response) {
                Toast.makeText(MainActivity.this, "" + response.body().getMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ModelCommanResponse> call, Throwable t) {

            }
        });
    }

    private void hitProductApi() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BaseUrl.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        ApiInterface api = retrofit.create(ApiInterface.class);
        Call<ModelProductListResponse> call = api.getProduct();
        call.enqueue(new Callback<ModelProductListResponse>() {
            @Override
            public void onResponse(Call<ModelProductListResponse> call, Response<ModelProductListResponse> response) {
                if (Boolean.parseBoolean(response.body().getSuccess())) {
                    ProductListAdapter productListAdapter = new ProductListAdapter(MainActivity.this, response.body().getData());
                    recyclerView.setAdapter(productListAdapter);
                }
            }

            @Override
            public void onFailure(Call<ModelProductListResponse> call, Throwable t) {

            }
        });
    }
}
