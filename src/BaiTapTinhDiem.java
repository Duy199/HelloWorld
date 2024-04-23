import java.util.Scanner;
public class BaiTapTinhDiem {
    public void TinhDiem() {
        Scanner input = new Scanner(System.in);
        double soDiem = input.nextDouble();
        if (soDiem <= 10.00 && soDiem >= 8.5) {
            System.out.println("Hoc sinh dat diem A");
        }
        else if (soDiem <= 8.4 && soDiem >= 7.0) {
            System.out.println("Hoc sinh dat diem B");

        }
        else if (soDiem <= 6.9 && soDiem >= 5.5) {
            System.out.println("Hoc sinh dat diem C");
        }
        else if (soDiem <= 5.4 && soDiem >= 4.0) {
            System.out.println("Hoc sinh dat diem D");
        }
        else {
            System.out.println("Hoc sinh dat diem F");
        }
    }
}
