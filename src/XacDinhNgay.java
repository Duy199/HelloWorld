import java.util.Arrays;
import java.util.Scanner;

public class XacDinhNgay {
    public int ngayTrongThang(int Month, int Year) {
        int soNgay = 0;

        if (Month != 2) {
            if (Arrays.asList(4, 6, 9, 11).contains(Month)) {
                XacDinhNamNhuan namNhuan = new XacDinhNamNhuan();
                if(namNhuan.xacDinhNamNhuan(Year)){
                    soNgay = 30;
                }
            }
            else {
                XacDinhNamNhuan namNhuan = new XacDinhNamNhuan();
                if(namNhuan.xacDinhNamNhuan(Year)) {
                    soNgay = 31;
                }
            }
        }
        else {
            XacDinhNamNhuan namNhuan = new XacDinhNamNhuan();
            if (namNhuan.xacDinhNamNhuan(Year)) {
                soNgay = 29;

            }
            else {
                soNgay = 28;
            }

            }
        return soNgay;
        }
    }

