package perennialCodingTest.problem2;

public class PrintingWords {
	
	void printWords() {
		
		for(int numbers=1;numbers<100;numbers++)
		{
			if(numbers%5==0) {
				System.out.println("FOO");
			}
			else if(numbers%7==0) {
				System.out.println("BAR");
			}
			else if(numbers%5==0 && numbers%7==0) {
				System.out.println("FOO-BAR");
			}
			
			else {
				System.out.println(numbers);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
	
		PrintingWords print = new PrintingWords();
		print.printWords();
	}
	

}
