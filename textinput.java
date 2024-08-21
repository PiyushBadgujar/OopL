import java.util.Scanner;

public class textinput {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER ANY STRING: ");
        String s= scn.nextLine();
        System.out.println("ENTER TARGET ALPHABET");
        String target= scn.nextLine();
        char targetchar=Character.toUpperCase(target.charAt(0));
        String uppercase=s.toUpperCase();
        int count=0;
        for (int i = 0; i < uppercase.length(); i++) {
            if((uppercase.charAt(i))==targetchar){
                count++;
            }
        }
        System.out.println("COUNT OF "+target+" is " +count);

    }
}
