package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	static double a=0, b=0, result=0;
	static int operator=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(10, 11, 233, 57);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(tf.getText().length()>0) {
					StringBuilder str = new StringBuilder(tf.getText());
					str.deleteCharAt(tf.getText().length()-1);
					backSpace= str.toString();
					tf.setText(backSpace);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(10, 79, 51, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(" ");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(71, 79, 51, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("%");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a= Double.parseDouble(tf.getText());
				operator=1;
				tf.setText("");
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(132, 79, 51, 51);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("+");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a= Double.parseDouble(tf.getText());
				operator=2;
				tf.setText("");
			}
		});
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_2.setBounds(193, 79, 51, 51);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("7");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tf.setText(tf.getText().concat("7"));
			}
		});
		btnNewButton_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3.setBounds(10, 141, 51, 51);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("8");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("8"));

			}
		});
		btnNewButton_1_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_4.setBounds(71, 141, 51, 51);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("9");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("9"));

			}
		});
		btnNewButton_1_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_5.setBounds(132, 141, 51, 51);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("-");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a= Double.parseDouble(tf.getText());
				operator=3;
				tf.setText("");
			}
		});
		btnNewButton_1_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_6.setBounds(193, 141, 51, 51);
		contentPane.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_3_1 = new JButton("4");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("4"));

			}
		});
		btnNewButton_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_1.setBounds(10, 203, 51, 51);
		contentPane.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_3_2 = new JButton("5");
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("5"));

			}
		});
		btnNewButton_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_2.setBounds(71, 203, 51, 51);
		contentPane.add(btnNewButton_1_3_2);
		
		JButton btnNewButton_1_3_3 = new JButton("6");
		btnNewButton_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("6"));

			}
		});
		btnNewButton_1_3_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_3.setBounds(132, 203, 51, 51);
		contentPane.add(btnNewButton_1_3_3);
		
		JButton btnNewButton_1_3_4 = new JButton("/");
		btnNewButton_1_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a= Double.parseDouble(tf.getText());
				operator=4;
				tf.setText("");
			}
		});
		btnNewButton_1_3_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_4.setBounds(192, 203, 51, 51);
		contentPane.add(btnNewButton_1_3_4);
		
		JButton btnNewButton_1_3_5 = new JButton("1");
		btnNewButton_1_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("1"));

			}
		});
		btnNewButton_1_3_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_5.setBounds(10, 265, 51, 51);
		contentPane.add(btnNewButton_1_3_5);
		
		JButton btnNewButton_1_3_6 = new JButton("2");
		btnNewButton_1_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("2"));

			}
		});
		btnNewButton_1_3_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_6.setBounds(71, 265, 51, 51);
		contentPane.add(btnNewButton_1_3_6);
		
		JButton btnNewButton_1_3_7 = new JButton("3");
		btnNewButton_1_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("3"));

			}
		});
		btnNewButton_1_3_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_7.setBounds(132, 265, 51, 51);
		contentPane.add(btnNewButton_1_3_7);
		
		JButton btnNewButton_1_3_8 = new JButton("*");
		btnNewButton_1_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a= Double.parseDouble(tf.getText());
				operator=5;
				tf.setText("");
			}
		});
		btnNewButton_1_3_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_8.setBounds(193, 265, 51, 51);
		contentPane.add(btnNewButton_1_3_8);
		
		JButton btnNewButton_1_3_10 = new JButton("0");
		btnNewButton_1_3_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("0"));

			}
		});
		btnNewButton_1_3_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_10.setBounds(71, 327, 51, 51);
		contentPane.add(btnNewButton_1_3_10);
		
		JButton btnNewButton_1_3_11 = new JButton("+/-");
		btnNewButton_1_3_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops= Double.parseDouble(String.valueOf(tf.getText()));
			ops=ops*(-1);
			tf.setText(String.valueOf(ops));
			
			}
		});
		btnNewButton_1_3_11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1_3_11.setBounds(132, 327, 51, 51);
		contentPane.add(btnNewButton_1_3_11);
		
		JButton btnNewButton_1_3_12 = new JButton("=");
		btnNewButton_1_3_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			b= Double.parseDouble(tf.getText());
			
			switch(operator) {
			case 1: result= a%b;
					break;
			case 2: result= a+b;
			       break;
			case 3: result= a-b;
			break;
			case 4: result= a/b;
			break;
			case 5: result= a*b;
			break;
			
			default: result=0;
			}
			tf.setText(""+result);
			}
		});
		btnNewButton_1_3_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_12.setBounds(193, 327, 51, 51);
		contentPane.add(btnNewButton_1_3_12);
		
		JButton btnNewButton_1_3_9 = new JButton(".");
		btnNewButton_1_3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat("."));

			}
		});
		btnNewButton_1_3_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_3_9.setBounds(10, 327, 51, 51);
		contentPane.add(btnNewButton_1_3_9);
	}
}