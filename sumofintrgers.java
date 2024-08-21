import java.util.Scanner;

public class sumofintrgers {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int s= scn.nextInt();
        int sum=0;
        while (s!=0){

            sum+=s%10;
            s=s/10;

        }
        System.out.println("THE SUM IS: "+sum);
    }
}
