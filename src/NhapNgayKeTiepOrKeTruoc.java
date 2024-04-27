import java.util.Scanner;
public class NhapNgayKeTiepOrKeTruoc {
    public void NgayKeTiepOrNgayKeTruoc() {
        System.out.println("Vui long nhap ngay/thang/nam cho hien tai");
        NhapNgayThangNam NgayThangNam = new NhapNgayThangNam();

        // Goi method ra xac dinh ngay thang nam co hop le hay ko
        boolean NgayThangNamHopLe = NgayThangNam.NgayThangNam();

        // Goi method ra de nhap ngay thang nam
        int NamHienTai = NgayThangNam.getYear();
        int ThangHienTai = NgayThangNam.getMonth();
        int NgayHienTai = NgayThangNam.getDay();

        // Neu ngay thang nam nhap hop le
        if (NgayThangNamHopLe == true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Vui long mot nhap ngay moi trong thang " + ThangHienTai + " cua nam " + NamHienTai);
            int NgayMoi = input.nextInt();
            // Neu ngay moi nhap hop le
            if (NgayMoi > 0 && NgayMoi <= 31) {
                if (NgayMoi > NgayHienTai) {
                    System.out.println("Ngay " + NgayMoi + " la ngay ke tiep cua ngay " + NgayHienTai + " trong thang " + ThangHienTai + " cua Nam " + NamHienTai );
                }
                else if (NgayMoi < NgayHienTai) {
                    System.out.println("Ngay " + NgayMoi + " la ngay ke truoc cua ngay " + NgayHienTai + " trong thang " + ThangHienTai + " cua Nam " + NamHienTai );
                }
                else {
                    System.out.println("ko co ngay ke tiep hoac ke truoc do 2 ngay nhap = nhau");
                }
            }
            // Neu ngay moi nhap ko hop le
            else {
                System.out.println("Vui long nhap lai ngay moi");
            }
        }
        // Neu ngay thang nam nhap ko hop le
        else {
            System.out.println("Vui long thoat ra nhap lai ngay hien tai ");
        }

    }


}
