package Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Remove_Duplicates {

	public static int[] removeduplicates(int[] nums) {
		int temp[]=new int[nums.length];
		int j=0;
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i] != nums [i+1]) {
				temp[j++]=nums[i];
			}
		}
		
		temp[j++]=nums[nums.length-1];
		return temp;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader IO = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(IO);

		System.out.println("Enter the length of the array");
		int length=Integer.parseInt(BR.readLine());

		int arr[] = new int[length];
		System.out.println("Enter the array element");
		for(int i=0;i<length;i++) {
			arr[i]=Integer.parseInt(BR.readLine());
		}
		
		int[] result=removeduplicates(arr);
		for(int element:result) {
			System.out.println(element);
		}
	}

}
