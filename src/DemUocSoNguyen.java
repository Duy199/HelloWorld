import java.util.Scanner;
public class DemUocSoNguyen {
    static int NhapSoNguyen () {
        System.out.println("Moi Nhap so Nguyen");
        Scanner input = new Scanner(System.in);
        int SoNguyen = input.nextInt();
        return SoNguyen;
    }
    public void XacDinhUocSoNguyen() {
        int SoNguyen = NhapSoNguyen();
        while (SoNguyen < 1) {
            SoNguyen = NhapSoNguyen();
        }
        int DemUoc = 0;
        System.out.println("Cac so chia het cho " + SoNguyen);
        for (int i = 1; i <= SoNguyen; i++) {
            if (SoNguyen % i == 0) {
                DemUoc ++;
                System.out.println(i);
            }
        }
        System.out.println("=> So luong cua cac uoc so cua so " + SoNguyen + " la " + DemUoc);
    }
}


