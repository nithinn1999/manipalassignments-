package proj1;

public class Stadium {

	public static void main(String[] args) {
		player n1 = new player();
		player n2 = new player();
		
		int n1score = n1.play();
		int n2score = n2.play();
		
		System.out.println("Total score for p1:" + n1score);
		System.out.println("Total score for p2:" + n2score);
		
		if(n1score > n2score)
			System.out.println("player 1 won the match");
		else
			System.out.println("Player 2 has won the match");
		
	}

}
