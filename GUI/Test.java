package pack;
import javax.swing.*;
import java.awt.*;
class Test
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("GUI Program");
		frame.setVisible(true);
		//frame.setSize(350,350);   (width,height);
		frame.setBounds(200,200,500,500);   //  setBounds(left,top,width,height);
		frame.setLayout(null);   //  apni marzi ki  locations kay liye
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		Container obj = frame.getContentPane();   //  getContentPane  return the access of pane
		obj.setBackground(Color.green);

		JLabel label=new JLabel();
		obj.add(label);
		label.setBounds(150,30,300,60);
		label.setText("Muhammad Ahsan");
		label.setForeground(Color.GRAY);
		String str=label.getText();
		
		Font font = new Font("Serif Bold italic",Font.BOLD,20);   //   (font style , bold/italic/plane , font size)
		label.setFont(font);

		JButton button = new JButton("Click Here");
		obj.add(button);
		button.setBounds(200,300,100,20);
		//button.setText();
		button.setBackground(Color.PINK);
		button.setForeground(Color.BLUE);


		JTextField text = new JTextField();
		obj.add(text);
		text.setBounds(150,250,200,30);
		text.setText("Enter any number..");
		text.setForeground(Color.black);
		str=text.getText();
		System.out.println(str);


	}
}