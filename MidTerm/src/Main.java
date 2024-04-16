import java.util.ArrayList;
import java.util.Scanner;


// Main class
public class Main {
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("---------------------------------------");
            System.out.println("Enter 1 to create Employee");
            System.out.println("Enter 2 to display Employee");
            System.out.println("Enter 3 to update Employee");
            System.out.println("Enter 4 để delelte  Employee");
            System.out.println("---------------------------------------");
             num = sc.nextInt();
            switch (num) {
                case 1:
                    addEmlpoyee();
                    break;
                case 2:
                    dislpayEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                default:
                    System.out.println("Not Value");
            }
        }while (num!=4);
        sc.close();
    }

    private static void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID of employee to delete: ");
        String ID = scanner.nextLine();

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getID().equals(ID)) {
                employees.remove(i);
                System.out.println("deleted successfully");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void updateEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID of employee to update: ");
        String ID = sc.nextLine();

        for (Employee employee : employees) {
            if (employee.equals(ID)) {
                System.out.println("Enter new Full Name: ");
                employee.setFullName(sc.nextLine());
                System.out.println("Enter new BirthDay: ");
                employee.setBirthday(sc.nextLine());
                System.out.println("Enter new Phone: ");
                employee.setPhone(sc.nextLine());
                System.out.println("Enter new Email: ");
                employee.setEmail(sc.nextLine());
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void dislpayEmployee() {
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println();
        }

    }

    private static void addEmlpoyee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID of Employee : ");
        String ID = sc.nextLine();
        System.out.println("Enter FullName of Employee : ");
        String FullName = sc.nextLine();
        System.out.println("Enter BirthDay of Employee : ");
        String BirthDay = sc.nextLine();
        System.out.println("Enter Phone of Employee : ");
        String Phone = sc.nextLine();
        System.out.println("Enter Email of Employee : ");
        String Email = sc.nextLine();
        System.out.println("Enter Employee Type of Employee : ");
        System.out.println("Select type of Employee: intern , fresher , experience ");
        String Employee_type = sc.nextLine();

        switch (Employee_type){
            case "experience" :
                System.out.println("ExpInYear of Employee :" );
                int ExInYear = sc.nextInt();
                System.out.println("Proskill :" );
                String Proskill = sc.nextLine();
                employees.add(new Employee(ID,FullName,BirthDay,Phone,Email,Employee_type));
                break;
            case "fresher" :
                System.out.println("Graduation_date of Employee :");
                String Graduation_date = sc.nextLine();
                System.out.println("Graduation_rank of Employee :");
                String Graduation_rank = sc.nextLine();
                System.out.println("Education of Employee :");
                String Education = sc.nextLine();
                employees.add(new Employee(ID,FullName,BirthDay,Phone,Email,Employee_type));
                break;
            case "intern" :
                System.out.println("Majors of Employee :");
                String Majors = sc.nextLine();
                System.out.println("Semester of Employee :");
                String Semester = sc.nextLine();
                System.out.println("University_name of Employee :");
                String University_name = sc.nextLine();
                employees.add(new Employee(ID,FullName,BirthDay,Phone,Email,Employee_type));
                break;
            default:
                System.out.println("Type not found");
        }
        System.out.println("add successlly");

    }


}
