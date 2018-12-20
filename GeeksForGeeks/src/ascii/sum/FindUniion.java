package ascii.sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUniion {

	private static int[] getUnionJava8Style(String[] a , String[] b) {
		List<String> unionList = Stream.of(new ArrayList<>(Arrays.asList(a)),new ArrayList<>(Arrays.asList(b))).flatMap(x->x.stream()).distinct().
				collect(Collectors.toList());
		
		unionList.forEach(System.out::println);
		return null;
		
	}
	
	private static int[] getIntersectionJava8Style(String[] a , String[] b) {
		List<String> unionList = Stream.of(new ArrayList<>(Arrays.asList(a)),new ArrayList<>(Arrays.asList(b))).flatMap(x->x.stream()).filter(x->x.equals("1")).
				collect(Collectors.toList());
		
		unionList.forEach(System.out::println);
		return null;
		
	}
	
	private static void getUnion(int[]a , int[]b) {
		int i =0 , j =0;
		
		while (i<a.length && j<b.length) {
			
			if(a[i]<b[j]) {
				System.out.println(a[i]);
				i ++;
			}else if(a[i]>b[j]) {
				System.out.println(b[j]);
				j ++;
			}
			else if(a[i]==b[j]) {
				System.out.println(b[j]);
				i++;
				j++;
			}
			
		}
		
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		
		while(j<b.length) {
			System.out.println(b[j]);
			j++;
		}
	}
	
	public static void main(String[] args) {
		String[] input1 = {"1","2","3","4"};
		String[] input2 = {"4","5","6"};
		
		int[] a = {1,2,3,4};
		int[] b = {4,5,6};
		int inputLength1 = input1.length;
		int inputLength2 = input2.length;
		
		int i =0 , j=0;
		//getUnionJava8Style(input1, input2);
		//getIntersectionJava8Style(input1, input2);
getUnion(a, b);
		
		
	}
}
