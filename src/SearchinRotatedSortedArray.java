
public class SearchinRotatedSortedArray {
	//二分法
	public static int  searchIn(int[] A,int target) {
		
		int count = A.length;
		int sta = 0;
		int end = count-1;
		for (int i = 0; i < count; i++) {
			System.out.println(i);
			int mind = (sta+end)/2;
			
			if (A[mind] == target) {
				return mind;
			}else if (A[mind]<target) {
				sta = mind +1;
			}else if (A[mind]>target) {
				end = mind -1;
			}else {
				return -1;
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] ={1,2,3,4,6,8,9};
		System.out.println(searchIn(A,1));

	}
	//public static int removeDuplicates2(int[] A)
	

}
