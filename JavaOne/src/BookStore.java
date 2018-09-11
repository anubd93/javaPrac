import java.util.Scanner;

public class BookStore {
	
	static String[] books = {"java","c","php"}; 
	static final double stdDiscount = 0.3;
	static final double teaDiscount = 0.4;
	static final double alnDiscount = 0.0;
	
	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		prln("====welcome to our bookstore====");
		prln("which book do you want? \nAns: ");
		String userChoice = myScanner.nextLine();
		
		if(books[0].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("it's java");
				calulatePrice(books[0]);
			} else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("it's c");
				calulatePrice(books[1]);
			} else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
				prln("it's php");
				calulatePrice(books[2]);
			} else {
				prln("out of stock");
			}
		}
	
	static void calulatePrice(String bookName) {
		pr("are you a std or tea or alien?\nAns");
		String answer = myScanner.nextLine();
		
		double price = 200;
		
		if (answer.toLowerCase().equals("teacher")) {
			price = price - (price*teaDiscount);
			showPrice(price);
		} else if (answer.toLowerCase().equals("student")) {
			price = price-(price*stdDiscount);
			showPrice(price);
		} else if (answer.toLowerCase().equals("alien")) {
			price = price-(price*alnDiscount);
			showPrice(price);
		} else {
			prln("not valid user");
		}
	}
	
	static void showPrice(double showPrice) {
		prln("your total price: "+showPrice);
		prln("\n--------THANKS--------");
	}
	
	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	static void pr(Object anyObject) {
		System.out.print(anyObject);
	}

}
