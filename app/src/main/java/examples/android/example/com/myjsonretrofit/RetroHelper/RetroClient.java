package examples.android.example.com.myjsonretrofit.RetroHelper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import examples.android.example.com.myjsonretrofit.api.ApiService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClient {

    private static final String ROOT_URL = "http://www.json-generator.com";


    private static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    private static Retrofit getRetrofitInstance() {


        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build(); //logging

        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public static ApiService getApiService() {
        return getRetrofitInstance().create(ApiService.class);
    }
}
