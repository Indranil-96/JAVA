package Array;

public class Merge2Sorted_Array {
	
	public static int[] merge(int[] arr1, int [] arr2) {
		
		int length=arr1.length+arr2.length;
		
		int arr3[]= new int[length];
		
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length) {
			arr3[j]=arr2[j];
			j++;
			k++;
		}
		
		return arr3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,4,6,10,13};
		int arr2[] = {2,5,7,9};
		int result[]=merge(arr1,arr2);
		
		for(int element:result) {
			System.out.print(element+" ");
		}
	}

}
