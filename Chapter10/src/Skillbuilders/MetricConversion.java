package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class MetricConversion {

	private JFrame frame;
	private JTextField num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//comment
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel display = new JLabel("");
		display.setFont(new Font("Papyrus", Font.PLAIN, 22));
		display.setBounds(10, 140, 414, 110);
		frame.getContentPane().add(display);
		
		JComboBox con = new JComboBox();
		con.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(con.getSelectedItem().equals("1 inch = 2.54 cm")) 
				{
					String n = num.getText();
					double Num = Double.parseDouble(n);
					double answer = Num * 2.54;
					
					
					display.setText(Num + " inches converted to cm is: "
							+ answer + "cm");
				}
				else if(con.getSelectedItem().equals("1 foot = 0.3048 meters"))
				{
					String n = num.getText();
					double Num = Double.parseDouble(n);
					double answer = Num * 0.3040;
					
					display.setText(Num + " feet converted to meters is: "
							+ answer + "Meters");
				}
			}
		});
		con.setModel(new DefaultComboBoxModel(new String[] {"1 inch = 2.54 cm", "1 gallon = 4.5461 liters", "1 pound = 0.4536 kilograms", "1 foot = 0.3048 meters"}));
		con.setBounds(32, 86, 362, 43);
		frame.getContentPane().add(con);
		
		JLabel lblNewLabel = new JLabel("Select a conversion type: ");
		lblNewLabel.setBounds(32, 71, 362, 14);
		frame.getContentPane().add(lblNewLabel);
		
		num = new JTextField();
		num.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(num.getText().equals("Enter Your Number here")) 
				{
					num.setText("");
				}
			}
		});
		num.setText("Enter Your Number here");
		num.setBounds(120, 14, 173, 46);
		frame.getContentPane().add(num);
		num.setColumns(10);
		
		
	}
}
