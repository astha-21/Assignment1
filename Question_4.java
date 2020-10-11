public class Question_4 {
	
	public static void main(String[] args) {
		
		int tankHeight= 20;
		int tankDiameter=5;  
		int pipeDiameter=5; 
		
		double tankHeight1= tankHeight*0.3048; 
		double tankRadius= tankDiameter/2.0 * 0.3048;
		
		double volumeOfTank= 3.14*tankRadius*tankRadius*tankHeight1; 
		double volumeOfTank1=volumeOfTank*1000;                
		
		for(int i=1; i<5; i++) {
			
			double rate;
			rate= volumeOfTank1 / (3600*i);  
			
			Math.round(rate);
			System.out.println("Rate in which liguid should flow within "+ i +"hour is: "+ String.format("%.2f", rate) + "  litre/sec");
		}
		
	}
}