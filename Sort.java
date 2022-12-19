package sort;

public class Sort {
	
	public static void BubbleSort(int []arr)
	{
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void SelectionSort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j])
					min=j;
			}
			
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
						
		}
	}
	
	
	public static void InsertionSort(int []arr) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j!=i;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static int partition(int[]arr,int low,int high) {
		
		int pivotvalue=arr[high];
		
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivotvalue) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			
			i++;
			int temp=arr[i];
			arr[i]=pivotvalue;
			arr[high]=temp;
			
			return i;
	}
	
	public static void QuickSort(int[]arr,int low,int high) {
		if(low>=high)
			return;
		
		int pivotlocation=partition(arr,low,high);
		QuickSort(arr, low, pivotlocation-1);
		QuickSort(arr, pivotlocation+1, high);
	}
	
	public static void merge(int[]arr,int si,int mid,int ei) {
		int[]merged=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<arr[idx2]) {
				merged[x++]=arr[idx1++];
			}else {
				merged[x++]=arr[idx2++];
			}
		}
		
		while(idx1<=mid) {
			merged[x++]=arr[idx1++];
		}
		
		while(idx2<=ei) {
			merged[x++]=arr[idx2++];
		}
		
		for(int i=0,j=si;i<merged.length;i++,j++) {
			arr[j]=merged[i];
		}
	}
	
	
	public static void MergeSort(int[]arr,int si,int ei) {
		if(si>=ei)
			return;
		
		int mid=si+(ei-si)/2;
		MergeSort(arr, si, mid);
		MergeSort(arr, mid+1, ei);
		merge(arr,si,mid,ei);
	}
	
	
	public static void HeapSort(int[]arr,int len) {
		if(len<=1)
			return;
		
		for(int i=len-1;i>0;i--) {
			if(arr[i]>arr[(i-1)/2]){
				int temp=arr[i];
				arr[i]=arr[(i-1)/2];
				arr[(i-1)/2]=temp;
			}
		}
		
		int temp=arr[0];
		arr[0]=arr[len-1];
		arr[len-1]=temp;
		
		HeapSort(arr, --len);
		
	}
	
	

}
