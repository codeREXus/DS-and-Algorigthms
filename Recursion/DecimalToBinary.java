package basic;

public class DecimalToBinary { 
	    public static void  main(String[] args) {
	        int decimalNumber = 10;
	        System.out.println("Decimal number: " + decimalNumber);
	        System.out.println("Binary equivalent: " + decToBin(decimalNumber));
	    }

	    public static String decToBin(int decimalNumber) {
	        if (decimalNumber == 0) {
	            return "";
	        } else {
	            return decToBin(decimalNumber / 2) + (decimalNumber % 2);
	        }
	    }
	}

