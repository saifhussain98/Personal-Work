package Iterations;
public class DoWhile {

		    public static int playCount = 0;
		    public static boolean playing = true;

		    public static void main(String[] args) {
		        do {
		            System.out.println("Playing" + playCount);
		            playCount++;

		            if(playCount > 10) {
		                playing = false;
		            }
		        } while(playing);

		        System.out.println("Game Over!");
		    }
	}
