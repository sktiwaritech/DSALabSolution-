ackage com.greatlearning.driver;

import com.greatlearning.service.BalancingBrackets;


public class Driver {
	public static void main(String[] args) {
		String bracketExpression = "([[{}]])"; // for balanced Brackets
		//String bracketExpression = "([[{}]]))";// for unbalanced brackets
		boolean result;
		result = BalancingBrackets.checkingBracketsBalanced(bracketExpression);
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}