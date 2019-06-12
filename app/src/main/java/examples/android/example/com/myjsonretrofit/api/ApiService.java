package examples.android.example.com.myjsonretrofit.api;

import java.util.List;

import examples.android.example.com.myjsonretrofit.JsonData.Employee;
import examples.android.example.com.myjsonretrofit.JsonData.EmployeeList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("api/json/get/cqZcYUUPKG?indent=2")
    Call<EmployeeList> getEmployees();
}
