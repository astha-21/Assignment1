import java.text.DecimalFormat;
import java.util.Scanner;

class Calculator {
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	private double salary;
	private String gender;
	
	
	public Calculator(double salary, String gender)
	{
		this.salary=salary;
		this.gender=gender;
	}


	public void tax() {
		double taxAmount=0;
		if(salary<150000) {
			
			taxAmount=0;
		}
		else if(salary>=150000 && salary<1000000){
			
			taxAmount=((10.0/100)*salary);
		}
		else if(salary>=1000000 && salary< 1500000) {
			
			taxAmount=((20.0/100)*salary);
		}
		else if(salary>=1500000 && salary<3000000) {
			
			taxAmount= ((35.0/100)*salary);
		}
		else {
			
			taxAmount= ((40.0/100)*salary);
		}
		
        df.format(taxAmount);
	    
		if(gender.equals("female")) {
			
			taxAmount= taxAmount - 2000;
		}
		
		System.out.println("taxable amount on given salary is:"+ taxAmount);
		
	}
	
}
public class Question_2 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double salary=sc.nextDouble();
		System.out.println("Enter gender");
		String str=sc.next();
	
        
		Calculator c= new Calculator(salary,str);
		c.tax();
		
		
		
	}

}