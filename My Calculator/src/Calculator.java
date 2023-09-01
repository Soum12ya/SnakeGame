import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

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
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(21, 20, 391, 85);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn_backspace = new JButton("<-");
		btn_backspace.setForeground(new Color(0, 0, 0));
		btn_backspace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btn_backspace.setBounds(21, 144, 85, 63);
		contentPane.add(btn_backspace);
		
		JButton btn_7 = new JButton("7");
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setBounds(21, 214, 85, 63);
		contentPane.add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_4.setBounds(21, 283, 85, 63);
		contentPane.add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_1.setBounds(21, 348, 85, 63);
		contentPane.add(btn_1);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_0.setBounds(21, 413, 85, 63);
		contentPane.add(btn_0);
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setForeground(new Color(255, 0, 0));
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_clear.setBounds(128, 144, 85, 63);
		contentPane.add(btn_clear);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_8.setBounds(128, 214, 85, 63);
		contentPane.add(btn_8);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_5.setBounds(128, 283, 85, 63);
		contentPane.add(btn_5);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_2.setBounds(128, 348, 85, 63);
		contentPane.add(btn_2);
		
		JButton btn_point = new JButton(".");
		btn_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_point.getText();
				textField.setText(number);
			}
		});
		btn_point.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_point.setBounds(128, 413, 85, 63);
		contentPane.add(btn_point);
		
		JButton btn_00 = new JButton("00");
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_00.getText();
				textField.setText(number);
			}
		});
		btn_00.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_00.setBounds(223, 144, 85, 63);
		contentPane.add(btn_00);
		
		JButton btn_9 = new JButton("9");
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setBounds(223, 214, 85, 63);
		contentPane.add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_6.setBounds(223, 283, 85, 63);
		contentPane.add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_3.setBounds(223, 348, 85, 63);
		contentPane.add(btn_3);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				
				
				
				
				
				
			}
		});
		btn_equal.setForeground(new Color(255, 0, 0));
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_equal.setBounds(223, 413, 85, 63);
		contentPane.add(btn_equal);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btn_plus.setForeground(new Color(255, 128, 0));
		btn_plus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_plus.setBounds(327, 144, 85, 63);
		contentPane.add(btn_plus);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btn_minus.setForeground(new Color(255, 128, 64));
		btn_minus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn_minus.setBounds(327, 214, 85, 63);
		contentPane.add(btn_minus);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.setForeground(new Color(255, 128, 64));
		btn_multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btn_multiply.setBounds(327, 283, 85, 63);
		contentPane.add(btn_multiply);
		
		JButton btn_divide = new JButton("/");
		btn_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btn_divide.setForeground(new Color(255, 128, 64));
		btn_divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_divide.setBounds(327, 348, 85, 63);
		contentPane.add(btn_divide);
		
		JButton btn_percent = new JButton("%");
		btn_percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btn_percent.setForeground(new Color(255, 128, 64));
		btn_percent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_percent.setBounds(327, 413, 85, 63);
		contentPane.add(btn_percent);
	}
}
