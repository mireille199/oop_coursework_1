
import java.util.Scanner;

public class studentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scn  = new Scanner(System.in);
		
		
		System.out.print("Enter a mark: ");		
		
		int k =scn.nextInt();		
		
		if((k>=80)&&(k<=100)) {
			System.out.print("Student has: A"); 
			return;
		}
		 if((k>=75)&&(k<=79)) {
			System.out.print("Student has: B+"); 
			return;
		}
		 if((k>=70)&&(k<=74)) {
			System.out.print("Student has: B"); 
			return;
		}
		 if((k>=65)&&(k<=69)) {
			System.out.print("Student has: C+"); 
			return;
		}
		if((k>=60)&&(k<=64)) {
			System.out.print("Student has: C"); 
			return;
		}
		 if((k>=55)&&(k<=59)) {
			System.out.print("Student has: D+");
			return;
		}
		 if((k>=50)&&(k<=54)) {
			System.out.print("Student has: D");
			return;
		}
		 if((k>=40)&&(k<=49)) {
			System.out.print("Student has: F"); 
			return;
		}
		 else{
			System.out.print("No student");
			return;
		}
		
		
		

	}




	}



