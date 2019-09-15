public class StartingPoint {
    public static void main(String[] args) {
        int a = 56;
        int b = 91;
        int c = 90;

        //print max
        if (a > b) {
            if (a > c) {
                System.out.println("a e maxim");
            } else {
                System.out.println("c e maxim");
            }
        } else if (b > c) {
            System.out.println("b e maxim");
        } else {
            System.out.println("c e maxim");
        }

        //daca 2 sunt maxime(egale), printeaza ambele
//        int max;
//        if (a > b) {
//            if (a > c) {
//                max = a;
//            } else {
//                max = c;
//            }
//        } else if (b > c) {
//            max = b;
//        } else {
//            max = c;
//        }
//
//        if (a == max) {
//            System.out.println("a e max");
//        }
//        if (b == max) {
//            System.out.println("b e max");
//        }
//        if (c == max) {
//            System.out.println("c e max");
//        }


    }
}
