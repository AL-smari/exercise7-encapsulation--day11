public class Employee {
    private String id;
    private String name;
    private double  salary;
    public Employee(String id ,String name ,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double  getSalary(){
        return salary;
    }
    public void setId(String id){
        this.id=id;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double  getAnnualSalary(){
        return 12*salary;
    }
    public double raisedSalary(double percent){

        return  salary=salary+(salary*(percent/100));
    }

    public String toString(){
        return "your name: "+name+"\nyour id: "+id+"\nyour salary: "+salary+"\n";
    }
}
