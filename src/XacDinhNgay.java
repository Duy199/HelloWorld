import java.util.Arrays;
import java.util.Scanner;

public class XacDinhNgay {
    public int ngayTrongThang(int Month, int Year) {
        int soNgay = 0;
        XacDinhNamNhuan namNhuan = new XacDinhNamNhuan();
        if (Month != 2) {
            if (Arrays.asList(4, 6, 9, 11).contains(Month)) {

                namNhuan.xacDinhNamNhuan(Year);
                System.out.println("=> Thang " + Month + " co 30 ngay");
                soNgay = 30;

            }
            else {
                namNhuan.xacDinhNamNhuan(Year);
                System.out.println("=> Thang " + Month + " co 31 ngay");
                soNgay = 31;

            }
        }
        else {

            if (namNhuan.xacDinhNamNhuan(Year)) {
                soNgay = 29;
                System.out.println("=> Thang " + Month + " co 29 ngay");
            }
            else {
                System.out.println("=> Thang " + Month + " co 28 ngay");
                soNgay = 28;
            }
        }
        return soNgay;
        }
    }

