public class Sort {
    public static void main(String[] args) {

        int a = 5;
        int b = -4;
        int c = 78;

        //print a, b, c  sorted
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(c + "," + b + "," + a);
                } else {
                    System.out.println(b + "," + c + "," + a);
                }
            } else {
                System.out.println(b + "," + a + "," + c);
            }
        } else if (b > c) {
            if (a > c) {
                System.out.println(c + "," + a + "," + b);
            } else {
                System.out.println(a + "," + c + "," + b);
            }
        } else {
            System.out.println(a + "," + b + "," + c);
        }
    }
}
