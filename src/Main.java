public class Main {
    public static void main(String[] args) {
        System.out.println("курсовая1");
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.id = 1;
        emp1.name = "kirill";
        emp1.lastName = "kirillovith";
        emp1.middleName = "kirillov";
        emp1.department = 1;
        emp1.salary = 10000;
        System.out.println( " id- " + emp1.id +" " +emp1.name+ "  " + emp1.lastName + " "  + emp1.middleName +"  отдел-" + emp1.department + "    зп=" + emp1.salary);

        emp2.id = 2;
        emp2.name = "ivan";
        emp2.lastName = "ivanovih";
        emp2.middleName = "ivanov";
        emp2.department = 2;
        emp2.salary = 12000;
        System.out.println(" id- " + emp2.id +" " +emp2.name+ "  " + emp2.lastName + " "  + emp2.middleName +"  отдел-" + emp2.department+ "    зп=" + emp2.salary);

    }
}





class Employee {
    Integer id;
    String name;
    String lastName;
    String middleName;
    int department;
    int salary;
}


