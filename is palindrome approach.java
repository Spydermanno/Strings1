package Strings;

public class ggg {

	public ggg() {
		// TODO Auto-generated constructor stub
	}
    
	/ public static boolean isPalindrome(String str11,int start,int end){
	   String str11="Coding";

	    if (start == end){
	        return true;
	    }
	    if(str11.charAt(start)!=str11.charAt(end)){
	        return false;
	    }
	    if(start<end+1)
	     return isPalindrome(str11,start+1,end-1);
	     return true;
	    }
	
	   
public static void main(String[] args)    {
	System.out.print(isPalindrome("Coding",0,5));

    System.out.println(name.indexOf('a'));
    String str="Coding";
    String ab="Coding";
    	

}
}
	 
