package pack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class A implements ItemListener
{
	JFrame frame;
	Container con;
	JRadioButton btn1;
	JRadioButton btn2;
	JRadioButton btn3;
	JLabel label;
	public void GUI()
	{
		frame = new JFrame("Event Handler");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setBounds(200,200,300,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		con=frame.getContentPane();

		label = new JLabel("Muhammad Ahsan");
		con.add(label);
		label.setBounds(100,100,300,40);

		btn1 = new JRadioButton("A");
		con.add(btn1);
		btn1.setBounds(70,200,40,25);

		btn2 = new JRadioButton("B");
		con.add(btn2);
		btn2.setBounds(130,200,40,25);

		btn3 = new JRadioButton("C");
		con.add(btn3);
		btn3.setBounds(180,200,40,25);

		ButtonGroup grup = new ButtonGroup();
		grup.add(btn1);  
		grup.add(btn2);
		grup.add(btn3);

		btn1.addItemListener(this);
		btn2.addItemListener(this);
		btn3.addItemListener(this);

	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==btn1)
		{
			label.setText("A is now Selected");
			con.setBackground(Color.green);
		}
		if(e.getSource()==btn2)
		{
			label.setText("B is now Selected");
			con.setBackground(Color.blue);
		}
		if(e.getSource()==btn3)
		{
			label.setText("C is now Selected");
			con.setBackground(Color.);
		}
	}
}

class Radio_Event
{
	public static void main(String[] args) {
		A obj = new A();
		obj.GUI();
	}
}