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
        if (NgayThangNamHopLe) {
            // Goi method xac dinh max ngay trong thang
            XacDinhNgay MaxNgay = new XacDinhNgay();
            // Khai bao ngay ke tiep va ngay ke truoc
            int NgayKeTiep = 0;
            int NgayKeTruoc = 0;
            // Khai bao thang ke tiep va thang ke truoc
            int ThangKeTiep = 0;
            int ThangKeTruoc = 0;
            // Khai bao thang Nam ke tiep va nam ke truoc
            int NamKeTiep = 0;
            int NamKeTruoc = 0;

            // Neu ngay hien tai < Max ngay trong thang
            if (NgayHienTai < MaxNgay.ngayTrongThang(ThangHienTai, NamHienTai)) {
                NgayKeTiep = NgayHienTai + 1;
                NgayKeTruoc = NgayHienTai - 1;
                System.out.println("dd/mm/yy ke tiep: " + NgayKeTiep + "/" + ThangHienTai + "/" + NamHienTai);
                System.out.println("dd/mm/yy ke truoc: " + NgayKeTruoc + "/" + ThangHienTai + "/" + NamHienTai);
            }
            // Neu ngay hien tai >= Max Ngay trong thang
            else {
                // Neu la ngay cuoi nam
                if (ThangHienTai < 12) {
                    NgayKeTiep = 1;
                    ThangKeTiep = ThangHienTai + 1;
                    NgayKeTruoc = ThangHienTai - 1;
                    ThangKeTruoc = ThangHienTai - 1;
                    System.out.println("dd/mm/yy ke tiep: " + NgayKeTiep + "/" + ThangKeTiep + "/" + NamHienTai);
                    System.out.println("dd/mm/yy ke truoc: " + NgayKeTruoc + "/" + ThangKeTruoc + "/" + NamHienTai);
                }
                // Neu la ngay trong nam
                else {
                    NgayKeTiep = 1;
                    ThangKeTiep = 1;
                    NamKeTiep = NamHienTai + 1;
                    NgayKeTruoc = NgayHienTai - 1;
                    ThangKeTruoc = ThangHienTai;
                    NamKeTruoc = NamHienTai;
                    System.out.println("dd/mm/yy ke tiep: " + NgayKeTiep + "/" + ThangKeTiep + "/" + NamKeTiep);
                    System.out.println("dd/mm/yy ke truoc: " + NgayKeTruoc + "/" + ThangKeTruoc + "/" + NamKeTruoc);
                }

            }

        }
        // Neu ngay thang nam nhap ko hop le
        else {
            System.out.println("Vui long thoat ra nhap lai ngay hien tai ");
        }

    }


}
