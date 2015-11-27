package br.com.isengardcode.android_bootstrap.rest.api;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * Created by sysadmin on 27/11/15.
 */
public interface RetrofitExampleAPI {
    @Headers({
            "X-Mashape-Key : yourAPIKey",
            "Accept: application/json"
    })

    @GET("package")
    Call<Object> yourService(@Query("q")String q);
}
