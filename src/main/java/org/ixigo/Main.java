package org.ixigo;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        String url = "https://jsonplaceholder.typicode.com/todos/1";
        Request request = new Request.Builder()
                .url(url)
                .build();
        try(Response response = client.newCall(request).execute()){
            if(!response.isSuccessful()){
                System.out.println("Something went wrong");
            }
            System.out.println(response.body().string());
        }
        catch (IOException ex){
            ex.printStackTrace();

        }
    }
}