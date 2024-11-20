// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int terms = Integer.parseInt(args[0]);
				double approximatedPI = 0.0;
				for (int i = 0; i < terms; i++) {
					double term = 1.0 / (2 * i + 1);
					if (i % 2 == 0) {
						approximatedPI = approximatedPI + term;
					} else {
						approximatedPI = approximatedPI - term;
					}
				}
				approximatedPI *= 4;
				System.out.println("pi according to Java: " + Math.PI);
				System.out.println("pi, approximated:     " + approximatedPI);
	}
}
