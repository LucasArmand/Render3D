import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
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
				image.setRGB(i,j,Color.blue.getRGB());
				//System.out.println(screenSpaceVectors[i][j]);
			}
		}
		frame.setSize(800,600);
		File outputfile = new File("image.jpg");
		try {
			ImageIO.write(image, "jpg", outputfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
