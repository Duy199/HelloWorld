import java.util.Scanner;
public class XacDinhNamNhuan {
    public void xacDinhNamNhuan(){
        Scanner input = new Scanner(System.in);
        int Year = input.nextInt();
        if (Year % 400 == 0) {
            System.out.println("Nam " + Year + " la nam nhuan");

        }
        else {
            if (Year % 4 == 0 && Year % 100 != 0) {
                System.out.println("Nam " + Year + " la nam nhuan");
            }
            else {
                System.out.println("Nam " + Year + " ko phai la nam nhuan");

            }
        }
    }
}
