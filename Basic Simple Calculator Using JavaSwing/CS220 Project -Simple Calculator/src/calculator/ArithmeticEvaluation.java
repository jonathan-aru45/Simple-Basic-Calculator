package calculator;


import java.util.Stack;



//THE FOLLOWING CODE IS FROM ASSIGNMENT 1 WHERE WE EVALUATED AN ARITHMETIC EXPRESSION
//USING TWO STACKS


public class ArithmeticEvaluation  {
	

	 public String evaluate(String expression){
		 
		
			
			//creating two stacks
			 Stack<Character>Operators= new Stack<>();
			 Stack<Double>operands =new Stack<>();//stack to hold operand (numbers)
			 
				//For loop to go through the expression to be evaluated
				for(int i=0; i<expression.length();i++) {
					
					//for(int j=0;i<expression.length();j++) {
						
						//char ch2=expression.charAt(j+1);
						
				//	}
					
					
					char ch1=expression.charAt(i);
					//for checking the whether character next to i is another operator
					//when character at i is already an operator
					
				
					
					
				//if character is a number, push into operands stack
					if(Character.isDigit(ch1)) {
						
						 //Entry is Digit, it could be greater than one digit number
			            Double num = (double) 0;
			            while (Character.isDigit(ch1)) {
			                num = num*10 + (ch1-'0');
			                i++;
			                if(i < expression.length())
			                    ch1 = expression.charAt(i);
			                else
			                    break;
			            }
			            i--;
			            //push it into stack
			            operands.push(num);
						
					}
					

	              
	            else if(ch1=='('){
	                //push it to the operators stack
	                Operators.push(ch1);
	            }
	            //Closed brace, evaluate the entire brace
	            else if(ch1==')') {
	                while(Operators.peek()!='('){
	                    double output = operation(operands, Operators);
	                    
	                    //push it back ino the stack stack
	                    operands.push(output);
	                }
	               Operators.pop();
	            }

					else if(ch1=='+'||ch1=='-'||ch1=='*' ||ch1=='/' ||ch1=='^' )
		
							 {
						while(!Operators.isEmpty() && precedence(ch1)<=precedence(Operators.peek())){
		                    double output = operation(operands, Operators);
		                    //push it back to stack
		                    operands.push(output);
		                }
						Operators.push(ch1); 
					} 
				
						}
				while(!Operators.isEmpty()){
		            double output = operation(operands, Operators);
		            //push it back to stack
		            operands.push(output);
		        }
				
				
				 Double result=operands.peek();
				 
				 String finalresult= result.toString();
				return finalresult;
				 
				
	
}

		//Method to check precedence of operators
		public static int precedence(char operator) {
			if(operator=='+') {
				return 1;
			}
			else if (operator=='-' ) {
				return 1;
		}
			else if (operator=='*') {
				return 2;
	}
			else if (operator=='/' ) {
				return 2;
		}
			else if (operator=='^' ) {
				return 3;
		}
			else {
				return 0;
			}
		}
		
		//This method performs arithmetic operations once the precedence of the Operators is determined
		public static double operation(Stack<Double>digits, Stack<Character> oprtns) {
			
			
			//Pops two numbers and an operator from the operand stack
			//and operator stack respectively
			double v1=digits.pop();
			double v2=digits.pop();
		
			Character op=oprtns.pop();
			
			if (op=='+') {
				return v1+v2;
			}
			else if(op=='-') {
				return v2-v1;
		}
			else if(op=='*') {
				return v1*v2;
		}
			else if(op=='/') {
				if(v1==0) {
					
					//Try and catch to handle the arithmetic exception when 0 is in the denominator
					
					try {
						@SuppressWarnings("unused")
						int zeroerror=4/0;
					}catch(ArithmeticException e) {
						
						//Exception Caught but I won't display anything
					}
					

				}
				return v2/v1;
		}
			else if(op=='^') {
				return (int) Math.pow((v1), (v2));
		}
			else { 
				return 0;
			}
	
}
		
}

	 
		 
	

		
		
		       