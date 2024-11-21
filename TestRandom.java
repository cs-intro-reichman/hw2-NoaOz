
public  class  TestRandom {
	public static void main(String[]  args) {
	    int N = Integer.parseInt(args[0]);
		double Numbergreater = 0 ;
		double Numberless = 0 ;
		for (int i = 0; i < N; i++){
			double number = Math.random() ;
			if (number > 0.5){
				Numbergreater = Numbergreater + 1; 
			} 
			else {
				Numberless = Numberless + 1 ;
			}
		}
		double ratio = 1.0; 
		if (Numbergreater > Numberless){
			ratio = Numberless / Numbergreater; 
		} 
		if (Numberless > Numbergreater){
			ratio = Numbergreater/Numberless; 
		}
		System.out.println("> 0.5: " + (int) Numbergreater + " times");
		System.out.println("<= 0.5: " + (int) Numberless + " times");
		if (Numberless != 0 || Numbergreater != 0){
			System.out.println("Ratio: " + ratio);	
		}

	}
}
