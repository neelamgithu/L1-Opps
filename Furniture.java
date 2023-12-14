
import java.util.*;
 class fur {
    String type;
    String material;
    int basic;
    int price;
    int discount;
     int DisountedPrice;

    fur(String type,String material){
    this.type=type;
    this.material=material;
    this.price=price;

    }
    void Discount(){
        switch (type) {
            case "table":
                basic=1000;
                break;
                case "chair":
                basic=1000;
                break;
                case "bed":
                basic=1000;
                break;
        
            default:
                break;
        }
       
        switch (material) {
            case "wood":
                discount=100;
                break;
            case "plywood":
                discount=200;
                break;
                 case "steel":
                discount=300;
                break;
            default:
                break;
        }
       DisountedPrice=basic-discount;
    }
    

    void print(){
       System.out.println("selected make"+material);
        
        
      
       System.out.println("discounted price"+DisountedPrice);
       
    }
}
    public class Furniture{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter type");
        String type= sc.next();
        System.out.println("enter material");
        String material= sc.next();
        
    fur f= new fur(type,material);
        f.Discount();
        f.print();

     }
     }

