import java.util.Scanner;

class Comp{
 String processor;
 String RAM;
 String storage;
 int amount;
 int RamAmount;
 int  StgAmount;
Comp(String processor,String RAM ,String storage){
this.processor=processor;
this.RAM=RAM;
this.storage=storage;
}
 void price(){
       
        switch (processor) {
            case "intel":
                amount=1000;
                break;
            case "pentium":
               amount=2000;
                break;
                 case "celeron":
                amount=3000;
                break;
            default:
                break;
        }
        switch (RAM){ 
            case "10GB":
               RamAmount=10000;
                break;
            case "100GB":
               RamAmount=20000;
                break;
            case "1TB":
                RamAmount=15000;
                break;
            default:
        }   
        
        switch (storage) {
            case "10GB":
               StgAmount=10000;
                break;
            case "100GB":
               StgAmount=20000;
                break;
            case "1TB":
                 StgAmount=15000;
                break;
            default:
                
        }

    }
     void PrintPrice(){
        System.out.println("selected make"+RAM);
        System.out.println("selected model"+storage);
        System.out.println("selected stroge"+processor);
        int finalprice=StgAmount+RamAmount+amount; 
                 System.out.println("finalprice"+finalprice);
}

}

public class Computer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter processor");
        String processor= sc.next();
        System.out.println("enter Ram");
        String RAM= sc.next();
        System.out.println("enter stg");
        String storage = sc.next();
        
        Comp cp=new Comp(processor,RAM,storage);
  cp.price();
  cp.PrintPrice();
    }
}


