import java.util.*;
class Cloths{
    int size;
    String color;
    int price;
    int basic;
    int discount;
    int DisountedPrice;
Cloths(int size,String color){
    this.size=size;
    this.color=color;
    this.price=price;

}
void Discount(){
    switch (color) {
            case "red":
                basic=1000;
                break;
            case "blue":
                basic=1200;
                break;
                 case "green":
                basic=1300;
                break;
            default:
                break;
    }
       
        switch (size) {
            case 40:
                discount=100;
                break;
            case 42:
                discount=200;
                break;
                 case 44:
                discount=300;
                break;
            default:
                break;
        }
       DisountedPrice=basic-discount;
    }
    void finalprice(){
       System.out.println("selected material"+size);
      System.out.println("discounted price"+DisountedPrice);
    }
}


public class Shirt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("select color");
        String color =sc.next();
        System.out.println("select size");
        int size=sc.nextInt();
        Cloths c1=new Cloths(size,color); 
        c1.Discount();
        c1.finalprice();
    }
   

}
