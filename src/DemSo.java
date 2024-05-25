import javax.swing.tree.FixedHeightLayoutCache;
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
    public void NhapSoThucKhac_0() {
        Scanner input = new Scanner(System.in);
        double SoThuc = input.nextDouble();
        while (SoThuc != 0) {
            System.out.println(SoThuc + " la so thuc vi no khac 0");
            SoThuc = input.nextDouble();
        }
        System.out.println(SoThuc + " ko phai la so thuc vi no bang 0");
        System.out.println("ket thuc chuong trinh");
    }
    public void DemSoLuongCacChuSoLe () {
        int SoNguyen = NhapSoNguyenDuong();
        int DemSoLe = 0;
        for (int i = 1; i <= SoNguyen; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                DemSoLe ++;
            }
        }
        System.out.println(SoNguyen + " co total " + DemSoLe + " chu so le");
    }
    public void TinhTongSoLuongCacChuSoChan() {
        int SoNguyen = NhapSoNguyenDuong();
        int DemSoChan = 0;
        int TongSoLuong = 0;
        for (int i = 1; i <= SoNguyen; i++) {
            if (i % 2 == 0) {
                DemSoChan ++;
                TongSoLuong = TongSoLuong + DemSoChan;
                System.out.println(TongSoLuong);
            }
        }
        System.out.println(SoNguyen + " co toal " + DemSoChan + " chu so chan");
        System.out.println("Tong so luong tu 1 den " + SoNguyen + " la " + TongSoLuong);
    }
    public void HinhChuNhat () {
        System.out.println("Moi ban nhap chieu dai");
        int m = NhapSoNguyenDuong();
        System.out.println("Moi ban nhap chieu cao");
        int n = NhapSoNguyenDuong();
        while (n >= m) {
            System.out.println("chieu cao phai < or = chieu dai " + "\n" + "Moi ban nhap lai");
            n = NhapSoNguyenDuong();
        }
        StringBuffer Length = new StringBuffer("*");
        System.out.println("Tinh chieu dai ");
        for (int Count = 1; Count < m; Count++) {
            Length.append(" *");
        }
        System.out.println("Chieu dai hcn : " + Length);
        System.out.println("Chieu cao hcn : " + n);
        //Build ra hinh chu nhat
        System.out.println("Hinh chu nhat da build xong: ");
        for (int Count = 0; Count < n; Count++) {
            System.out.println(Length);
        }
    }
    public void HinhChuNhatRong() {
        System.out.println("Moi ban nhap chieu dai");
        int m = NhapSoNguyenDuong();
        System.out.println("Moi ban nhap chieu cao");
        int n = NhapSoNguyenDuong();
        while (n >= m) {
            System.out.println("chieu cao phai < or = chieu dai " + "\n" + "Moi ban nhap lai");
            n = NhapSoNguyenDuong();
        }
        // Chieu dai empty
        System.out.println("Tính chiều dài bị rỗng ở giữa");
        StringBuffer LengthEmpty = new StringBuffer("*");
        for (int Count = 1; Count <= m; Count++) {
            if (Count == 1 || Count < m) {
                LengthEmpty.append(" ");
            }
            else {
                LengthEmpty.append("*");
            }
        }
        System.out.println("Chiều dài bị rỗng ở giữa là: " + LengthEmpty);
        // Chieu dai ko bi rong
        StringBuffer LengthNormal = new StringBuffer("*");
        System.out.println("Tính chiều dài ko bị rỗng");
        for (int Count = 1; Count < m; Count ++) {
            LengthNormal.append(" *");
        }
        System.out.println("Chiều dài ko bị rỗng là: " + LengthNormal);
        System.out.println(LengthEmpty);
        System.out.println(LengthNormal);

    }

}


