package jay.registration.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name="employeeId", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(name="employeeName", length = 255)
    private String employeeName;

    @Column(name="address", length = 255)
    private String address;

    @Column(name="mobile", length = 20)
    private String mobile;

    @Column(name = "gender", length = 20)
    private String gender;

    public Employee(Long employeeId, String employeeName, String address, String mobile, String gender) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
        this.mobile = mobile;
        this.gender = gender;
    }

    public Employee() {

    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
