import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FinalProject implements ActionListener {

	JButton Button1;

	JButton Button2;
	
	JButton Button3;

	JButton Button4;

	JButton Button5;
	
	JButton Button6;

	JButton Button7;

	JButton Button8;

	JButton Button9;

	JButton Button0;

	JButton ButtonAdd;

	JButton ButtonSubtract;

	JButton ButtonMultiplayer;

	JButton ButtonDivide;
	
	JLabel label;
	
	int
	FirstNumber,
	SecondNumber,
	Answer,
	Operation,
	buttonPress;
	
	
	String 
	Equation;
	
	public static void main(String[] args) {
		
		new FinalProject();
		
		
		
		
	}
	
	public FinalProject(){
		buttonPress = 1;
		JFrame window = new JFrame();
		window.setSize(600,400);
		window.setVisible(true);
		window.setTitle("Button Game 5000.1");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container arrangement = window.getContentPane();
		arrangement.setLayout(new GridLayout(10,10));
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(1,10));
		
		label = new JLabel();
		
		Button1 = new JButton("Button1");
		Button1.addActionListener(this);
		Button1.setText("1");
		Button1.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button1);
		
		Button2 = new JButton("Button2");
		Button2.addActionListener(this);
		Button2.setText("2");
		Button2.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button2);
		
		Button3 = new JButton("Button3");
		Button3.addActionListener(this);
		Button3.setText("3");
		Button3.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button3);
		
		Button4 = new JButton("Button4");
		Button4.addActionListener(this);
		Button4.setText("4");
		Button4.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button4);
		
		Button5 = new JButton("Button5");
		Button5.addActionListener(this);
		Button5.setText("5");
		Button5.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button5);
		
		Button6 = new JButton("Button6");
		Button6.addActionListener(this);
		Button6.setText("6");
		Button6.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button6);
		
		Button7 = new JButton("Button7");
		Button7.addActionListener(this);
		Button7.setText("7");
		Button7.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button7);
		
		Button8 = new JButton("Button8");
		Button8.addActionListener(this);
		Button8.setText("8");
		Button8.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button8);
		
		Button9 = new JButton("Button9");
		Button9.addActionListener(this);
		Button9.setText("9");
		Button9.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button9);
		
		Button0 = new JButton("Button0");
		Button0.addActionListener(this);
		Button0.setText("0");
		Button0.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(Button0);
		
		ButtonAdd = new JButton("ButtonAdd");
		ButtonAdd.addActionListener(this);
		ButtonAdd.setText("+");
		ButtonAdd.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(ButtonAdd);
		
		ButtonSubtract = new JButton("ButtonSubtract");
		ButtonSubtract.addActionListener(this);
		ButtonSubtract.setText("-");
		ButtonSubtract.setFont(new Font("Serif", Font.PLAIN, 40));
		buttonsPanel.add(ButtonSubtract);
		
		label.setText("0");
		arrangement.add(buttonsPanel, BorderLayout.NORTH);
		arrangement.add(label, BorderLayout.SOUTH, (Answer));
			}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Button1){
			if(buttonPress == 1){
				FirstNumber = 1;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 1;
			}
		}
		if(e.getSource() == Button2){
			if(buttonPress == 1){
				FirstNumber = 2;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 2;
			}
		}
		if(e.getSource() == Button3){
			if(buttonPress == 1){
				FirstNumber = 3;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 3;
			}
		}
		if(e.getSource() == Button4){
			if(buttonPress == 1){
				FirstNumber = 4;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 4;
			}
		}
		if(e.getSource() == Button5){
			if(buttonPress == 1){
				FirstNumber = 5;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 5;
			}
		}
		if(e.getSource() == Button6){
			if(buttonPress == 1){
				FirstNumber = 6;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 6;
			}
		}
		if(e.getSource() == Button7){
			if(buttonPress == 1){
				FirstNumber = 7;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 7;
			}

		}
		if(e.getSource() == Button8){
			if(buttonPress == 1){
				FirstNumber = 8;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 8;
			}
		
		}
		if(e.getSource() == Button8){
			if(buttonPress == 1){
				FirstNumber = 8;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 8;
			}

		}
		if(e.getSource() == Button9){
			if(buttonPress == 1){
				FirstNumber = 9;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 9;
			}

		}
		if(e.getSource() == Button0){
			if(buttonPress == 1){
				FirstNumber = 0;
				buttonPress += 1;
			}
			if(buttonPress == 3){
				SecondNumber = 0;
			}

	}
	if(e.getSource() == ButtonAdd){
		if(buttonPress == 2){
			Operation = 1;
			buttonPress +=1 ;
		}
	}
	
	if(e.getSource() == ButtonSubtract){
		if(buttonPress == 2){
			Operation = 2;
			buttonPress +=1 ;
		}
	}
	
	
	
	if(buttonPress == 3){
		
	
		if (Operation == 1){
			Answer=FirstNumber+SecondNumber;
			String AnswerS = Integer.toString(Answer);
			label.setText(AnswerS);
		}
		if(Operation == 2){
			Answer = FirstNumber-SecondNumber;
			String AnswerS = Integer.toString(Answer);
			label.setText(AnswerS);
		}
	}
	
	
	
		
	}
}

		
	

