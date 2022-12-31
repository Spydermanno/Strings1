package codingninjaprogram;
import java.util.Scanner;
import java.util.*;
import codingninjaprogram.studentuse;

public class ABCD {

	public static void main(String[] args) {
		 studentuse s1 = new studentuse();
		 studentuse s2=new studentuse();
		 
		 s1.name="Anurag";
		 s1.rollNumber=10;
        System.out.println(s1.name+" "+s1.rollNumber);
		s2.name="Ankit";
		s2.rollNumber=20;
        System.out.println(s1.name+" "+s2.rollNumber);
        String s3=new String("Hello");
        String s=new String("Hello");
        System.out.println(s3==s);
        String s4="Harris";
        System.out.println(s4.substring(0,4));
        //Last index exclusive hota h
        System.out.print(s4.substring(6));
        //string length pass karenge to empty string dega
        
	}
}
	


