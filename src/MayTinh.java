import javax.xml.transform.Result;
import java.util.Scanner;
public class MayTinh {
    public void PhuongTrinhMayTinh() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so ");
        int Number = input.nextInt();
        System.out.println("Moi nhap phep tinh (1. +, 2. -, 3. *, 4. /) hoac dau (=) de cho ra ket qua");
        int Calculate = input.nextInt();
        int Result = 0;
        // Neu ko nhap dau =
        while (Calculate < 5) {

            // phep tinh cong
            if (Calculate == 1) {
                Result = Result + Number;
                System.out.println(Result);
            }
            // phep tinh tru
            else if (Calculate == 2) {
                Result = Result - Number;
                //System.out.println(Result);
            }
            // phep tinh nhan
            else if (Calculate == 3) {
                Result = Result * Number;
                //System.out.println(Result);
            }
            // phep tinh chia
            else {
                Result = Result / Number;
                //System.out.println(Result);
            }

            System.out.println("Moi nhap so tiep theo ");
            Number = input.nextInt();

            System.out.println("Moi nhap phep tinh ");
            Calculate = input.nextInt();

        }
        // Neu nhap dau =
        if (Result == 0) {
            System.out.println("Ket qua la " + Number);
        }
        else {
            System.out.println("Ket qua la " + Result);
        }
    }
}
