import java.util.Scanner;
public class DemUocSoNguyen {
    public void XacDinhUocSoNguyen() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so Nguyen");
        int SoNguyen = input.nextInt();
        while (SoNguyen < 1) {
            SoNguyen = input.nextInt();
        }
        int DemUoc = 0;
        System.out.println("Uoc so cua " + SoNguyen);
        for (int i = 1; i <= SoNguyen; i++) {
            if (SoNguyen % i == 0) {
                DemUoc ++;
                System.out.println(i);
            }

        }
    }
}


