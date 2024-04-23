import java.util.Scanner;
public class XacDinhNamNhuan {
    public boolean xacDinhNamNhuan(){
        Scanner input = new Scanner(System.in);
        int Year = input.nextInt();
        boolean laNamNhuan;
        if (Year % 400 == 0) {
            System.out.println("Nam " + Year + " la nam nhuan");
            laNamNhuan = true;
        }
        else {
            if (Year % 4 == 0 && Year % 100 != 0) {
                System.out.println("Nam " + Year + " la nam nhuan");
                laNamNhuan = true;
            }
            else {
                System.out.println("Nam " + Year + " ko phai la nam nhuan");
                laNamNhuan = false;

            }
        }
        return laNamNhuan;
    }
}
