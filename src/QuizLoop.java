import java.util.*;
public class QuizLoop {
	static Scanner scanner = new Scanner(System.in);
	
	/*
	 * Accepts a question and answer as parameters
	 * inputs a user response
	 * compare answer and user response to return a string value
	 * of true or false
	 * */
	private static String validateQuestionAnswer(
			String question,
			String answer) {
		System.out.println(question);
		System.out.println("Enter answer:");
		String response = scanner.next();
		if(response.equals(answer))
			return "Correct Answer";
		return "Wrong answer";
	}
	
	public static void main(String args[]) {	
		String response;
		int question = 1;
		do {
			//Question Answer Section
			if(question == 1)
				System.out.println(
						validateQuestionAnswer("PM of india?","modi")
				);
			else if(question == 2)
				System.out.println(
						validateQuestionAnswer("CM of kerala?","pinraivijayan")
				);
			else if(question == 3)
				System.out.println(
						validateQuestionAnswer("Where is Taj Mahal situated?","Agra")
				);
			else {
				System.out.println("No more questions left!");
				break;
			}
			//Move to next question
			question++;
			
			//User choice for continuation
			System.out.println("Enter Y to continue");
			response = scanner.next();
		}while(response.equals("y"));
	}
}
