public class RandomWalkers
{
	public static void main(String[] args) // Give 1-norm distance
	{
		int r = Integer.parseInt(args[0]);
		int x = 0;
		int y = 0;		
		double step = 0; // need to resolve average
		double d = 0; // don't want to be declaring direction everytime a new one is chosen
		double avg = 0;

		double trials = Integer.parseInt(args[1]); // need to resolve average
		int ctrial = 0; 
		
		while(ctrial < trials) {
			x = 0;
			y = 0;
			while(Math.abs(x) + Math.abs(y) < r) {
				d = Math.random();
				if (d >= 0.0 && d < 0.25) { y++; }// stumble up
				else if (d >= 0.25 && d < 0.50) { y--; }// stumble down
				else if (d >= 0.50 && d < 0.75) { x++; }// stumble right
				else if (d >= 0.75 && d <= 1.0) { x--; }// stumble left
				step++;
			}
			ctrial++;
		} 
		avg = step / trials;
		System.out.println("average number of steps = " + avg);
	}
}
			