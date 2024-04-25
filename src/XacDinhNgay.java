import java.util.Scanner;

public class XacDinhNgay {
    public int ngayTrongThang(int Month, int Year) {

        int soNgay;
        if (Month != 2) {
            if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
                System.out.println("Thang " + Month + " chi co 30 ngay");
                soNgay = 30;
            }
            else {

                System.out.println("Thang " + Month + " chi co 31 ngay ");
                soNgay = 31;
            }
        }
        else {
            boolean laNamNhuan;
            XacDinhNamNhuan namNhuan = new XacDinhNamNhuan();
            laNamNhuan = namNhuan.xacDinhNamNhuan(Year);

            if (laNamNhuan == true) {
                System.out.println("=> Thang 2 chi co 29 ngay");
                soNgay = 29;

            }
            else {
                System.out.println("=> Thang 2 chi co 28 ngay");
                soNgay = 28;
            }

            }
        return soNgay;
        }
    }

