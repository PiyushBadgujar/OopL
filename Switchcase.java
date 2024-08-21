import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER YOUR GRADE");
        String s= scn.nextLine();
        switch (s){
            case "honors":
                System.out.println("marks>=80");
                break;
            case "first":
                System.out.println("65<marks>80");
                break;
            case "second":
                System.out.println("55<marks>65");
                break;
            default:
                System.out.println("so sorry bro you are Fail");
        }

    }
}
