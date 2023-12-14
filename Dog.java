import java.util.*;
public class Dog {
String  breed;
int age;
double weigth;
int HumanDogAge;
Dog(String breed,int age,double weight){
this.breed=breed;
this.age=age;
this.weigth=weight;
}

double HumanDogAge(){
HumanDogAge=age*7;
return HumanDogAge;

}
void PrintAge(){
  System.out.println("dog's age in human years"+HumanDogAge);


}
public static void main(String[] args) {
     Scanner dog= new Scanner(System.in);
    System.out.println("enter breed");
    String breed= dog.next();
    System.out.println("enter age");
     int age=dog.nextInt();
    System.out.println("enter weight");
     double weigth=dog.nextDouble();
     Dog dg=new Dog(breed,age,weigth);
     dg.HumanDogAge();
     dg.PrintAge();
   
}
}
