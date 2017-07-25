import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {
	public static int removeDuplicates(int[] A){
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (!set.contains(A[i])) {
				set.add(A[i]);
				A[count++] = A[i];
			}
		}
		return count;
	}
	public static int removeDuplicates2(int[] A){
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (count ==0 || A[i]!=A[count-1]) {
				A[count++] = A[i];
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int A[] = {1,1,2,4};
	int count = removeDuplicates(A);
	System.out.println(count);

	}
}
