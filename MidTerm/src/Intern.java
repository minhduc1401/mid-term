public class Intern extends Employee{
    private String Majors;
    private String Semester;
    private String University_name;

    public Intern(String ID, String fullName, String birthday, String phone, String email, String employee_type, String employee_count, String majors, String semester, String university_name) {
        super(ID, fullName, birthday, phone, email, employee_type);
        Majors = majors;
        Semester = semester;
        University_name = university_name;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Majors of Employee :"+Majors);
        System.out.println("Semester of Employee :"+Semester);
        System.out.println("University_name of Employee :"+University_name);

    }
}
