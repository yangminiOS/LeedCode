import javax.imageio.event.IIOReadWarningListener;

public class Rank {
	
	public static void commit(int[] A) {
		for (int i = 0; i < A.length; i++) {
			//int temp = 0;
			for (int j = i+1; j < A.length; j++) {
				if (A[i]>A[j]) {
					int temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				}
			}
			
			
		}
		for (int j = 0; j < A.length; j++) {
			System.out.println(A[j]);
		}
	}
	
	public static void into(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int temp = A[i];
			int j  = i-1;
			
			while (j>=0 &&temp<A[j]) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = temp;	
		}
		int count = 1;
		for (int i = 1; i < A.length; i++) {
			if (A[i]-A[i-1]==1) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void maopao(int[] A) {
		for (int i = 0; i < A.length-1; i++) {
			for (int j = 0; j < A.length-i; j++) {
				if (A[j]>A[j+1]) {
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12,3,15,2,5,15,9,4};
		//commit(array);
		into(array);
	}

}
