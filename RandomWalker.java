public class RandomWalker 
{
	public static void main(String args[]) // Give 1-norm distance
	{
		int r = Integer.parseInt(args[0]);
		int x = 0;
		int y = 0;
		
		int step = 0;
		double d = 0; // don't want to be declaring direction everytime a new one is picked

		while(Math.abs(x) + Math.abs(y) < r){
			d = Math.random();
			if (d >= 0 && d < .25) { y++; }// stumble up
			else if (d >= .25 && d < .50) { y--; }// stumble down
			else if (d >= .50 && d < .75) { x++; }// stumble right
			else if (d >= .75 && d <= 1) { x--; }// stumble left
			step++;
			System.out.println("(" + x + ", " + y + ")");
		}
		System.out.println("steps = " + step);
	}
}
			