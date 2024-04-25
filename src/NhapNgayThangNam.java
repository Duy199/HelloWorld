import java.util.Scanner;
public class NhapNgayThangNam {
    public void NgayThangNam (){
        Scanner input = new Scanner(System.in);
        int Year = input.nextInt();
        int Month = input.nextInt();
        int Day = input.nextInt();
        XacDinhNgay Ngay = new XacDinhNgay();
        int maxNgayTrongThang = Ngay.ngayTrongThang(Month, Year);

        if (Day > 0 && Day <= maxNgayTrongThang && Month > 0 && Month <= 12 && Year >0) {
           System.out.println("dd/mm/yy: " + Day + "/" + Month + "/" + Year);
           System.out.println(Day + " la mot ngay hop le");
        }
        else {
            System.out.println(Day + " la mot ngay ko hop le");
        }

    }
}
