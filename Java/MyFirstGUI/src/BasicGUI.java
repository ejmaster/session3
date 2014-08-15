import java.awt.BorderLayout;
import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;


public class BasicGUI {

	public static void main(String[] args) {
	
		//Creates new window
		JFrame window = new JFrame();
		
		window.setSize(400, 300);
		
		//Displays window
		window.setVisible(true);
		
		//Helps close window
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set title
		window.setTitle("Eric is awesome");
		
		Container arrangement = window.getContentPane();
		//GridLayout myLayout = new GridLayout(2,2);
		//FlowLayout myLayout = new FlowLayout();
		BorderLayout myLayout = new BorderLayout();
		
		arrangement.setLayout(myLayout);
		
		arrangement.add(new JLabel("Eric's label"), BorderLayout.CENTER);
		arrangement.add(new JButton("'Uuenuehfuehuecnekandeukcnurfjadujhfuekfhurhejhfduhdjeueefhfjdhufh' Button!"), BorderLayout.SOUTH);
		arrangement.add(new JSlider(), BorderLayout.NORTH);
		arrangement.add(new JTextField("hi"), BorderLayout.AFTER_LINE_ENDS);
	}
	

}
