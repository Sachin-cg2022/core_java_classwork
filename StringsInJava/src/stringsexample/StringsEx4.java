
package stringsexample;

import java.util.Arrays;

public class StringsEx4 {
	
	

	    public static void main(String[] args) {
	        String str1 = "halloween";
	        String str2 = "halcyon";
	        char[] s1 = str1.toCharArray();
	        char[] s2 = str2.toCharArray();

	        for(int i=0;i<s1.length;i++){
	          for(int j=0;j<s2.length;j++){
	                if(s2[j] == s1[i]){
	                    s2[j] = 'x'; //Replace the common char with x
	                }
	            }
	         }
	        System.out.println(Arrays.toString(s2));
	    }
	

}

