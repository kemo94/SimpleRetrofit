package retrofit.kemo.com.simpleretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kemo on 8/14/2017.
 */

public class IPItem {

    @SerializedName("city")
    String city ;


    @SerializedName("country")
    String country ;

    @SerializedName("lat")
    float latitutde ;

    @SerializedName("lon")
    float longtiude ;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getLatitutde() {
        return latitutde;
    }

    public void setLatitutde(float latitutde) {
        this.latitutde = latitutde;
    }

    public float getLongtiude() {
        return longtiude;
    }

    public void setLongtiude(float longtiude) {
        this.longtiude = longtiude;
    }
}
