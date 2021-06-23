package calculator;

import java.math.BigDecimal;
import java.util.Stack;

public class ResultMaker {
	
	Stack<BigDecimal> stack = new Stack<BigDecimal>();
	
	
	public void insert(String num) {
		BigDecimal newNum = new BigDecimal(num);
		stack.add(newNum);
	}
	
	private int get_precedence(String op) {
		if((op.equals("(")) || (op.equals("$")))
			return 0;
		if((op.equals("+")) || (op.equals("-")))
			return 1;
		if((op.equals("*")) || (op.equals("/")) || (op.equals("%")))
			return 2;
		return -1;
	}
	
	

}
