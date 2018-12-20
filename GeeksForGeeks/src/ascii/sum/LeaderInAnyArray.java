package ascii.sum;

/*
 * Using moorey 
 */
public class LeaderInAnyArray {
	
	/*
	 * Algorithm :
	 * 
	 * 
	 * Let the array be A[] = 2, 2, 3, 5, 2, 2, 6

		Initialize maj_index = 0, count = 1
		Next element is 2, which is same as a[maj_index] => count = 2
		Next element is 3, which is different from a[maj_index] => count = 1
		Next element is 5, which is different from a[maj_index] => count = 0
		Since count = 0, change candidate for majority element to 5 => maj_index = 3, count = 1
		Next element is 2, which is different from a[maj_index] => count = 0
		Since count = 0, change candidate for majority element to 2 => maj_index = 4
		Next element is 2, which is same as a[maj_index] => count = 2
		Next element is 6, which is different from a[maj_index] => count = 1
		Finally candidate for majority element is 2
	 * 
	 */
	
	

	static int findCandidate(int a[], int size) {

		int leader_index = 0 , count =1;
		
		
		for(int i=1;i<a.length;i++) {
			
			if(a[leader_index] == a[i]) {
				
				count ++;
			}else {
				count --;
			}
			
			if(count == 0 ) {
				leader_index = i;
				count = 1;
			}
			
		}
	
	
	return a[leader_index];
	
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {3,3,3,3,3,3,3,4,2,4,4,2,4};
		System.out.println(findCandidate(a, a.length));
	}
}
