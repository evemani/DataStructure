package ascii.sum;

public class CamelCase {

	public static void main(String[] args) {
		String camelCase = "my name is Manish";

		convertToCamelCase(camelCase);
	}

	private static void convertToCamelCase(String camelCase) {


		String finalString = "";
		
		for(int i=0;i<camelCase.length();i++) {
			if(i==0) {
				finalString+=camelCase.charAt(i)+"".toUpperCase();
			}else if(camelCase.charAt(i)==' ') {
				i=i+1;
				finalString+=camelCase.charAt(i)+"".toUpperCase();
			}else {
				finalString+=camelCase.charAt(i);
			}

		}
		
		System.out.println( finalString);
	}
}
