package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class schoolAssign {

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
					schoolAssign window = new schoolAssign();
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
	public schoolAssign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		firstName = new JTextField();
		firstName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				
			}
		});
		firstName.setText("First Name");
		firstName.setBounds(10, 11, 165, 41);
		panel.add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) 
			{
				
			}
		});
		lastName.setText("Last Name");
		lastName.setColumns(10);
		lastName.setBounds(214, 11, 165, 41);
		panel.add(lastName);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(388, 68, 126, 189);
		panel.add(submit);
		
		JComboBox grade = new JComboBox();
		grade.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		grade.setBounds(10, 96, 165, 35);
		panel.add(grade);
		
		JComboBox district = new JComboBox();
		district.setModel(new DefaultComboBoxModel(new String[] {"North", "South", "East", "West", "Center"}));
		district.setBounds(214, 96, 165, 35);
		panel.add(district);
		
		JLabel placeholder = new JLabel("");
		placeholder.setBounds(10, 166, 267, 137);
		panel.add(placeholder);
	}
}
