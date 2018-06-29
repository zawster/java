package pack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A implements ActionListener
{
	JFrame frame;
	Container con;
	JButton button;
	JButton button1;
	JRadioButton btn1;
	JRadioButton btn2;

	public void initGUI()
	{
		frame = new JFrame("Event Handler");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setBounds(200,200,500,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		con=frame.getContentPane();

		button = new JButton("Green");
		con.add(button);
		button.setBounds(200,300,100,25);
		button.addActionListener(this);   //  on button click

		button1 = new JButton("Yellow");
		con.add(button1);
		button1.setBounds(50,300,100,25);
		button1.addActionListener(this);   //  on button click

		btn1 = new JRadioButton("A");
		con.add(btn1);
		btn1.setBounds(150,200,40,20);

		btn2 = new JRadioButton("B");
		con.add(btn2);
		btn2.setBounds(200,200,40,20);

		btn1.setSelected(true);  // it will be selected when function is called
		//btn2.setEnabled(false);  // it will diablethe radio button

		ButtonGroup grup =new ButtonGroup();
		grup.add(btn1);
		grup.add(btn2);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button)
		{
			con.setBackground(Color.green);
		}
		else 
		{
			con.setBackground(Color.blue);
		}
	}
}

class Events
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.initGUI();
	}
}