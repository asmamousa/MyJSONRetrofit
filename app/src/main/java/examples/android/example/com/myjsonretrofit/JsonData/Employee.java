package examples.android.example.com.myjsonretrofit.JsonData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("employee_id")
    @Expose
    private Integer employeeId;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("dob")
    @Expose
    private String dob;

    @SerializedName("designation")
    @Expose
    private String designation;

    @SerializedName("contact_number")
    @Expose
    private String contactNumber;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("salary")
    @Expose
    private String salary;


    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getDesignation() {
        return designation;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSalary() {
        return salary;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
