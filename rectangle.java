import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        Scanner o1= new Scanner(System.in);
        System.out.println("enter length of rectangle: ");
        int l=o1.nextInt();
        System.out.println("enter breath of rectangle: ");
        int b=o1.nextInt();
        int area=l*b;
        int peri=2*(l+b);
        System.out.println("area= "+area+"\nperimeter= "+peri);
    }
}