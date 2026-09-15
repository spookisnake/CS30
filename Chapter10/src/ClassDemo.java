import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ClassDemo {

	private JFrame frame;
	private JTextField firstName;
	private JTextField lastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassDemo window = new ClassDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClassDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		firstName = new JTextField();
		firstName.setText("Enter First Name");
		firstName.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(firstName.getText().equals("Enter First Name")) 
				{
					firstName.setText("");		
				}
			
			}
		});
		firstName.setBounds(31, 44, 152, 31);
		panel.add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e)
			{
				if(lastName.getText().equals("Enter Last Name")) 
				{
					lastName.setText("");		
				}
				
				
			}
		});
		lastName.setText("Enter Last Name");
		lastName.setColumns(10);
		lastName.setBounds(212, 44, 162, 31);
		panel.add(lastName);
		
		JLabel nicheDisplay = new JLabel("");
		nicheDisplay.setBounds(31, 187, 343, 63);
		panel.add(nicheDisplay);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String fN = firstName.getText();
				String lN = lastName.getText();
				
				nicheDisplay.setText("Your First Name is: "
						+ fN + " "
						+ "Your Last Name is: "
						+ lN);
			}
		});
		submit.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		submit.setBounds(394, 48, 141, 202);
		panel.add(submit);
		
		
	}
}
