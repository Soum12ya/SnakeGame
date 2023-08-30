import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JEditorPane;

public class MyAdditon extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * @wbp.nonvisual location=253,4
	 */
	private final JLabel label = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
	/**
	 * @wbp.nonvisual location=253,4
	 */
	private final JLabel label_1 = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyAdditon frame = new MyAdditon();
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
	public MyAdditon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Add Two Numbers", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));

		setContentPane(contentPane);
		
		JLabel lblNewLabel_2 = new JLabel("First Number : ");
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Second Number : ");
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				num1 = Float.parseFloat(textField_2.getText());
				num2 = Float.parseFloat(textField.getText());
				result = num1 + num2;
				textField_1.setText(String.valueOf(result));
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel(" Result : ");
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1);
		textField_1.setColumns(15);
		
		JButton btnNewButton_1 = new JButton("clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_2.setText("");
				textField_1.setText("");
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton_2);
	}

}
