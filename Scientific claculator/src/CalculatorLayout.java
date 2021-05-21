import javax.swing.*;
import java.awt.*;

public class CalculatorLayout extends JFrame 
{
	private JButton bOne = new JButton("1");
	private JButton bTwo = new JButton("2");
	private JButton bThree = new JButton("3");
	private JButton bFour = new JButton("4");
	private JButton bFive = new JButton("5");
	private JButton bSix = new JButton("6");
	private JButton bSeven = new JButton("7");
	private JButton bEight = new JButton("8");
	private JButton bNine = new JButton("9");
	private JButton bZero = new JButton("0");
	private JButton bMul = new JButton("\u00D7");
	private JButton bDiv = new JButton("\u00F7");
	private JButton bAdd = new JButton("+");
	private JButton bSub = new JButton("\u02D7");
	private JButton bEqual = new JButton("=");
	private JButton bPoint = new JButton(".");
	private JButton dg = new JButton("Ra");
	private JButton ra = new JButton("De");
	private JButton crg = new JButton("(");
	private JButton crd = new JButton(")");
	private JButton bDel = new JButton("DE");
	private JButton bClear = new JButton("C");
	private JButton bSquare = new JButton("x\u00B2");
	private JButton bCube = new JButton("x\u00B3");
	private JButton bSqrt = new JButton("\u221A");
	private JButton bPercent = new JButton("%");
	private JButton bMod = new JButton("Mod");
	private JButton bOneByN = new JButton("1/n");
	private JButton bPlusMinus = new JButton("\u00B1");

	private JButton bSin = new JButton("sin");
	private JButton bCos = new JButton("cos");
	private JButton bTan = new JButton("tan");
	private JButton bAsin = new JButton("asin");
	private JButton bAcos = new JButton("acos");
	private JButton bAtan = new JButton("atan");
	private JButton bSinH = new JButton("sinh");
	private JButton bCosH = new JButton("cosh");
	private JButton bTanH = new JButton("tanh");
	private JButton bPowerOfTen = new JButton("10^n");
	private JButton bLog = new JButton("log");
	private JButton bLn = new JButton("ln");
	private JButton bAbs = new JButton("abs");
	private JButton bExit = new JButton("EXIT");
	
	private JTextField tfDisplay = new JTextField();
	static Color windowColor = new Color(132, 141, 151);

	public CalculatorLayout()
	{
		setBackground(windowColor);
		setLayout(null);
		JPanel pScreen2 = new JPanel();
		JPanel pKeypad1 = new JPanel();
		JPanel pKeypad2 = new JPanel(); 
	
		Color screenColor = new Color(72, 81, 91);
	
		add(pScreen2).setBounds(5, 35, 323, 50);
		pScreen2.add(tfDisplay);
		pScreen2.setLayout(null);
		tfDisplay.setBounds(0, 0, 343, 50);
		tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
		tfDisplay.setText("");
		tfDisplay.setEditable(false);
		tfDisplay.setBackground(screenColor);
		tfDisplay.setForeground(Color.BLACK);

		
		add(pKeypad1).setBounds(0, 100, 343, 190);
		pKeypad1.setLayout(null);
		pKeypad1.setBackground(windowColor);
		pKeypad1.add(dg).setBounds(118, 0, 54, 38);		pKeypad1.add(ra).setBounds(172, 0, 54, 38);
		pKeypad1.add(crg).setBounds(10, 0, 54, 38);		pKeypad1.add(crd).setBounds(65, 0, 54, 38);
		pKeypad1.add(bDel).setBounds(226, 0, 54, 38);		pKeypad1.add(bClear).setBounds(280, 0, 54, 38);
		pKeypad1.add(bSeven).setBounds(10, 38, 54, 38);pKeypad1.add(bEight).setBounds(64, 38, 54, 38);pKeypad1.add(bNine).setBounds(118, 38, 54, 38);	
		pKeypad1.add(bMul).setBounds(172, 38, 54, 38);pKeypad1.add(bDiv).setBounds(226, 38, 54, 38);pKeypad1.add(bSquare).setBounds(280, 38, 54, 38);
		pKeypad1.add(bFour).setBounds(10, 76, 54, 38);pKeypad1.add(bFive).setBounds(64, 76, 54, 38);pKeypad1.add(bSix).setBounds(118, 76, 54, 38);
		pKeypad1.add(bAdd).setBounds(172, 76, 54, 38);pKeypad1.add(bSub).setBounds(226, 76, 54, 38);pKeypad1.add(bCube).setBounds(280, 76, 54, 38);
		pKeypad1.add(bOne).setBounds(10, 114, 54, 38);pKeypad1.add(bTwo).setBounds(64, 114, 54, 38);pKeypad1.add(bThree).setBounds(118, 114, 54, 38);
		pKeypad1.add(bEqual).setBounds(172, 114, 108, 38);pKeypad1.add(bMod).setBounds(280, 114, 54, 38);
		pKeypad1.add(bZero).setBounds(10, 152, 54, 38);pKeypad1.add(bPoint).setBounds(64, 152, 54, 38);pKeypad1.add(bPlusMinus).setBounds(118, 152, 54, 38);
		pKeypad1.add(bOneByN).setBounds(172, 152, 54, 38);pKeypad1.add(bPercent).setBounds(226, 152, 54, 38);pKeypad1.add(bSqrt).setBounds(280, 152, 54, 38);	
		
	
			
		add(pKeypad2).setBounds(0, 290, 333, 145);
		pKeypad2.setLayout(null);
		pKeypad2.setBackground(windowColor);
		pKeypad2.add(bSin).setBounds(10, 0, 65, 38);pKeypad2.add(bCos).setBounds(75, 0, 65, 38);pKeypad2.add(bTan).setBounds(140, 0, 65, 38);
		pKeypad2.add(bLog).setBounds(205, 0, 65, 38);pKeypad2.add(bLn).setBounds(270, 0, 64, 38);
		pKeypad2.add(bAsin).setBounds(10, 38, 65, 38);pKeypad2.add(bAcos).setBounds(75, 38, 65, 38);pKeypad2.add(bAtan).setBounds(140, 38, 65, 38);
		pKeypad2.add(bPowerOfTen).setBounds(205, 38, 65, 38);pKeypad2.add(bAbs).setBounds(270, 38, 64, 38);
		pKeypad2.add(bSinH).setBounds(10, 76, 65, 38);pKeypad2.add(bCosH).setBounds(75, 76, 65, 38);pKeypad2.add(bTanH).setBounds(140, 76, 65, 38);
		pKeypad2.add(bExit).setBounds(205, 76, 130, 38);
		

	}
}