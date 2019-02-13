import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;

public class RenderPane extends Canvas{
	
	private ArrayList<Vector3> points = new ArrayList<Vector3>();
	
	Vector3 cameraPosition = new Vector3(0,0,0);
	Vector3 camereaDirection = new Vector3(1,0,0);
	
	public void addPoints(Vector3... point) {
		for(Vector3 p : point) {
			points.add(p);
		}
	}
	public void paint(Graphics g) {
		g.fillRect(50,50,100,100);
	};
}
