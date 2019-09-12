public class Modul1Task3 {

    public static void main(String[] args) {
        //Expected 2
        System.out.println(findSquare(0, 0, 0, 4, 1, 3));
        System.out.println(findSquare(0, 0, 0, 4, 1, -3));
       // is not a triange, but a line
        System.out.println(findSquare(0, 0, 1, 1, 2, 2));
    }
    // if square cannt be find -1 is returned
    public static double findSquare(int x1, int y1, int x2, int y2, int x3, int y3) {
        double result = 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
        if (result == 0) {
            System.out.println("Is not a triange");
            return -1;
        }


        return result;
    }


}
