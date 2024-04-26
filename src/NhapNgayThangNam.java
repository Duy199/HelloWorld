import java.util.Scanner;
public class NhapNgayThangNam {
    int Year;
    int Month;
    int Day;
    public void NgayThangNam (){
        Scanner input = new Scanner(System.in);
        Year = input.nextInt();
        Month = input.nextInt();
        Day = input.nextInt();
        XacDinhNgay Ngay = new XacDinhNgay();
        int maxNgayTrongThang = Ngay.ngayTrongThang(Month, Year);

        if (Day > 0 && Day <= maxNgayTrongThang && Month > 0 && Month <= 12 && Year >0) {
           System.out.println(Day + " la mot ngay hop le");
           System.out.println("dd/mm/yy: " + Day + "/" + Month + "/" + Year);
        }
        else {
            System.out.println(Day + " la mot ngay ko hop le");
        }

    }
    public int HaveDay() {
        return Day;
    }
    public int HaveMonth() {
        return  Month;
    }
    public int HaveYear() {
        return Year;
    }
}
