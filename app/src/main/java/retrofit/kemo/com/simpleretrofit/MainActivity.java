package retrofit.kemo.com.simpleretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView myCityTxv , myCountryTxv , lonTxv , latTxv ;
    final String BASE_URL = "http://ip-api.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCityTxv = (TextView) findViewById(R.id.myCity_txv);
        myCountryTxv = (TextView) findViewById(R.id.myCountry_txv);
        lonTxv = (TextView) findViewById(R.id.lon_txv);
        latTxv = (TextView) findViewById(R.id.lat_txv);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);

        Call<IPItem> call = apiInterface.getIPData();
        call.enqueue(new Callback<IPItem>() {
            @Override
            public void onResponse(Call<IPItem> call, Response<IPItem> response) {

                myCityTxv.setText(response.body().getCity());
                myCountryTxv.setText(response.body().getCountry());
                lonTxv.setText(response.body().getLongtiude() + "");
                latTxv.setText(response.body().getLatitutde() + "");
            }
            @Override
            public void onFailure(Call<IPItem> call, Throwable t) {
                Log.e("retrofit", t.toString());
            }
        });
    }
}
