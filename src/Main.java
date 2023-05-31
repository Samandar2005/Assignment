import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> employeeList = new ArrayList<>();
    static ArrayList<Works> worksList = new ArrayList<>();
    static  int katta =0;


    public static void main(String[] args) {
        System.out.println("Employee yaratish dasturi");

        while (true) {
            System.out.println("1. Create Employee");
            System.out.println("2. Delete Employee by id");
            System.out.println("3. Update Employee by id");
            System.out.println("4. Employee List");
            System.out.println("5. Employee maoshini tekshirish");
            System.out.println("6. Oyning eng yaxshi employee");
            System.out.println("7. Elonlarini joylash");
            System.out.println("8. Elonlarini o'chirish(id)");
            System.out.println("9. Elonlarni o'zgartirish(id)");
            System.out.println("10. Elonlarni ko'rish");
            System.out.println("11. Exit");

            int choice = scanner.nextInt();


            switch (choice){
                case 1:
                    createEmployee();
                    break;
                case 2:
                    deleteEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    employeeList();
                    break;
                case 5:
                    employeemaosh();
                    break;
                case 6:
                    yaxshiemployee();
                    break;
                case 7:
                    createWorks();
                    break;
                case 8:
                    deleteWorks();
                    break;
                case 9:
                    updateWorks();
                    break;
                case 10:
                    workList();
                    break;
                case 11:
                    System.out.println("Dastur tugadi");
                    return;
                default:
                    System.out.println("Notogri raqam kiritdingiz!");
                    break;
            }
        }
    }

    private static void yaxshiemployee() {
        for(Employee employee : employeeList){
            if(employee.getMaosh()>katta){
                katta=employee.getMaosh();
            }
        }
        if (katta>0){
            System.out.println("Shu oyning eng yaxshi ischisi");
            System.out.println(getmaosh());
            System.out.println("Oyning eng yaxshi ishchisi bo'lgani tufayli maoshini 2 barobar oshiramiz: " + katta*2);
        }else {
            System.out.println("Hali hech kim ish boshlamagan");
        }
    }
    private  static  Employee getmaosh(){
        for(Employee employee : employeeList){
            if(employee.getMaosh()==katta)
                return employee;
        }
        return null;
    }

    private static void employeemaosh() {
        System.out.println("Maoshini bilmoqchi bo'lgan ishchingiz IDsni kiriting: ");
        int id = scanner.nextInt();
        Employee employee = getEmployeeById(id);
        System.out.println("Ushbu oyda necha soat ishlagan");
        int soat = scanner.nextInt();
        employee.setMaosh(50000*soat);
        if(employee!=null){
            if(soat<=100 && soat>0)
                System.out.println("Bu ishchining maoshi " + employee.getMaosh() + " so'm" );
            else
                System.out.println("Shartnomaga ko'ra buncha vaqt ishlash mumkin emas");
        }
    }

    private static void updateEmployee() {
        System.out.print("Update qilmoqchi bolgan employeeni id sini kiriting: ");

        int id = scanner.nextInt();

        Employee employee = getEmployeeById(id);

        if (employee !=null){
            System.out.print("name = ");
            employee.setName(scanner.next());

            System.out.print("lastname = ");
            employee.setLastname(scanner.next());

            System.out.print("age = ");
            employee.setAge(scanner.nextInt());

        }
    }


    private static void employeeList() {

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }

    public static Employee getEmployeeById(int id){
        for (Employee employee : employeeList) {
            if (employee.getId()==id){
                return employee;
            }
        }

        return null;
    }


    private static void deleteEmployee() {
        System.out.print("Delete qilmoqchi bolgan employeeni id sini kiriting: ");

        int id = scanner.nextInt();

        Employee employee = getEmployeeById(id);

        if (employee !=null){
            employeeList.remove(employee);
        }

    }

    private static void createEmployee() {

        Employee employee = new Employee();

        System.out.print("id = ");
        employee.setId(scanner.nextInt());

        System.out.print("name = ");
        employee.setName(scanner.next());

        System.out.print("lastname = ");
        employee.setLastname(scanner.next());

        System.out.print("age = ");
        employee.setAge(scanner.nextInt());


        employeeList.add(employee);

    }

    public static Works getWorksById(int id){
        for (Works works : worksList) {
            if (works.getId()==id){
                return works;
            }
        }

        return null;
    }
    private static void createWorks(){
        Works work = new Works();

        System.out.print("id = ");
        work.setId(scanner.nextInt());

        System.out.print("Mijoz nomi = ");
        work.setClientName(scanner.next());

        System.out.print("Ish soati = ");
        work.setRequiredHours(scanner.nextInt());

        worksList.add(work);

    }

    private static void deleteWorks() {
        System.out.print("Delete qilmoqchi bolgan eloningizni id sini kiriting: ");

        int id = scanner.nextInt();

        Works work = getWorksById(id);

        if (work !=null){
            worksList.remove(work);
        }

    }
    private static void updateWorks() {
        System.out.print("Update qilmoqchi bolgan Ishingizni id sini kiriting: ");

        int id = scanner.nextInt();

        Works work = getWorksById(id);

        if (work !=null){
            System.out.print("Mijoz nomi = ");
            work.setClientName(scanner.next());

            System.out.print("Ish soati = ");
            work.setRequiredHours(scanner.nextInt());

        }
    }

    private static void workList() {

        for (Works work : worksList) {
            System.out.println(work);
        }

    }


}