import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Point2D Test ");
            System.out.println("2. Point3D Test ");
            System.out.println("0. Exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    Point2DTest();
                    break;
                case 2:
                    Point3DTest();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("just input 0 to 2.");
                    break;
            }
        }
    }

    public static void Point2DTest(){
        Point2D p2d = new Point2D();
        System.out.println(p2d);

        p2d = new Point2D(1,2);
        System.out.println(p2d);


    }

    public static void Point3DTest(){
        Point3D p3d = new Point3D();
        System.out.println(p3d);

        p3d = new Point3D(1,2,3);
        System.out.println(p3d);
    }


}
