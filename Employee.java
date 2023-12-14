public class Employee {
    String name;
    Double salary;
    int id;
    Employee(String name,double salary,int id){
        this.name=name;
        this.salary=salary;
        this.id=id;

    }
    public double YearlySalary(){
    return salary*12;


    }
    public void printsalary(){
        System.out.println("emp name="+ name);
        System.out.println("emp salary"+ salary);
        System.out.println("emp id"+id);
        System.out.println("yearly salary"+YearlySalary());
    }
public static void main(String[] args) {
    Employee emp =new Employee("Neelam",10000,101);
emp.YearlySalary();
 emp.printsalary();

}






}
