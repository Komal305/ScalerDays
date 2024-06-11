package Q3;

import java.util.Arrays;

public class Q3CountSort {

	public static void main(String[] args) {
		int[] A = {1,3,1};
		int max=0;
		for(int a:A) {
			max= Math.max(a, max);
		}
		int[] count=new int[max+1];
		for(int a:A) {
			count[a] += 1;
		}
		int k=0;
		for(int i=0; i<=max; i++) {
			for(int j=0; j<count[i]; j++)
				A[k++]=i;
		}
		
		System.out.println(Arrays.toString(A));
	}

}
