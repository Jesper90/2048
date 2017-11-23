import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends Frame{

	Panel pn;
	Panel matrix;
	Panel p;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Start().initialize();
	}
	
	void randomize() {
		int x = 0;
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4; j++) {
				p = new Panel();
				p.add(new Label(Integer.toString(x)));
				if((x % 2) == 0) {
					p.setBackground(Color.RED);
				} else {
					p.setBackground(Color.BLUE);
				}
				matrix.add(p);
				matrix.repaint();
				System.out.print(x + " ");		
				x++;
			}
			System.out.println();
			this.revalidate();
			this.repaint();
		}	
	}
	
	
	void initialize() {	
		pn = new Panel(new FlowLayout());
		pn.add(new Label("2048"));
		pn.setBackground(Color.green);
		
		matrix = new Panel(new GridLayout(4, 4));
		int x = 0;
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4; j++) {
				p = new Panel();
				p.add(new Label(Integer.toString(x)));
				if((x % 2) == 0) {
					p.setBackground(Color.BLUE);
				} else {
					p.setBackground(Color.RED);
				}
				matrix.add(p);
				x++;
			}
			
		}
				
		Button bn = new Button("EXIT");
		pn.add(bn);
		bn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		Button bn2 = new Button("Randomize");
		pn.add(bn2);
		x = 0;
		bn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				randomize();
			}
		});
		
		setLayout(new BorderLayout());
		add(pn, BorderLayout.NORTH);
		add(matrix, BorderLayout.CENTER);
		setSize(400, 400);
		setVisible(true);
	}

}
