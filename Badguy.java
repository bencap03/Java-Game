

	import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;


public class Badguy {
	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 10;
	private int height = 10;
	private Image img;
	public Object remove;
	
	public Badguy() {
		setxCoord(10);
		setyCoord(10);
		setWidth(30);
		setHeight(30);
		setImg("..files/Evil.png");
	}
		public Badguy (int x, int y, int w, int h, String imgpath) {
			setxCoord(x);
			setyCoord(y);
			setWidth(w);
			setHeight(h);
			setImg(imgpath);
			
		
	}
		public void moveIt(int direction, int w, int h) {
			int speed = 28;
			int x = getxCoord();
			int y = getyCoord();
			if (direction == 68) {
				x = x + speed;
				if(x > w) { x = x - speed * 3; }
				setxCoord(x);
				setImg("files/Evil.png");
			} else if (direction == 65) {
				if (x < 0 ) { x = x + speed * 3;} 
				x = x - speed;
				setxCoord(x);
				setImg("files/Evil.png");
			} else if (direction == 87) {
				if (y<0) { y = y + speed * 3; }
			   y = y - speed;
				setyCoord(y);
		 		setImg("files/Evil.png");	
	     	} else if (direction == 83) {
	     		if ( y > h - 100) { y = y - speed * 3;}
	     		y = y +  speed;
	     		setyCoord(y);
	     		setImg("files/Evil.png");
	     	}
		}	
		public void setImg(String imgpath) {
			this.img = Toolkit.getDefaultToolkit().getImage(imgpath); 
	
		}
		public int getxCoord() {
			return xCoord;
		}
		public void setxCoord(int xCoord) {
			this.xCoord = xCoord;
		}
		public int getyCoord() {
			return yCoord;
		}
		public void setyCoord(int yCoord) {
			this.yCoord = yCoord;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public Image getImg() {
			return img;
		}
		public void setImg(Image img) {
			this.img = img;
		}
		public static int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		public void remove(int i) {
			// TODO Auto-generated method stub
			
		}
		public Badguy get(int i) {
			// TODO Auto-generated method stub
			return null;
		}

}
