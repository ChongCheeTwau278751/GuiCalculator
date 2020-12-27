import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 887, 602);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldNum1.setBounds(65, 52, 351, 81);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldNum2.setBounds(428, 52, 351, 81);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				
			}
			}
		
		});
		btnNewButton.setBounds(189, 163, 227, 92);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton_1.setBounds(428, 163, 227, 92);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldAns.setText("");
		textFieldAns.setBounds(247, 419, 390, 70);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("The Answer is");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_2.setBounds(12, 419, 223, 70);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnMultiply = new JButton("MULTIPLY");
		btnMultiply.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnMultiply.setBounds(189, 263, 227, 92);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("DIVIDE");
		btnDivide.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 / num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
			}
			}
		});
		btnDivide.setBounds(428, 263, 227, 92);
		frame.getContentPane().add(btnDivide);
	}
}
