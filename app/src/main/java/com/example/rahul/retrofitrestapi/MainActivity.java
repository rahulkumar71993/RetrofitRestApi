package com.example.rahul.retrofitrestapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.rahul.retrofitrestapi.DashBoardRequest.DashBoardDataRequest;
import com.example.rahul.retrofitrestapi.DashBoardRequest.DashBoardRequest;
import com.example.rahul.retrofitrestapi.DashBoardResponse.DashBoardDataResponse;
import com.example.rahul.retrofitrestapi.DashBoardResponse.DashBoardResponsePojo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
    }

    private void loadData() {

        //  Toast.makeText(getActivity(), "nhgvjv", Toast.LENGTH_SHORT).show();
        BaseUrl b = (BaseUrl) getApplicationContext();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(b.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        ApiInterface cr = retrofit.create(ApiInterface.class);

        DashBoardRequest body = new DashBoardRequest();

        body.setAction("dashboard");

        DashBoardDataRequest data = new DashBoardDataRequest();
        data.setUserId("1");

        body.setData(data);


        Call<DashBoardResponsePojo> call = cr.dashboard(body);

        call.enqueue(new Callback<DashBoardResponsePojo>() {
            @Override
            public void onResponse(Call<DashBoardResponsePojo> call, Response<DashBoardResponsePojo> response) {

                // response.body().getDataa();
                if (response.body().getStatus().equals("1")) {

                    DashBoardDataResponse drs= response.body().getData();
                    Toast.makeText(getApplicationContext(), "wpobgjhg", Toast.LENGTH_SHORT).show();
                    List<DashBoardDataResponse> datList=new ArrayList<>();



                    for (int a=0;a<drs.getLevel1Amount().length();a++){


                        Log.e("333", drs.getDashboardStatus() + "  " + drs.getLevel1Amount()+ "  " + drs.getLevel1Joins() + "  " + drs.getTotalAmountEarned());

                    }

                    //
//                    Toast.makeText(getActivity(), "Register", Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(getActivity(), Verify_Otp.class);
//                    startActivity(intent);


                } else {
                    // Log.e("333",response.body().getMessagee() + "  hruyyui " + response.body().getStatus());
                    Toast.makeText(getApplicationContext(), "errorrrbb", Toast.LENGTH_SHORT).show();
                }


                // progress.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<DashBoardResponsePojo> call, Throwable t) {
                // progress.setVisibility(View.GONE);

                Toast.makeText(getApplicationContext(), "failure...", Toast.LENGTH_SHORT).show();
                Log.e("333",t.toString());
            }
        });


    }



}
