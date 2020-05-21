package ranjith;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class calc {

	JFrame frame;
	private JTextField t1;
	public static String op;
	public static String str;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 519, 74);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(0, 22, 519, 52);
		t1.setHorizontalAlignment(SwingConstants.RIGHT);
		t1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		panel.add(t1);
		t1.setColumns(10);
		
		JLabel l1 = new JLabel("");
		l1.setHorizontalAlignment(SwingConstants.RIGHT);
		l1.setBounds(338, 0, 171, 22);
		panel.add(l1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 74, 519, 330);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton b1 = new JButton("1");
		b1.setForeground(Color.GRAY);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(t1.getText()+"1");
				
			}
		});
		panel_1.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setMnemonic('x');
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	t1.setText(t1.getText()+"2");
			}
		});
		panel_1.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	t1.setText(t1.getText()+"3");
			}
		});
		panel_1.add(b3);
		
		JButton bac = new JButton("AC");
		bac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
			}
		});
		panel_1.add(bac);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	t1.setText(t1.getText()+"4");
			}
		});
		panel_1.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	t1.setText(t1.getText()+"5");
			}
		});
		panel_1.add(b5);
		
		JButton button = new JButton("6");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	t1.setText(t1.getText()+"6");
			}
		});
		panel_1.add(button);

		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	t1.setText(t1.getText()+"8");
			}
		});
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 str=t1.getText();
				 l1.setText(str+"+");
				t1.setText("");
				op="+";
			}
		});
		panel_1.add(button_1);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	t1.setText(t1.getText()+"7");
			}
		});
		panel_1.add(b7);
		
		panel_1.add(b8);
		
		JButton bsub = new JButton("-");
		bsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 str=t1.getText();
				 l1.setText(str+"-");
				t1.setText("");
				op="-";
			}
		});
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	t1.setText(t1.getText()+"9");
			}
		});
		panel_1.add(b9);
		panel_1.add(bsub);
		
		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=t1.getText();
				 l1.setText(str+"/");
				t1.setText("");
				op="/";
			}
		});
		panel_1.add(bdiv);
		
		JButton btnNewButton_13 = new JButton("0");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	t1.setText(t1.getText()+"0");
			}
		});
		panel_1.add(btnNewButton_13);
		
		JButton bmul = new JButton("x");
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 str=t1.getText();
				 l1.setText(str+"x");
				t1.setText("");
				op="x";
			}
		});
		panel_1.add(bmul);
		
		JButton beq = new JButton("=");
		beq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(str);
				int b=Integer.parseInt(t1.getText());
				int x = 0;
				switch(op)
				{
				case "+":x=a+b;break;
				case "-":x=a-b;break;
				case "x":x=a*b;break;
				case "/":x=a/b;break;
				}
				String str1 = Integer.toString(x); 
				t1.setText(str1);
				 l1.setText("");
			}
		});
		panel_1.add(beq);
	}

	protected String String(int x) {
		// TODO Auto-generated method stub
		return null;
	}
}
