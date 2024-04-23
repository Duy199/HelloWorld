import java.util.Scanner;
public class TienDien {
    static int TinhTienDien(int kwh) {
        int Tien;
        if (kwh >= 0 && kwh <= 50) {
            Tien = kwh * 1480;
        }
        else if (kwh >= 51 && kwh <= 100) {
            Tien = kwh * 1533;
        }
        else if (kwh >= 101 && kwh <= 200) {
            Tien = kwh * 1786;
        }
        else if (kwh >= 201 && kwh <= 300) {
            Tien = kwh * 2242;
        }
        else {
            Tien = kwh * 2503;
        }
        return Tien;

    }
    public void NhapChiSoDien() {
        Scanner input = new Scanner(System.in);
        int kwh1 = input.nextInt();
        int kwh2 = input.nextInt();
        if (kwh1 <= kwh2) {
            System.out.println("Tien dien chi so cu: " + TinhTienDien(kwh1));
            System.out.println("Tien dien chi so moi: " + TinhTienDien(kwh2));
        }
        else {
            System.out.println("chi so dien cu phai " + "\"<=\"" + " so dien moi");
        }
    }
}
