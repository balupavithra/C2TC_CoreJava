package Com.tns.day2;

public class Condition {

	public static void main(String[] args) {
		//if statement//
		int number = 10;

		if (number > 0) {
		    System.out.println("The number is positive.");
		}
       //if-else statement//
		int num = -10;

		if (number > 0) {
		    System.out.println("The num is positive.");
		} else {
		    System.out.println("The num is not positive.");
		}
         //switch statement//
		int day = 3;

		switch (day) {
		    case 1:
		        System.out.println("Monday");
		        break;
		    case 2:
		        System.out.println("Tuesday");
		        break;
		    case 3:
		        System.out.println("Wednesday");
		        break;
		    case 4:
		        System.out.println("Thursday");
		        break;
		    case 5:
		        System.out.println("Friday");
		        break;
		    case 6:
		        System.out.println("Saturday");
		        break;
		    case 7:
		        System.out.println("Sunday");
		        break;
		    default:
		        System.out.println("Invalid day");
		        break;
		}


	}

}
