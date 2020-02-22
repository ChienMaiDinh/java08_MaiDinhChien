package homework;

public class Ex04 {
	public static void main(String[] args) {
		int arr[] = {5,1,9,11,20,19,17,21,30};
		quickSort(arr, 0 , arr.length-1);
		showArr(arr);
		findMaxOddTwo(arr);
	}

	private static void findMaxOddTwo(int[] arr) {
		int count=0;
		for (int i = arr.length-1; i>0; i--) {
			if(arr[i]%2!=0) {
				count++;
				if(count==2) {
					System.out.println("number odd max second is : "+arr[i]);
				}
			}
		}
	}

	private static void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

	private static void quickSort(int[] arr, int indexBf, int indexAt ) {
		if(indexBf<indexAt) {
			// dieu kien de dung chuong trinh, index truoc=sau sort 1 so
			int locateIndex = swapAndFindPatition(arr , indexBf, indexAt);
			quickSort(arr, indexBf, locateIndex-1);
			quickSort(arr, locateIndex+1, indexAt);
		}
	}

	private static int swapAndFindPatition(int[] arr, int indexBf, int indexAt) {
		int pivot=arr[indexAt];
		int i=indexBf-1; //index be nhat ben ngoai mang
		for (int j = indexBf; j < indexAt; j++) {
			if(arr[j]<pivot) {
				i++; // thu tu phan tu 
				swap(arr,j,i); // swap arr[i] va arr[j]
			}
		}
		swap(arr,i+1,indexAt);//swap arr[i+1] va pivot
		return i+1;
	}

	private static void swap(int[] arr, int j, int i) {
		 int temp = arr[i]; 
         arr[i] = arr[j]; 
         arr[j] = temp;
	}
}
