import java.util.Scanner;

public class phuongtrinhbac2 {
    public void phuongTrinhBac2() {
        // ax^2+bx+c = 0

        //System.out.println("Bai tap phuong trinh bac 2");
        Scanner input = new Scanner(System.in);
        float a = input.nextInt();
        float b = input.nextInt();
        float c = input.nextInt();

        float x = (float) Math.pow(b,2)  - (4 * a * c);

        if (x<0){
            System.out.println("PT vo nghiem");
        }
        else if (x==0) {
            x = -(b/2*a);
            System.out.println("PT co nghiem kep " + x);

        }
        else  {
            System.out.println("PT co 2 nghiem phan biet");
            float x1 = (float) (-b + Math.sqrt(x))/(2*a);
            float x2 = (float) (-b - Math.sqrt(x))/(2*a);

        }


    }



}
