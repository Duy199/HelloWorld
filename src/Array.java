import java.util.Arrays;
import java.util.Scanner;
public class Array {
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
        System.out.println("output cuoi cung cua 1 array la " + Arrays.toString(Array));
        return Array;
    }
    public int[] SoLonNhat (int[] ArrayInputted) {
        int[] ArrayAdjusted;
        int Max = 0;
        int Index = -1;
        for (int element : ArrayInputted) {
            if (element > Max) {
                Max = element;
            }
        }
        //Tim vi tri index cua Max
        System.out.println("Max cua Array A la: " + Max);
        for (int element : ArrayInputted) {
            Index = Index + 1;
            if (element == Max) {
                System.out.println("Vi tri cua Max nam o index so " + Index);
                ArrayInputted[Index] = 0;
            }
        }
        System.out.println("Array moi vua tao la " + Arrays.toString(ArrayInputted));
        ArrayAdjusted = ArrayInputted;
        return ArrayAdjusted;
    }
}

