// km convert to miles
import java.util.*;
public class Main {
    public static void main(String[] args) {
     int km;
     Scanner obj=new Scanner(System.in);
     System.out.println("enter the value");
     km=obj.nextInt();
     double miles = (km /1.6);
     System.out.println("enter the value"+miles);
    }
}
