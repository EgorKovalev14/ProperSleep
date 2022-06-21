package ru.samsung.slumber;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {
    @POST("/register")
    Call<RegistrationResponse> nameOfFun(@Body RegistrationBody body);
}
