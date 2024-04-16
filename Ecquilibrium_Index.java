package Array;

class Ecquilibrium_Index {
	
	
	public static int ArrayEquilibrium(int arr[]) {
		
		int size=arr.length;
		
		int rs,ls;
		
		for(int i=0;i<size;i++) {
			ls=0;
			for(int j=0;j<=i;j++) {
				ls+=arr[j];
			}
			rs=0;
			for(int j=i+1;j<size;j++) {
				rs+=arr[j];
			}
			
			if(ls==rs) {
				return i;
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,1,2,4}; 
		
		int result=ArrayEquilibrium(arr);
		System.out.println(result);
	}

}
