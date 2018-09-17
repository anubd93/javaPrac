import java.util.Scanner;

public class Hello {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		System.out.println("give an input");
//		String name = sc.nextLine();
//		System.out.println(name + "\n");
//		String arr[]={"a","b","c"};
//	    for(String i:arr){  
//	        System.out.println(i);  
//	    }
//		aa:  
//	        for(int i=1;i<=3;i++){  
//	            bb:  
//	                for(int j=1;j<=3;j++){  
//	                    if(i==2&&j==2){  
//	                        break aa;
////	                        break bb;
//	                    }  
//	                    System.out.println(i+" "+j);  
//	                }  
//	        }  
//		for(int i=1;i<=10;i++){  
//	        if(i==5){
//	            continue; 
//	        }  
//	        System.out.println(i);
//	    }  
		int i,fact = 1;
		int number  = sc.nextInt();
		for(i = 1; i<=number; i++) {
			fact = fact*i;
		}
		System.out.println(fact + "\n");
	}

}
