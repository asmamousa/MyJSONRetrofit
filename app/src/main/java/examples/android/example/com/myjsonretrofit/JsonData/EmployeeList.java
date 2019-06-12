package examples.android.example.com.myjsonretrofit.JsonData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeeList {

    @SerializedName("employee")
    @Expose
    private List<Employee> employee = null;

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

}
