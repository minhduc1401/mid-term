public class Employee implements IEmployee {
    private String ID;
    private String FullName;
    private String Birthday;
    private String Phone ;
    private String Email;
    private String Employee_type;
    private static int  Employee_count = 0;

    public Employee(String ID, String fullName, String birthday, String phone, String email, String employee_type) {
        this.ID = ID;
        FullName = fullName;
        Birthday = birthday;
        Phone = phone;
        Email = email;
        Employee_type = employee_type;
        Employee_count++;
    }

    public String getID() {
        return ID;
    }

    public String getFullName() {
        return FullName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getEmployee_type() {
        return Employee_type;
    }

    public static int getEmployee_count() {
        return Employee_count;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setEmployee_type(String employee_type) {
        Employee_type = employee_type;
    }

    public static void setEmployee_count(int employee_count) {
        Employee_count = employee_count;
    }

    @Override
    public void showInfo() {
            System.out.println("ID of Employee : " + ID);
            System.out.println("FullName of Employee : " + FullName);
            System.out.println("Birthday of Employee : " + Birthday);
            System.out.println("Phone of Employee : " + Phone);
            System.out.println("Email of Employee : " + Email);
            System.out.println("Employee_type of Employee : " + Employee_type);
            System.out.println("Employee_count of Employee : " + Employee_count);
    }

}
