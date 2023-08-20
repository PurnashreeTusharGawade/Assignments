public class difference {
	public static void sortarr(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {7, 9, 5, 6, 3, 2};
		sortarr(arr);
		int a=arr[arr.length-1];
		int b=arr[arr.length-2];
		System.out.print(a-b);
	}
}



