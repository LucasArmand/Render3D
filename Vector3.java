
public class Vector3 {
	
	private double x;
	private double y;
	private double z;
	
	public Vector3() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public Vector3(double a,double b, double c) {
		x = a;
		y = b;
		z = c;
	}
	
	public Vector3(Vector3 v) {
		x = v.getX();
		y = v.getY();
		z = v.getZ();
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	public double magnitude() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}
	
	
	public void setX(double n) {
		x = n;
	}
	
	public void setY(double n) {
		y = n;
	}
	
	public void setZ(double n) {
		z = n;
	}
	
	public String toString() {
		return"<" + x +", " + y + ", " + z + ">";
	}
	
	public void set(Vector3 v) {
		x = v.getX();
		y = v.getY();
		z = v.getZ();
	}
	
	public void set(double a,double b, double c) {
		x = a;
		y = b;
		z = c;
	}
	
	public Vector3 add(Vector3 v) {
		return(new Vector3(x + v.getX(),y + v.getY(), z + v.getZ()));
	}
	
	public Vector3 sub(Vector3 v) {
		return(new Vector3(x - v.getX(),y - v.getY(), z - v.getZ()));
	}
	
	public Vector3 mult(Vector3 v) {
		return(new Vector3(x * v.getX(),y * v.getY(), z * v.getZ()));
	}
	
	public Vector3 transform(Vector3[] trans) {
		if(trans.length != 3) {
			return null;
		}
		Vector3 r = new Vector3();
		for(int i = 0; i < 3; i++) {
			r.add(new Vector3(x * trans[i].getX(), y * trans[i].getY(), z * trans[i].getZ()));
		}
		return r;
	}
}
