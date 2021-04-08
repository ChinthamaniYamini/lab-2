package lab2;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args) {
		System.out.println("Enter the value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0;i < num;i++) {
        	arr[i] = sc.nextInt();
        }
        sc.close();
        ReverseArray obj= new ReverseArray ();
        int temp[] = new int[num];
        temp = obj.getSorted(arr);
        for(int i = 0;i < num;i++) {
              System.out.print(temp[i]+" ");
        }

	}
	public int[] getSorted(int arr[]) {
		for(int i = 0;i < arr.length;i++) {
			int sum = 0;
			while(arr[i] > 0) {
				int temp = arr[i] % 10;
				sum = (sum*10) + temp;
				arr[i] = arr[i] / 10;
			}
			arr[i] = sum;
		}
		Arrays.sort(arr);
		return arr;
	}

}
