package examples.android.example.com.myjsonretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import examples.android.example.com.myjsonretrofit.JsonData.Employee;
import examples.android.example.com.myjsonretrofit.JsonData.EmployeeList;
import examples.android.example.com.myjsonretrofit.RetroHelper.RetroClient;
import examples.android.example.com.myjsonretrofit.api.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.employee_id)
     TextView em_id;

   // TextView em_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        // em_id= (TextView) findViewById(R.id.employee_id);
        ApiService api = RetroClient.getApiService();

        Call<EmployeeList> call = api.getEmployees();

        call.enqueue(new Callback<EmployeeList>() {
            @Override
            public void onResponse(Call<EmployeeList> call, Response<EmployeeList> response) {

                if (response.isSuccessful()) {


                   List<Employee> employees= response.body().getEmployee();

                   for (Employee employee : employees){

                       String t="";
                       t+= "ID" + employee.getName();

                       em_id.append(t);

                   }


                }
            }


            @Override
            public void onFailure(Call<EmployeeList> call, Throwable t) {


                Log.e("main","retrofit error"+ t.toString());
            }
        });

    }
}
