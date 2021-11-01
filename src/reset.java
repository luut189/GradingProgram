import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reset implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		mainFrame f = new mainFrame();
		cal c = new cal();
		
		f.grade1.setText("");
		f.grade2.setText("");
		f.grade3.setText("");
		f.grade4.setText("");
		f.mark.setText("Reset".toUpperCase());
		f.aver.setText("Reset".toUpperCase());
		
		c.sum = 0;
		c.aver = 0;
		
	}

	
	
}
