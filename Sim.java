import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;



public class Sim {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Simulator");
		RenderPane canvas = new RenderPane();
		int x = 800;
		int y = 600;
		BufferedImage image = new BufferedImage(800,600,BufferedImage.TYPE_INT_ARGB);
		
		Vector3[][] screenSpaceVectors = new Vector3[x][y];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				screenSpaceVectors[i][j] = new Vector3(((double)(i) - (double)(x/2))/100, ((double)j-((double)y/2))/100,1);
				image.setRGB(i,j,Color.BLUE.getRGB());
				//System.out.println(screenSpaceVectors[i][j]);
			}
		}
		frame.setSize(800,600);
		
		canvas.paint(image.getGraphics());
		
		frame.add(canvas);
		
		canvas.paint(image.getGraphics());
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				//canvas.changePoints(2);
			}
		}, 0,16);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
