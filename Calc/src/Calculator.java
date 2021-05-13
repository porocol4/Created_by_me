import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator {
	
	private JFrame frame;
	private String func = " ";
	private double  firstNum;
	

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
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("±º∏≤", Font.PLAIN, 40));
		frame.setBounds(100, 100, 406, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel ansLabel = new JLabel("0");
		ansLabel.setForeground(Color.WHITE);
		ansLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		ansLabel.setFont(new Font("±º∏≤", Font.PLAIN, 50));
		ansLabel.setBounds(12, 10, 368, 101);
		frame.getContentPane().add(ansLabel);
		
		JButton BT_Point = new JButton(".");
		BT_Point.setForeground(Color.WHITE);
		BT_Point.setBackground(Color.GRAY);
		BT_Point.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT_Point.setBounds(0, 411, 97, 90);
		frame.getContentPane().add(BT_Point);
		
		JButton BT0 = new JButton("0");
		BT0.setForeground(Color.WHITE);
		BT0.setBackground(Color.LIGHT_GRAY);
		BT0.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT0.setBounds(98, 411, 97, 90);
		frame.getContentPane().add(BT0);
		
		JButton BT_Euqal = new JButton("=");
		BT_Euqal.setBackground(Color.GRAY);
		BT_Euqal.setForeground(Color.WHITE);
		BT_Euqal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(func) {
				
				case "Plus" : {
					double curr = Double.parseDouble(ansLabel.getText()); // Double.parseDouble -> πÆ¿⁄ø≠¿ª double∑Œ ∫Ø»Ø
					ansLabel.setText((firstNum+curr)+"");				// ansLabel¿∫ String¿Ãπ«∑Œ µ⁄ø° +""∏¶ ∫Ÿ¿Ã∏È String¿∏∑Œ ∫Ø»Ø
					
					break;
					}
				
				case "Minor" : {
					double curr = Double.parseDouble(ansLabel.getText());
					ansLabel.setText((firstNum-curr)+"");
					
					break;
				}
				
				case "X" : {
					double curr = Double.parseDouble(ansLabel.getText());
					ansLabel.setText((firstNum*curr)+"");
					
					break;
				}
				
				case "S" : {
					double curr = Double.parseDouble(ansLabel.getText());
					ansLabel.setText((firstNum/curr)+"");
					
					break;
				}
				
				}
			}
		});
		BT_Euqal.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT_Euqal.setBounds(196, 411, 97, 90);
		frame.getContentPane().add(BT_Euqal);
		
		JButton BT_S = new JButton("/");
		BT_S.setForeground(Color.WHITE);
		BT_S.setBackground(Color.ORANGE);
		BT_S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EXIT_Num = ansLabel.getText();
				firstNum = Double.parseDouble(EXIT_Num);
				ansLabel.setText("0");
				func = "S";
			}
		});
		BT_S.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT_S.setBounds(294, 411, 97, 90);
		frame.getContentPane().add(BT_S);
		
		JButton BT1 = new JButton("1");
		BT1.setForeground(Color.WHITE);
		BT1.setBackground(Color.LIGHT_GRAY);
		BT1.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT1.setBounds(0, 320, 97, 90);
		frame.getContentPane().add(BT1);
		
		JButton BT2 = new JButton("2");
		BT2.setForeground(Color.WHITE);
		BT2.setBackground(Color.LIGHT_GRAY);
		BT2.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT2.setBounds(98, 320, 97, 90);
		frame.getContentPane().add(BT2);
		
		JButton BT3 = new JButton("3");
		BT3.setForeground(Color.WHITE);
		BT3.setBackground(Color.LIGHT_GRAY);
		BT3.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT3.setBounds(196, 320, 97, 90);
		frame.getContentPane().add(BT3);
		
		JButton BT_X = new JButton("X");
		BT_X.setForeground(Color.WHITE);
		BT_X.setBackground(Color.ORANGE);
		BT_X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EXIT_Num = ansLabel.getText();
				firstNum = Double.parseDouble(EXIT_Num);
				ansLabel.setText("0");
				func = "X";
			}
		});
		BT_X.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT_X.setBounds(294, 320, 97, 90);
		frame.getContentPane().add(BT_X);
		
		JButton BT4 = new JButton("4");
		BT4.setForeground(Color.WHITE);
		BT4.setBackground(Color.LIGHT_GRAY);
		BT4.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT4.setBounds(0, 230, 97, 90);
		frame.getContentPane().add(BT4);
		
		JButton BT5 = new JButton("5");
		BT5.setForeground(Color.WHITE);
		BT5.setBackground(Color.LIGHT_GRAY);
		BT5.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT5.setBounds(98, 230, 97, 90);
		frame.getContentPane().add(BT5);
		
		JButton BT6 = new JButton("6");
		BT6.setForeground(Color.WHITE);
		BT6.setBackground(Color.LIGHT_GRAY);
		BT6.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT6.setBounds(196, 230, 97, 90);
		frame.getContentPane().add(BT6);
		
		JButton BT_Minor = new JButton("-");
		BT_Minor.setForeground(Color.WHITE);
		BT_Minor.setBackground(Color.ORANGE);
		BT_Minor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EXIT_Num = ansLabel.getText();
				firstNum = Double.parseDouble(EXIT_Num);
				ansLabel.setText("0");
				func = "Minor";
			}
		});
		BT_Minor.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT_Minor.setBounds(294, 230, 97, 90);
		frame.getContentPane().add(BT_Minor);
		
		JButton BT7 = new JButton("7");
		BT7.setForeground(Color.WHITE);
		BT7.setBackground(Color.LIGHT_GRAY);
		BT7.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT7.setBounds(0, 140, 97, 90);
		frame.getContentPane().add(BT7);
		
		JButton BT8 = new JButton("8");
		BT8.setForeground(Color.WHITE);
		BT8.setBackground(Color.LIGHT_GRAY);
		BT8.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT8.setBounds(98, 140, 97, 90);
		frame.getContentPane().add(BT8);
		
		JButton BT9 = new JButton("9");
		BT9.setForeground(Color.WHITE);
		BT9.setBackground(Color.LIGHT_GRAY);
		BT9.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT9.setBounds(196, 140, 97, 90);
		frame.getContentPane().add(BT9);
		
		JButton BT_Plus = new JButton("+");
		BT_Plus.setBackground(Color.ORANGE);
		BT_Plus.setForeground(Color.WHITE);
		BT_Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EXIT_Num = ansLabel.getText();
				firstNum = Double.parseDouble(EXIT_Num);
				ansLabel.setText("0");
				func = "Plus";
			}
		});
		BT_Plus.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		BT_Plus.setBounds(294, 140, 97, 90);
		frame.getContentPane().add(BT_Plus);
		
		BT_Point.addActionListener(new ButtonActionListener(ansLabel, "."));
		BT0.addActionListener(new ButtonActionListener(ansLabel, "0"));
		BT1.addActionListener(new ButtonActionListener(ansLabel, "1"));
		BT2.addActionListener(new ButtonActionListener(ansLabel, "2"));
		BT3.addActionListener(new ButtonActionListener(ansLabel, "3"));
		BT4.addActionListener(new ButtonActionListener(ansLabel, "4"));
		BT5.addActionListener(new ButtonActionListener(ansLabel, "5"));
		BT6.addActionListener(new ButtonActionListener(ansLabel, "6"));
		BT7.addActionListener(new ButtonActionListener(ansLabel, "7"));
		BT8.addActionListener(new ButtonActionListener(ansLabel, "8"));
		BT9.addActionListener(new ButtonActionListener(ansLabel, "9"));
		
		JButton btnNewButton = new JButton("C l e a r");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ansLabel.setText("0");
				firstNum = 0;
			}
		});
		btnNewButton.setFont(new Font("±º∏≤", Font.BOLD, 20));
		btnNewButton.setBounds(0, 107, 391, 31);
		frame.getContentPane().add(btnNewButton);
		
				
	}
}


class ButtonActionListener implements ActionListener{
	
	private JLabel label;
	private String text;
	
	public ButtonActionListener(JLabel l, String t) {
		label = l;
		text = t;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String result_label = label.getText();
		
		if (result_label.equals("0")) {
			label.setText(text);
		}
		
		else {
			label.setText(label.getText()+text);
		}
		
	}
	
}