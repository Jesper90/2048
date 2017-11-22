import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Start extends Frame{




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Start().initialize();
	}
	
	
	
	void initialize() {	
		System.out.println("Helle world!");
		Panel pn = new Panel(new FlowLayout());
		TextField text = new TextField("2048");//
		pn.add(text);
		
		Panel matrix = new Panel(new GridLayout(4, 4));
		TextField[][] num = new TextField[4][4];
		int x = 0;
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4; j++) {
				num[i][j] = new TextField(Integer.toString(x));
				matrix.add(num[i][j]);
				x++;
			}
		}
		
		
		Button bn = new Button("EXIT");
		pn.add(bn);
		
		setLayout(new BorderLayout());
		add(pn, BorderLayout.NORTH);
		add(matrix, BorderLayout.CENTER);
		setSize(500, 500);
		setVisible(true);
	}

}
