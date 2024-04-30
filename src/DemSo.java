import java.util.Scanner;
public class DemSo {
    static int NhapSoNguyenDuong () {
        System.out.println("Moi Nhap so Nguyen");
        Scanner input = new Scanner(System.in);
        int SoNguyen = input.nextInt();
        while (SoNguyen < 1) {
            System.out.println(SoNguyen + " ko phai la so Nguyen Duong");
            SoNguyen = input.nextInt();
        }
        System.out.println(SoNguyen + " la so nguyen Duong");
        System.out.println("\n");
        return SoNguyen;
    }
    public void DemCacUocSoCuaSoNguyen() {
        int SoNguyenDuong = NhapSoNguyenDuong();
        System.out.println("Dem cac uoc so cua " + SoNguyenDuong);
        int DemUoc = 0;
        for (int i = 1; i <= SoNguyenDuong; i++) {
            if (SoNguyenDuong % i == 0) {
                DemUoc ++;
                System.out.println(i);
            }
        }
        System.out.println("=> So luong cua cac uoc so cua so " + SoNguyenDuong+ " la " + DemUoc);
    }
    public void LietKeCacUocSoLe() {
        int SoNguyenDuong = NhapSoNguyenDuong();
        System.out.println("Liet ke cac uoc so le cua so " + SoNguyenDuong);
        for (int i = 1; i <= SoNguyenDuong; i++) {
            if (SoNguyenDuong % i != 0) {
                System.out.println(i);
            }
        }
    }
    public void XacDinhSoNguyenTo() {
        int SoNguyen = NhapSoNguyenDuong();
        while (SoNguyen == 1) {
            System.out.println("Dieu kien cua so nguyen to la so nguyen duong phai lon 1");
            SoNguyen = NhapSoNguyenDuong();
        }
        int DemUoc = 0;
        for (int i = 1; i <= SoNguyen; i++) {
            if (SoNguyen % i == 0) {
                DemUoc ++;
                System.out.println(i);
            }
        }
        if (DemUoc == 2) {
            System.out.println(SoNguyen + " la so nguyen to");
        }
        else {
            System.out.println(SoNguyen + " ko phai la so nguyen to");
        }
    }
}


