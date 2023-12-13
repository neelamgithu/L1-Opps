import java.util.*;
class Student{
    String name;
    int age;
    int id;



    Student(String name,int age ,int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
      
    public void print(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
    }

    
    public static void main(String[] args) {
     Student st =new Student("neelam",23,202);
      st.print();
     }
}