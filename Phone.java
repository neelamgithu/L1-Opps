import java.util.*;
public class Phone {
    String model;
    String storage;
    String make;
    int base;
    int basestorage;
    int basemodel;
    Phone(String make, String model,String storage){
        this.make=make;
        this.model=model;
        this.storage=storage;

    }
   public void  Price(){
   switch (make) {
        case "INDIA":
             base=10000;
            break;
             case "CHAINA":
           base=5000;
           break;
             case "USA":
            base=50000;
            break;
            default:
            
       }
       switch (model) {
        case "Y1":
          basemodel=1000;
          break;
          case "Y2":
          basemodel=1000;
            break;
       
        default:
       
         
       }
       switch (storage) {
        case "15GB":
            basestorage=1000;
            break;
            case "10GB":
            basestorage=1000;
            break;
       
        default:
           
       }
               
    
    }
    void PrintPrice(){
        System.out.println("selected make"+make);
        System.out.println("selected model"+model);
        System.out.println("selected stroge"+storage);
        int finalprice=base+basemodel+basestorage; 
                 System.out.println("finalprice"+finalprice);
    }

    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.println("enter make");
         String make=sc.next();
        System.out.println("enter model");
        String model=sc.next();
        System.out.println("enter Storage");
        String storage=sc.next();

        Phone ph =new Phone(make,model,storage);
        ph.Price();
        ph.PrintPrice();
    }
}
