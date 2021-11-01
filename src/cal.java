import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cal implements ActionListener {
	
	public static double sum;
	public static double aver;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(mainFrame.grade1.getText().isEmpty() || 
				mainFrame.grade2.getText().isEmpty() || 
				mainFrame.grade3.getText().isEmpty() || 
				mainFrame.grade4.getText().isEmpty() ) 
		{
			
			mainFrame.aver.setText("You must enter your grades");
			mainFrame.mark.setText("Invalid!");
			
		} else {
			String grade1Text = mainFrame.grade1.getText();
			String grade2Text = mainFrame.grade2.getText();
			String grade3Text = mainFrame.grade3.getText();
			String grade4Text = mainFrame.grade4.getText();
			
			sum = 0;
			
			mainFrame.grades[0] = Double.parseDouble(grade1Text);
			mainFrame.grades[1] = Double.parseDouble(grade2Text);
			mainFrame.grades[2] = Double.parseDouble(grade3Text);
			mainFrame.grades[3] = Double.parseDouble(grade4Text);
			
			for(int i = 0; i < 4; i++) {
				sum = sum + mainFrame.grades[i];
			}
			
			aver = sum / mainFrame.grades.length;
			
			mainFrame.aver.setText("Your average grade is "+ aver +"");
			
			if(aver <= 100 && aver >= 90) {
				mainFrame.mark.setText("A+");
				
			} else if(aver <= 89 && aver >= 85) {
				mainFrame.mark.setText("A");
				
			} else if(aver <= 84 && aver >= 80) {
				mainFrame.mark.setText("A-");
									
			} else if(aver <= 79 && aver >= 75) {
				mainFrame.mark.setText("B+");
				
			} else if(aver <= 74 && aver >= 70) {
				mainFrame.mark.setText("B");
				
			} else if(aver <= 69 && aver >= 65) {
				mainFrame.mark.setText("C+");
				
			} else if(aver <= 64 && aver >= 60) {
				mainFrame.mark.setText("C");
				
			} else if(aver <= 59 && aver >= 55) {
				mainFrame.mark.setText("D+");
				
			} else if(aver <= 54 && aver >= 50) {
				mainFrame.mark.setText("D");
				
			} else if(aver <= 49 && aver >= 40) {
				mainFrame.mark.setText("E");
				
			} else if(aver <= 39 && aver >= 0){
				mainFrame.mark.setText("F");
				
			} else {
				mainFrame.mark.setText("Invalid");
			}
		}
		
	}

}
