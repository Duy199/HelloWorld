import java.util.Arrays;
import java.util.Scanner;
public class Array {
    int Max = 0;
    public int[] InputValueToArray () {
        int MaxArray = 0;
        int [] Array;
        //int ArrayOutput = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("moi nhap max index cua mot array");
        MaxArray = input.nextInt();
        System.out.println("Max index cua array la " + MaxArray);
        Array = new int[MaxArray];
        int Index = 0;
        while (Index < MaxArray) {
            System.out.println("nhap gia tri cua Index " + Index);
            Array[Index] = input.nextInt();
            System.out.println(Arrays.toString(Array));
            Index = Index + 1;
        }
        System.out.println("output cua Array vua nhap la " + Arrays.toString(Array));
        return Array;
    }
    public int[] SoLonNhat (int[] ArrayInputted) {
        int[] ArrayAdjusted;
        Max = 0;
        int Index = -1;
        for (int element : ArrayInputted) {
            if (element > Max) {
                Max = element;
            }
        }
        //Tim vi tri index cua Max
        System.out.println("Max cua Array A la: " + Max);
        for (int element : ArrayInputted) {
            if (Max == 0) {
                System.out.println("Dung lai vong lap");
            }
            else {
                Index = Index + 1;
                if (element == Max) {
                    System.out.println("Vi tri cua Max nam o index so " + Index);
                    ArrayInputted[Index] = 0;
                }
            }
        }
        System.out.println("Array moi vua tao la " + Arrays.toString(ArrayInputted));
        ArrayAdjusted = ArrayInputted;
        return ArrayAdjusted;
    }

    public int getMax() {
        return Max;
    }

    public void SortArray () {
        int[] A = InputValueToArray();
        A = SoLonNhat(A);
        int[] B = new int[A.length];
        int[] Array;
        int Max = 0;
        int Index = 0;
        int LastIndex = A.length - 1;
        int DemSo = 0;

        while (DemSo < A.length) {
            B[LastIndex] = getMax();
            LastIndex = LastIndex - 1;
            DemSo = DemSo + 1;
            A = SoLonNhat(A);
        }
        System.out.println("Array A dc sort tu nho toi lon la " + Arrays.toString(B));
    }
    //Que la oke lun hehehehehe
}

