package railway;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {
	JLabel Texta;
	JLabel Textb;
	static JTextField d1;
	static JTextField a1;
	static JTextField d2;
	static JTextField a2;
	static JTextField d3;
	static JTextField a3;
	static JTextField d4;
	static JTextField a4;
	static JTextField d5;
	static JTextField a5;
	JButton button;
	Main() {		
		setLayout(new FlowLayout());
		Texta = new JLabel();
		Texta.setText("Enter the Train schedule A in 'HH:MM' format:");
		d1 = new JTextField(15);
		a1 = new JTextField(15);
		d2 = new JTextField(15);
		a2 = new JTextField(15);
		d3=new JTextField(15);
		a3=new JTextField(15);
		this.add(Texta);
		this.add(d1);
		this.add(a1);
		this.add(d2);
		this.add(a2);
		this.add(d3);
		this.add(a3);
		Textb = new JLabel();
		Textb.setText("Enter the Train schedule B in 'HH:MM' format: ");
		d4 = new JTextField(15);
		a4 = new JTextField(15);
		d5 = new JTextField(15);
		a5 = new JTextField(15);
		this.add(Textb);
		this.add(d4);
		this.add(a4);
		this.add(d5);
		this.add(a5);
		button=new JButton();
		button.addActionListener(this);
		button.setText("Result");
		this.add(button);
	}
	public static int[] findNoofTrains(String s1[][],String s2[][]) {
		int countA=0;
		int countB=0;
		List<String> DepA = new ArrayList<String>();
		List<String> ArrA = new ArrayList<String>();
		List<String> DepB = new ArrayList<String>();
		List<String> ArrB = new ArrayList<String>();
		
		for (int i = 0; i < s1.length; i++) {
			DepA.add(s1[i][0]);
			ArrA.add(s1[i][1]);
		}
		for (int i = 0; i < s2.length; i++) {
			DepB.add( s2[i][0]);
			ArrB.add( s2[i][1]);
		}
		for (int i = 0; i < DepA.size(); i++) {
			if (ArrB.isEmpty()) {
				countA = DepA.size();
				break;
			}
			if (Collections.min(ArrB).compareTo(DepA.get(i)) < 0) {
				ArrB.remove(Collections.min(ArrB));
				continue;
			} 
			else {
				countA++;
			}
		}
		for (int i = 0; i < DepB.size(); i++) {
			if (ArrA.isEmpty()) {
				countB = DepB.size();
				break;
			}
			if (Collections.min(ArrA).compareTo(DepB.get(i)) < 0) {
				ArrA.remove(Collections.min(ArrA));
				continue;
			} else {
				countB++;
			}
		}
		System.out.println("Total Train need in station A : " + countA);
		System.out.println("Total Train need in station B : " + countB);
		int[] ans= {countA,countB};
		return ans;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String[][] s1 = new String[3][2];
				s1[0][0] = d1.getText();
				s1[0][1] = a1.getText();
				s1[1][0] = d2.getText();
				s1[1][1] = a2.getText();
				s1[2][0] = d3.getText();
				s1[2][1] = a3.getText();
			String[][] s2 = new String[2][2];
			s2[0][0] = d4.getText();
			s2[0][1] = a4.getText();
			s2[1][0] = d5.getText();
			s2[1][1] = a5.getText();		
			int []a=findNoofTrains(s1, s2);
			JOptionPane.showMessageDialog(button,"Total Train need in station A : "+a[0]+" \nTotal Train need in station B : "+a[1]);
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.setSize(400, 300);
		m.setVisible(true);
		m.setResizable(false);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}