// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   int N = Integer.parseInt(args[0]);
	   String mode = args[1]; 
	   int i = 1;
	   int j;
	   if (mode.equals("v")){
	   while (i < (N+1)) {
		int counter = 0;
		System.out.print(i +" ");
		counter ++ ;
		if (i % 2 == 0) {
			j = i/2 ;
			System.out.print(j + " ");
			counter ++ ;
		}
		else {
			j = (i * 3) + 1;
			System.out.print(j + " ");
			counter ++ ;
		}
		while (j != 1){
			if (j % 2 == 0){
				j = j /2;
				System.out.print(j + " ");
				counter ++ ;
			}
			else {
				j = (j*3) + 1;
				System.out.print(j + " ");
				counter ++ ;

			}
		}
		System.out.println("(" + counter + ")");
		i ++ ;
	
			}
		}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}

 
	   } 
	

