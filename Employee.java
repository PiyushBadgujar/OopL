public class Employee {
    String name;
    String job;
    int salary;
    public Employee(String n,String j,int s){
        name=n;
        job= j;
        salary=s;


    }
    public int calculate(){
        return salary;

    }
    public  int update(){
        return salary;
    }

    public static void main(String[] args) {
        Employee y=new Employee("piyush","software_developer",1000000);
        System.out.println("name= "+y.name);
        System.out.println("calculated salary: "+y.calculate());
        y.salary+=200000;
        System.out.println("updated salary: "+y.update());
    }
}
