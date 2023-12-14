// // import java.util.*;
//  class Tv {
//     String brand;
//     int size;
//     int price;
//     int discount;
//     int ActualPrice;
//      int DisountedPrice;

//     Tv(){
//     this.brand=brand;
//     this.size=size;
//     this.price=price;

//     }
//     void Discount(){
       
//         switch (size) {
//             case 50:
//                 discount=1000;
//                 break;
//             case 52:
//                 discount=2000;
//                 break;
//                  case 54:
//                 discount=3000;
//                 break;
//             default:
//                 break;
//         }
//         switch (brand) {
//             case "Samsung":
//                ActualPrice=10000;
//                 break;
//             case "Onida":
//                ActualPrice=20000;
//                 break;
//             case "MI":
//                 ActualPrice=15000;
//                 break;
//             default:
//                 break;
//         }


//     }
//     void Tvprice(){
//         System.out.println("enterd model"+brand);
//        System.out.println("enterd size"+size);
       
//     }

//     void print(){
//         DisountedPrice= ActualPrice-discount;
// System.out.println("total discounted value ="+DisountedPrice);

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter brand");
//         String brand= sc.next();
//         System.out.println("enter size");
//         String size= sc.next();
        
//         Tv tv= new Tv();
//         tv.Tvprice();
//         tv.print();

//     }
// }
import java.util.*;
 class T {
    String brand;
    int size;
    int price;
    int discount;
    int ActualPrice;
     int DisountedPrice;

    T(){
    this.brand=brand;
    this.size=size;
    this.price=price;

    }
    void Discount(){
       
        switch (size) {
            case 50:
                discount=1000;
                break;
            case 52:
                discount=2000;
                break;
                 case 54:
                discount=3000;
                break;
            default:
                break;
        }
        switch (brand) {
            case "Samsung":
               ActualPrice=10000;
                break;
            case "Onida":
               ActualPrice=20000;
                break;
            case "MI":
                ActualPrice=15000;
                break;
            default:
                break;
        }
            DisountedPrice=ActualPrice-discount;

    }
    void Tvprice(){
        System.out.println("enterd model"+brand);
       System.out.println("enterd size"+size);
       
    }

    void print(){
       System.out.println("selected make"+brand);
        System.out.println("selected model"+size);
        
      
       System.out.println("discounted price"+DisountedPrice);
       
    }
}
     public class Tv{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter brand");
        String brand= sc.next();
        System.out.println("enter size");
        String size= sc.next();
        
        T tv= new T();
        tv.Tvprice();
        tv.print();

     }
     }

