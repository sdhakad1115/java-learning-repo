
public class NumberSeperateFromString {

	public static void main(String[] args) {

		String str = "91011";
		numberSeperate(str);
		
	}
	
	public static void numberSeperate(String str) {
		
		String substring = "";
		boolean isValid = false;
		
		for(int i = 1; i<str.length()/2; i++) {
			
			substring = str.substring(0, i);
			long num = Long.parseLong(substring);
			String validString = substring;
			
			while(validString.length() < str.length()) {
				
				validString = validString + Long.toString(++num);
				
			}
			if(str.equals(validString)) {
				isValid = true;
				break;
			}
		}
		System.out.println(isValid ? "YES " + substring : "NO");
		
		
	}

}
