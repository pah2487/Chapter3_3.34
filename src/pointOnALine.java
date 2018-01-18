import java.util.Scanner;
public class pointOnALine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 3 points (x1 y1 x2 y2 x3 y3)");

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        //first point
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        //second point
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        //third point
        double slope1 = (y1+y2)/(x1+x2); //line created by original 2 points
        double slope2 = (y2+y3)/(x2+x3); //line created with third point

        if ((x1<x3 && x3<x2 && y1<y3 && y3<y2) || (x1>x3 && x3>x2 && y1>y3 && y3>y2)) {
            if (slope2 == slope1) {
                System.out.println("(" + x3 + ", " + y3 + ") is on the line segment from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
            } else {
                System.out.println("(" + x3 + ", " + y3 + ") is not on the line segment from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
            }
        }else{
            System.out.println("(" + x3 + ", " + y3 + ") is not on the line segment from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
        }
    }
}

