package calculator;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class ResultMaker {
	
	private int getPrecedence(String op) {
		if((op.equals("(")) || (op.equals("EOS")))
			return 0;
		if((op.equals("+")) || (op.equals("-")))
			return 1;
		if((op.equals("*")) || (op.equals("/")) || (op.equals("%")))
			return 2;
		return -1;
	}
	
	private boolean isOperand(String op) {
		if((op.equals("+"))||(op.equals("-")))
			return false;
		else if((op.equals("*"))||(op.equals("/")))
			return false;
		else if((op.equals("%")))
			return false;
		else if((op.equals("(")) || (op.equals(")")))
			return false;
		return true;
	}
	
	public String operate(String equation) {
		
		String ans = "";
		
		ArrayList<String> infix = new ArrayList<>();
		Stack<String> stack = new Stack<String>();
		ArrayList<String> postfix = new ArrayList<>();
		
		// 숫자와 연산자의 구분 
		
		StringTokenizer token = new StringTokenizer(equation, "+-*/%()", true);
		while(token.hasMoreElements()) {
			infix.add(token.nextToken());
		}
		
		// infix -> postfix 로 변환
		stack.push("EOS");
		for(int i = 0; i < infix.size(); i ++) {
			String target = infix.get(i);
			if (isOperand(target)) { 
				postfix.add(target);
			} else {
				if (target.equals("(")) {
					stack.push(target);
				}
				else if (target.equals(")")) {
					while (!stack.peek().equals("(")) {
						postfix.add(stack.pop());
					}
					stack.pop();
				} else

				if (getPrecedence(stack.peek()) > getPrecedence(target)) { 
					while (!stack.peek().equals("EOS")) {
						postfix.add(stack.pop()); 
					}
					stack.push(target);
				}
				else { 
					stack.push(target);
				}
			}
		}
		while (!stack.peek().equals("EOS")) {
			postfix.add(stack.pop());
		}
		
		// 연산 
		float firstNum = 0; float secondNum = 0;
		while(postfix.size() != 1) {
			for(int i = 0; i < postfix.size(); i ++) {
				String target = postfix.get(i);
				if(!isOperand(target)) {
					firstNum = Float.parseFloat(postfix.get(i-2));
					secondNum = Float.parseFloat(postfix.get(i-1));
					postfix.remove(i);
					postfix.remove(i-1);
					postfix.remove(i-2);
					if(target.equals("+")) {
						postfix.add(i-2, Float.toString(firstNum + secondNum));
					} else if(target.equals("-")) {
						postfix.add(i-2, Float.toString(firstNum - secondNum));
					} else if(target.equals("*")) {
						postfix.add(i-2, Float.toString(firstNum * secondNum));
					} else if(target.equals("/")) {
						if(secondNum == 0) {
							JOptionPane.showMessageDialog(null, "0으로 나누실 수 없습니다. 다시 시도하십시오. ");
							ans = "0";
							return ans;
						} else
							postfix.add(i-2, Float.toString(firstNum / secondNum));
					} else if(target.equals("%")) {
						postfix.add(i-2, Float.toString(firstNum % secondNum));
					}
					i -= 2;
				}
			}
		}
		
		ans = postfix.get(0);
		
		return ans;
	}

}
