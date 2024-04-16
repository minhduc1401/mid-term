public class Experience extends Employee{
    private int ExpInYear;
    private String Proskill;

    public Experience(String ID, String fullName, String birthday, String phone, String email, String employee_type, String employee_count, int expInYear, String proskill) {
        super(ID, fullName, birthday, phone, email, employee_type);
        ExpInYear = expInYear;
        Proskill = proskill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public String getProskill() {
        return Proskill;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public void setProskill(String proskill) {
        Proskill = proskill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ExpInYear :" +ExpInYear);
        System.out.println("Proskill :" +Proskill);
    }
}
