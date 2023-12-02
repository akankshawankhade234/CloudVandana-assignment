package ShuffleNos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		Random r=new Random();
		for(int i=0;i<arr.length;i++) {
			int a=r.nextInt(arr.length);
			int temp=arr[a];
			arr[a]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
