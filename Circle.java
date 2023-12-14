import java.util.*;

public class Circle {
    int   radius ; 
    final double  pi= 3.141;
    double area;
    
      Circle(int radius){
        this.radius=radius;
      }
    void Area(){
     area=pi* (Math.sqrt(radius));
     System.out.println("area o circle"+area);
    }
    void curcerence(){
        double curcerence=2*pi*radius;
        System.out.println("curerence o circle="+curcerence);
    }
    
    
    public static void main(String[]args)
     {
       
          System.out.println("enter radius");
        Scanner sc = new Scanner(System.in);
        int radius=sc.nextInt();
         Circle cr= new Circle(radius);
      cr.Area();
      cr.curcerence();

     } 
}
