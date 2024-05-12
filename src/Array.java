import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public void InputValueToArray () {
        int MaxArray = 0;
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
    }
}
