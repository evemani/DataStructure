package ascii.sum;

public class MinimumNumber {

	
	private static void findminimumDistance(int[] inputArray, int x,int y){
		
		
		int min_dist = Integer.MAX_VALUE;
		for(int i=0 ; i<inputArray.length; i++) {
			for(int j = i+1;j<inputArray.length;j++) {
				if(inputArray[i] == x && inputArray[j] == y || inputArray[j] == x && inputArray[i] == y  && min_dist > Math.abs(i - j)) {
					 min_dist = Math.abs(i - j) ;
					}
				}
			}
		
		System.out.println(min_dist);
		}
	
	
	private static void findMinimumDistanceTricky(int[] inputArray, int x, int y) {
		int previousIndex = 0;
		for(int i: inputArray) {
			
			if(inputArray[i] == x ) {
				previousIndex = i;
			
			}
		}
		
		int min_dist = Integer.MAX_VALUE;
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i] == x || inputArray[i] == y) {
				

				if(inputArray[previousIndex] != inputArray[i] && (i - previousIndex) < min_dist) {
					min_dist = i-previousIndex;
					previousIndex = i;
				}else
					previousIndex = i;
				
				
				/*if(min_dist>minDistance) {
					min_dist = minDistance;
				}*/
			}
		}
		
		System.out.println(min_dist);
	}
		
	
	
	
	public static void main(String[] args) {
		int[] inputArray = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4,  3};
		//findminimumDistance(inputArray, 3, 6);
		findMinimumDistanceTricky(inputArray,3,6);
	}
}
