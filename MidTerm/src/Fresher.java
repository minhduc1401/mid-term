public class Fresher extends Employee{
    private String Graduation_date;
    private String Graduation_rank;
    private String Education ;

    public Fresher(String ID, String fullName, String birthday, String phone, String email, String employee_type, String employee_count, String graduation_date, String graduation_rank, String education) {
        super(ID, fullName, birthday, phone, email, employee_type);
        Graduation_date = graduation_date;
        Graduation_rank = graduation_rank;
        Education = education;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation_date of Employee :"+Graduation_date);
        System.out.println("Graduation_rank of Employee :"+Graduation_rank);
        System.out.println("Education of Employee :"+Education);

    }
}
