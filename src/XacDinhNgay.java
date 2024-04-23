import java.util.Scanner;

public class XacDinhNgay {
    public void ngayTrongThang() {
        Scanner input = new Scanner(System.in);
        int Month = input.nextInt();
        if (Month != 2) {
            int SoNgay;
            if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {

                System.out.println("Thang " + Month + " co 30 ngay");
            }
            else {

                System.out.println("Thang " + Month + " Co 31 ngay ");
            }
        }
        else {
            boolean laNamNhuan;
            XacDinhNamNhuan namNhuan = new XacDinhNamNhuan();

            laNamNhuan = namNhuan.xacDinhNamNhuan();
            if (laNamNhuan == true) {
                System.out.println("=> Thang 2 co 29 ngay");

            }
            else {System.out.println("=> Thang 2 co 28 ngay");
            }

            }
        }
    }

