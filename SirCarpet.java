/*
* Reece Peters
*/

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class SirCarpet extends Canvas {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Sir Carpet");
		frame.setSize(800,800);
		SirCarpet sp = new SirCarpet();
		frame.add(sp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	
	public void paint (Graphics g) {
		drawGasket(0, 0, getSize().height, g);
	}
	
	public void drawGasket(int x, int y, int side, Graphics g) {
		int sub = side/3;
		g.fillRect(x+sub,  y+sub,  sub,  sub);
		if(sub >= 3) {
			//top three square
			drawGasket(x,y,sub,g);
			drawGasket(x+sub,y,sub,g);
			drawGasket(x+sub+sub,y,sub,g);
			
			//midle two square
			drawGasket(x,y+sub,sub,g);
			drawGasket(x+sub+sub,y+sub,sub,g);
			
			//bottom three square
			drawGasket(x,y+sub+sub,sub,g);
			drawGasket(x+sub,y+sub+sub,sub,g);
			drawGasket(x+sub+sub,y+sub+sub,sub,g);
		}
	}
}
