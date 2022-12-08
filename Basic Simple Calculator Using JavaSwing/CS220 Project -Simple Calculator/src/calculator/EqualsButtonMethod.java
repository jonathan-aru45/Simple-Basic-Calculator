package calculator;

import javax.swing.JTextArea;

public class EqualsButtonMethod extends ArithmeticEvaluation {
	
	//Method to be run when the equals (=) button is pressed
	//Checking possible ways in which the calculator could fail
	

public static void evaluate(JTextArea textArea) {
	
	
	String expression=textArea.getText();
	
	
	
		
	//If there is no expression and user presses = button, 
	//nothing will be displayed
		if(textArea.getText().equals("")) {
			textArea.setText(null); 
		
//***************************************************************************************************************				
			//The following are for when there is only a *, or a / or a + or a - on the textarea
			//and the user presses the = button
			//Nothing will be displayed
		}
		else if(textArea.getText().equals("*")) {
			textArea.setText(null);
			
		}
		else if(textArea.getText().equals("/")) {
			textArea.setText(null);
			
		}
		else if(textArea.getText().equals("+")) {
			textArea.setText(null);
			
		}
		else if(textArea.getText().equals("-")) {
			textArea.setText(null);
		}
			
//***************************************************************************************************************	
			
		
//***************************************************************************************************************		
		
		//The follwing code checks the textarea( expression) if it contains any number being divided by 0
		//if if does, a message "Cannot Divide by 0" is displayed in the textarea.
		else if(textArea.getText().contains("0/0")){
			textArea.setText("Cannot Divide by 0");
		}
		else if(textArea.getText().contains("1/0") && !textArea.getText().contains("0/1")){
			textArea.setText("Cannot Divide by 0");
			
		} 
		else if(textArea.getText().contains("2/0") && !textArea.getText().contains("0/2")){
			textArea.setText("Cannot Divide by 0");
		}
		else if(textArea.getText().contains("3/0") && !textArea.getText().contains("0/3")){
			textArea.setText("Cannot Divide by 0");
		}
		else if(textArea.getText().contains("4/0") && !textArea.getText().contains("0/4")){
			textArea.setText("Cannot Divide by 0");
		}
		else if(textArea.getText().contains("5/0") && !textArea.getText().contains("0/5")){
			textArea.setText("Cannot Divide by 0");
		}
		else if(textArea.getText().contains("6/0") && !textArea.getText().contains("0/6")){
			textArea.setText("Cannot Divide by 0");
		}
		else if(textArea.getText().contains("7/0") && !textArea.getText().contains("0/7")){
			textArea.setText("Cannot Divide by 0");
		}
		else if(textArea.getText().contains("8/0") && !textArea.getText().contains("0/8")){
			textArea.setText("Cannot Divide by 0");
		}
		else if(textArea.getText().contains("9/0") && !textArea.getText().contains("0/9")){
			textArea.setText("Cannot Divide by 0");
		}
				
			
			

//***************************************************************************************************************	
		
		else {
			
			
			ArithmeticEvaluation evaluate= new ArithmeticEvaluation();
			//Stores the answer of the evaluated epression in a string variable
			String evaluatedexpression=(String) evaluate.evaluate(expression); 
			
			//Displays the answer on the textarea
			textArea.setText(evaluatedexpression);
			
			if(textArea.getText()!=null) {
				
			String expression2=textArea.getText();
				
			
				
			}
			
			
		} 
		
}

			
		} 




