//public class sortingarry {
//    public static void main(String[] args) {
//        int[] r = {18, 79, 8, 4, 97, 6, 10};
//        System.out.println("initial arrys");
//        for (int i = 0; i < r.length; i++) {
//            System.out.print(r[i]+" ");
//        }
//
//
//        for (int i = 0; i < r.length-1; i++) {
//
//            for (int j = i+1; j < r.length; j++) {
//                if (r[i] > r[j]) {
//
//                    int temp = r[j];
//                    r[j] = r[i];
//                    r[i] = temp;
//
//                }
//            }
//
//        }
//
//        System.out.println("\nupdated arrys");
//        for (int i = 0; i < r.length; i++) {
//            System.out.print(r[i]+" ");
//        }
//    }
//}
public class sortingarry {
    public static void main(String[] args) {
        int[] r = {18, 79, 8, 4, 97, 6, 10};
        System.out.println("initial arrys");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]+" ");
        }


        for (int i = 0; i < r.length-1; i++) {

            for (int j = 0; j < r.length-i-1; j++) {
                if (r[j] > r[j+1]) {

                    int temp = r[j];
                    r[j] = r[j+1];
                    r[j+1] = temp;

                }
            }

        }

        System.out.println("\nupdated arrys");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]+" ");
        }
    }
}