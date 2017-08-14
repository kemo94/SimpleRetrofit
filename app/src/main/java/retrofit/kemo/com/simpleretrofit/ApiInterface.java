package retrofit.kemo.com.simpleretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("json")
    Call<IPItem> getIPData();

}
