import java.util.Arrays;
import java.util.Scanner;
public class MayTinh {
    public void PhuongTrinhMayTinh() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so ");
        int Number = input.nextInt();
        System.out.println("Moi nhap phep tinh (+, -, *, /) hoac dau (=) de cho ra ket qua");
        String Calculate = input.next();

        while (!Arrays.asList("+", "-", "*", "/", "=").contains(Calculate)) {
            System.out.println("Vui long nhap lai phep tinh");
            Calculate = input.next();
        }

        int Result = 0;
        int DemSoLanLap = 0;


        // Neu ko nhap dau =
        while (!Calculate.equals("=")) {
            DemSoLanLap ++;
            // phep tinh cong
            if (Calculate.equals("+")) {
                if (Result == 0) {
                    Result = Result + Number;
                    System.out.println("Moi nhap so tiep theo ");
                    Number = input.nextInt();
                    Result = Result + Number;

                }
                else {
                    System.out.println("Moi nhap so tiep theo ");
                    Number = input.nextInt();
                    Result = Result + Number;
                }
            }
            // phep tinh tru
            else if (Calculate.equals("-")) {
                if (Result == 0) {
                    Result = Result + Number;
                    System.out.println("Moi nhap so tiep theo ");
                    Number = input.nextInt();
                    Result = Result - Number;
                }
                else {
                    System.out.println("Moi nhap so tiep theo ");
                    Number = input.nextInt();
                    Result = Result - Number;
                }
            }
            // phep tinh nhan
            else if (Calculate.equals("*")) {
                if (Result == 0) {
                    Result = Result + Number;
                    System.out.println("Moi nhap so tiep theo ");
                    Number = input.nextInt();
                    Result = Result * Number;
                }
                else {
                    System.out.println("Moi nhap so tiep theo ");
                    Number = input.nextInt();
                    Result = Result * Number;
                }
            }
            // phep tinh chia
            else {
                if (Result == 0) {
                    Result = Result + Number;
                    System.out.println("Moi nhap so tiep theo ");
                    Number = input.nextInt();
                    // Chặn người dùng nhập số 0 ngay lập tức
                    while (Number == 0) {
                        System.out.println(Result +" Không thể chia cho 0. Vui lòng nhập một số khác: ");
                        Number = input.nextInt();
                    }
                    Result = Result / Number;
                }
                else {
                    System.out.println("Moi nhap so tiep theo ");
                    Number = input.nextInt();
                    // Chặn người dùng nhập số 0 ngay lập tực
                    while (Number == 0) {
                        System.out.println(Result + " Không thể chia cho 0. Vui lòng nhập một số khác: ");
                        Number = input.nextInt();
                    }
                    Result = Result / Number;
                }
            }
            System.out.println("Ket qua hien tai la " + Result);
            System.out.println("Moi nhap phep tinh (+, -, *, /) hoac dau (=) de cho ra ket qua");
            Calculate = input.next();
            while (!Arrays.asList("+", "-", "*", "/", "=").contains(Calculate)) {
                System.out.println("Vui long nhap lai phep tinh");
                Calculate = input.next();
            }
            //System.out.println("Vong lap " + DemSoLanLap + " co ket qua la " + Result);
        }
        // Neu nhap dau =
        if (Result == 0 & DemSoLanLap == 0) {
            System.out.println("Ket qua Final la " + Number);
        }
        else {
            System.out.println("Ket qua Final la " + Result);
        }
    }
}
