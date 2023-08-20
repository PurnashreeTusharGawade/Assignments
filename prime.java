	import java.util.*;
	public class prime {
		public static void main(String[] args) {
			int arr[]= {2, 3, 4, 5, 6, 7, 8, 9, 10};
			ArrayList<Integer> arrLst=new ArrayList<Integer>();
			for(int i=0;i<arr.length;i++) {
				int n=arr[i];
				int count=0;
				for(int j=1;j<=n;j++) {
					if(n%j==0) {
						count++;
					}
				}
				if(count==2) {
					arrLst.add(n);
				}
			}
			System.out.print(arrLst.size());
		}
	}