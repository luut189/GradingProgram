import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mainFrame {

	protected static final ActionEvent ActionEvent = null;
	private static JFrame frame;	
	private static JLabel progLabel;
	
	public static JTextField aver;
	public static JTextField mark;
	
	private static JLabel gradeLabel1;
	private static JLabel gradeLabel2;
	private static JLabel gradeLabel3;
	private static JLabel gradeLabel4;
	
	public static JTextField grade1;
	public static JTextField grade2;
	public static JTextField grade3;
	public static JTextField grade4;
	
	public static JButton cal;
	public static JButton reset;
	
	public static double[] grades = new double[4];

	public static void main(String[] args) {

		JPanel panel = new JPanel();
		
		frame = new JFrame();
		frame.setSize(520, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.add(panel);
		frame.setTitle("Grading Program");		
		
		panel.setLayout(null);
		
		progLabel = new JLabel("Average Grade");
		progLabel.setBounds(0, 10, 520, 35);
		progLabel.setHorizontalAlignment(JLabel.CENTER);
		progLabel.setVerticalAlignment(JLabel.CENTER);
		progLabel.setFont(new Font("Average Grade", Font.BOLD, 22));
		panel.add(progLabel);
		
		gradeLabel1 = new JLabel("1st Grade");
		gradeLabel1.setBounds(20, 50, 80, 25);
		gradeLabel1.setFont(new Font("1st Grade", Font.PLAIN, 17));		
		panel.add(gradeLabel1);
		
		gradeLabel2 = new JLabel("2nd Grade");
		gradeLabel2.setBounds(150, 50, 80, 25);
		gradeLabel2.setFont(new Font("2nd Grade", Font.PLAIN, 17));		
		panel.add(gradeLabel2);
		
		gradeLabel3 = new JLabel("3rd Grade");
		gradeLabel3.setBounds(280, 50, 80, 25);
		gradeLabel3.setFont(new Font("3rd Grade", Font.PLAIN, 17));		
		panel.add(gradeLabel3);
		
		gradeLabel4 = new JLabel("4th Grade");
		gradeLabel4.setBounds(410, 50, 80, 25);
		gradeLabel4.setFont(new Font("4th Grade", Font.PLAIN, 17));		
		panel.add(gradeLabel4);
		
		grade1 = new JTextField(3);
		grade1.setBounds(20, 80, 80, 25);
		grade1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				switch(keyCode) {
					case KeyEvent.VK_RIGHT:
						grade2.requestFocus();
						break;
					case KeyEvent.VK_LEFT:
						grade4.requestFocus();
						break;
					case KeyEvent.VK_DOWN:
						cal.requestFocus();
						break;
					case KeyEvent.VK_ENTER:
						grade2.requestFocus();
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}			
		});
		panel.add(grade1);
		
		grade2 = new JTextField(3);
		grade2.setBounds(150, 80, 80, 25);
		grade2.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				switch(keyCode) {
					case KeyEvent.VK_RIGHT:
						grade3.requestFocus();
						break;
					case KeyEvent.VK_LEFT:
						grade1.requestFocus();
						break;
					case KeyEvent.VK_DOWN:
						cal.requestFocus();
						break;
					case KeyEvent.VK_ENTER:
						grade3.requestFocus();
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}			
		});
		panel.add(grade2);
		
		grade3 = new JTextField(3);
		grade3.setBounds(280, 80, 80, 25);
		grade3.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				switch(keyCode) {
					case KeyEvent.VK_RIGHT:
						grade4.requestFocus();
						break;
					case KeyEvent.VK_LEFT:
						grade2.requestFocus();
						break;
					case KeyEvent.VK_DOWN:
						cal.requestFocus();
						break;
					case KeyEvent.VK_ENTER:
						grade4.requestFocus();
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}			
		});
		panel.add(grade3);
		
		grade4 = new JTextField(3);
		grade4.setBounds(410, 80, 80, 25);
		grade4.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				cal c = new cal();
				
				int keyCode = e.getKeyCode();
				switch(keyCode) {
					case KeyEvent.VK_RIGHT:
						grade1.requestFocus();
						break;
					case KeyEvent.VK_LEFT:
						grade3.requestFocus();
						break;
					case KeyEvent.VK_DOWN:
						cal.requestFocus();
						break;
					case KeyEvent.VK_ENTER:
						c.actionPerformed(ActionEvent);
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}			
		});
		panel.add(grade4);
		
		cal = new JButton("Calculate");
		cal.setBounds(180, 120, 160, 35);
		cal.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				cal c = new cal();
				
				int keyCode = e.getKeyCode();
				switch(keyCode) {
					case KeyEvent.VK_DOWN:
						reset.requestFocus();
						break;
					case KeyEvent.VK_UP:
						grade1.requestFocus();
						break;
					case KeyEvent.VK_ENTER:
						c.actionPerformed(ActionEvent);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}			
		});
		cal.addActionListener(new cal());
		panel.add(cal);
		
		aver = new JTextField("Welcome to Grading!");
		aver.setBounds(100, 170, 320, 35);
		aver.setHorizontalAlignment(JLabel.CENTER);
		aver.setEditable(false);
		aver.setFont(new Font("", Font.PLAIN, 21));
		panel.add(aver);
		
		mark = new JTextField("");
		mark.setHorizontalAlignment(JTextField.CENTER);
		mark.setBounds(200, 220, 120, 25);
		mark.setFont(new Font("", Font.BOLD, 21));
		mark.setEditable(false);
		panel.add(mark);
		
		reset = new JButton("Reset");
		reset.setBounds(10, 225, 70, 25);
		reset.addActionListener(new reset());
		reset.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {

				reset r = new reset();
				
				int keyCode = e.getKeyCode();
				switch(keyCode) {
					case KeyEvent.VK_UP:
						cal.requestFocus();
						break;
					case KeyEvent.VK_DOWN:
						grade1.requestFocus();
						break;
					case KeyEvent.VK_ENTER:
						r.actionPerformed(ActionEvent);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}			
		});
		panel.add(reset);
		
		frame.setVisible(true);
	}

}
