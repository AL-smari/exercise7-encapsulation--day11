// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Q1

        Account a1 = new Account("1111","abdulaziz",5000);
        System.out.println(a1.toString());
        a1.credit(200);
        System.out.println(a1.toString());

        
        Account a2 = new Account("2222","khalid");
        System.out.println(a2.toString());
        a1.transferTo(a2,1800);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());





        //Q2



        Employee e1 = new Employee("1234","ahmed",10000);
        System.out.println(e1.toString());
        System.out.println("your annual salary is :"+e1.getAnnualSalary());
        System.out.println(e1.raisedSalary(10));
        System.out.println("your salary is:"+e1.getSalary());
        System.out.println("your annual salary is :"+e1.getAnnualSalary());
        System.out.println(e1.toString());


        Employee e2 = new Employee("4321","fahad",13000);
        System.out.println(e2.getSalary());
        System.out.println(e2.getName());
        System.out.println(e2.getAnnualSalary());
        System.out.println(e2.raisedSalary(15));
        System.out.println(e2.toString());
        System.out.println(e2.getAnnualSalary());
        e2.setSalary(9000);
        System.out.println(e2.toString());
        System.out.println(e2.getAnnualSalary());
        e2.setName("nasser");
        e2.setId("3412");
        System.out.println(e2.toString());




    }
}