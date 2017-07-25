import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void Ts(int[] A,int target) {
		int[] two = new int[2];
		for (int i = 0; i < A.length; i++) {
			if (A[i]<=target) {
				for (int j = i+1; j < A.length; j++) {
					if (A[i]+A[j]==target) {
						two[0] = i;
						two[1] = j;
						//System.out.println(i+j);
						//two[2] = 3;
					}
				}
			}
		}
	}
	public static int[] Ts2(int[] A ,int target) {
		int[] array = new int[2];
		
		Map<Integer, Integer> map  = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			map.put(A[i], i);
		}
		for (int i = 0; i < A.length; i++) {
			int second = target - A[i];
			if (map.containsKey(second)&&map.get(second)!=i) {
				array[0] = i;
				array[1] = map.get(second);
				//return array;
				break;
			}
		}
		return array;
	}
	public static int[] Ts3(int[] A,int target) {
		int[] array = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			int second = target - A[i];
			if (map.containsKey(second)) {
				//System.out.println(i);
				array[1] = i;
				array[0] = map.get(second);
			}else {
				map.put(A[i], i);
			}
			//System.out.println(i);
			
			
		}
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {1,11, 7, 2, 15};
		int[] test = Ts3(array, 13);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}

}
