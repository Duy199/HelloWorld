import java.util.Scanner;
public class TienDien {
    static int TinhTienDien(int kwh) {
        int Tien = kwh * 1480;
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
