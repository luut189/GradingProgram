import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cal implements ActionListener {
	
	public static double sum;
	public static double aver;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		mainFrame a = new mainFrame();
		
		if(a.grade1.getText().isEmpty() || 
				a.grade2.getText().isEmpty() || 
				a.grade3.getText().isEmpty() || 
				a.grade4.getText().isEmpty() ) 
		{
			
			a.aver.setText("You must enter your grades");
			a.mark.setText("Invalid!");
			
		} else {
			String grade1Text = a.grade1.getText();
			String grade2Text = a.grade2.getText();
			String grade3Text = a.grade3.getText();
			String grade4Text = a.grade4.getText();
			
			sum = 0;
			
			a.grades[0] = Double.parseDouble(grade1Text);
			a.grades[1] = Double.parseDouble(grade2Text);
			a.grades[2] = Double.parseDouble(grade3Text);
			a.grades[3] = Double.parseDouble(grade4Text);
			
			for(int i = 0; i < 4; i++) {
				sum = sum + a.grades[i];
			}
			
			aver = sum / a.grades.length;
			
			a.aver.setText("Your average grade is "+ aver +"");
			
			if(aver <= 100 && aver >= 90) {
				a.mark.setText("A+");
				
			} else if(aver <= 89 && aver >= 85) {
				a.mark.setText("A");
				
			} else if(aver <= 84 && aver >= 80) {
				a.mark.setText("A-");
									
			} else if(aver <= 79 && aver >= 75) {
				a.mark.setText("B+");
				
			} else if(aver <= 74 && aver >= 70) {
				a.mark.setText("B");
				
			} else if(aver <= 69 && aver >= 65) {
				a.mark.setText("C+");
				
			} else if(aver <= 64 && aver >= 60) {
				a.mark.setText("C");
				
			} else if(aver <= 59 && aver >= 55) {
				a.mark.setText("D+");
				
			} else if(aver <= 54 && aver >= 50) {
				a.mark.setText("D");
				
			} else if(aver <= 49 && aver >= 40) {
				a.mark.setText("E");
				
			} else if(aver <= 39 && aver >= 0){
				a.mark.setText("F");
				
			} else {
				a.mark.setText("Invalid");
			}
		}
		
	}

}
