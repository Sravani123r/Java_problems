package String;


public class CountChar {

	public static void main(String[] args) {
		String s= "aabbccddef";   // o/p - a2b2c2d2e1f1
		
		String str="";
		int count=1;
		
		for (int i = 0; i < s.length(); i++) {
		    if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
		        count++;
		    } else {
		        str = str + s.charAt(i) + count; 
		        count = 1; 
		    }
		}
	    System.out.println(str);

		
	}

}
