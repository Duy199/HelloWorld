import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public int[] InputValueToArray () {
        int MaxArray = 0;
        //int ArrayOutput = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("moi nhap max index cua mot array");
        MaxArray = input.nextInt();
        System.out.println("Max index cua array la " + MaxArray);
        int[] Array = new int[MaxArray];
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
    public int[] SoLonNhat () {
        int[] arrayA = InputValueToArray();
        int Max = 0;
        int IndexA = -1;
        for (int element : arrayA) {
            if (element > Max) {
                Max = element;
            }
        }
        //Tim vi tri index cua Max
        System.out.println("Max cua Array A la: " + Max);
        for (int element : arrayA) {
            if (element == Max) {
                IndexA = IndexA + 1;
            }
        }
        return arrayA;
    }
    public void SortArray () {
        int[] arrayA = InputValueToArray();
        int[] arrayB = new int[arrayA.length];
        //System.out.printf(Arrays.toString(arrayB));
        int DemSo = 0;
        int IndexA = 0;
        int LastIndexA = 0;
        int IndexB = arrayB.length;
        int Max = 0;
        while (DemSo < arrayA.length) {
            for (int element : arrayA) {
                if (element > Max) {
                    Max = element;
                    arrayA[IndexA] = Max;
                    IndexA = IndexA + 1;
                }
                else{
                    LastIndexA = IndexA - 1;
                    arrayA[LastIndexA] = Max;
                }
            }
            IndexB = IndexB - 1;
            arrayB [IndexB] = Max;
            arrayA[LastIndexA] = 0;
            Max = Max - Max;
            IndexA = IndexA - IndexA;
            LastIndexA = LastIndexA - LastIndexA;
            DemSo = DemSo + 1;
        }
        System.out.printf("Array sort tu nho toi lon la: " + Arrays.toString(arrayB));
    }
}
