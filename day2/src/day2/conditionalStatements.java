package day2;

public class conditionalStatements {

	public static void main(String[] args) {

		//Number is even or odd
		int n = 187;
		if(n%2 == 0) {
			System.out.println("number is EVEN.");
		}
		else {
			System.out.println("number is ODD.");
		}

		
		//Eligible  for voting
		int age = 56;
		if(age>18) {
			System.out.println("you can vote.");
		}
		else {
			System.out.println("you can not vote.");
		}
		
		//check eligibility for blood donation
		
		int age1 = 32;
		float weight = 45.10f;
		boolean isGoodHealth = true;
		
		if(age1>=18 && age1<=65) {
			if(weight>=45 && isGoodHealth) {
				System.out.println("you can donate blood.");
			}
			else {
				System.out.println("your health is too weak to donate blood.");
			}
		}
		else {
			System.out.println("you do not fit in the age group to donate blood.");
		}
		
		
//		Switch case statements
		int day = 2;
		switch(day) {
		
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
			System.out.println("Fridayy");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid choice");
			
		}
	}
}
