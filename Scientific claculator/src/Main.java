import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorLayout frame = new CalculatorLayout();
		frame.setTitle("Pouchon Calculator Scientific");
		frame.setSize(350, 450);
		frame.getContentPane().setBackground(null);
		frame.setLocationRelativeTo(null);
		//frame.setMaximizedBounds(new Rectangle(300, 200));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
