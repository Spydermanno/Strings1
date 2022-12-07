    package Strings;

    public class intro {
    public intro() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String str="Coding";
		String str2=" is fun";
		str=str.concat(str2);
		System.out.println(str);
	    int count=0;
	  
	    int [] arr=new int [str.length()];
	    for(int i=0;i<str.length();i++) {
	    	int n=str.length();
	    	arr[i]=str.charAt(i);
	    }
		for(int j=0;j<arr.length;j++) {
			int temp=arr[j];
			arr[j]=arr[arr.length-j-1];
			arr[arr.length-j-1]=temp;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
	}
    }