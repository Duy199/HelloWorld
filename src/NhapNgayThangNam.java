import java.util.Date;
import java.util.Scanner;
public class NhapNgayThangNam {
    int Day;
    int Month;
    int Year;
    public boolean NgayThangNam () {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap nam");
        Year = input.nextInt();
        System.out.println(("Nhap thang"));
        Month = input.nextInt();
        System.out.println("Nhap ngay");
        Day = input.nextInt();
        boolean NgayThangNamHopLe;
        if (Day > 0 && Day <= 31 && Month > 0 && Month <= 12 && Year > 0) {
            XacDinhNgay Ngay = new XacDinhNgay();
            int maxNgayTrongThang = Ngay.ngayTrongThang(Month, Year);
            if (Day <= maxNgayTrongThang) {
                System.out.println("=> Ngay " + Day + " la mot ngay hop le");
                System.out.println("dd/mm/yy: " + Day + "/" + Month + "/" + Year);
                NgayThangNamHopLe = true;
            } else {
                System.out.println("=> Ngay " + Day + " la mot ngay ko hop le");
                NgayThangNamHopLe = false;
            }
        }
        else {
            NgayThangNamHopLe = false;
            System.out.println("Ngay/thang/nam nhap ko hop le");
        }
        return NgayThangNamHopLe;
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }
}
