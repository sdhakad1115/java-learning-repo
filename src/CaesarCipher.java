
public class CaesarCipher {

	public static void main(String[] args) {

		String str = "abc_c";
		int k = 2;

		String result = "";
		for(int i = 0; i<str.length(); i++) {
			char ch = getEncryptedLetter(str.charAt(i), k);
			result = result + ch;
		}
		
		System.out.println("Encrypted String :: " + result);
	}

	public static char getEncryptedLetter(char ch, int incremental) {

		if (Character.isLetter(ch)) {
			int i = (int) ch;
			i = i + incremental;
			if (Character.isUpperCase(ch)) {
				if (i > 90) {
					int num = (int) ch + incremental;
					i = num - 26;
				}
			} else if (i > 122) {
				int num = (int) ch + incremental;
				i = num - 26;
			}
			return (char)i;
		}
		return ch;
	}

}
