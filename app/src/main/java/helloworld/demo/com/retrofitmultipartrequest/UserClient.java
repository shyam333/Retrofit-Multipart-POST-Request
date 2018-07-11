package helloworld.demo.com.retrofitmultipartrequest;


import java.io.File;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UserClient {

    @Multipart
    @POST("apiupdateprofile.php")


    Call<User> createAccount(

            @Part ("candidate_id") RequestBody idrequest,
            @Part ("candidate_name") RequestBody namerequest,
            @Part MultipartBody.Part filepart

    );


}
