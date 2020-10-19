import acm.program.*;
import acm.graphics.*;
import acm.util.*; 

public class FlipHorizontal extends GraphicsProgram {
	
	public void run() {
		GImage milk = new GImage("Milkmaid.jpg",0,0);
		GImage milkFlip = flipHorizontal(milk);
		milkFlip.move(milk.getWidth(), 0);
		add(milk);
		add(milkFlip);
	}
	
	private GImage flipHorizontal(GImage image) {
		int[][] array = image.getPixelArray();
		for (int row = 0; row < array.length; row++) {
			for (int p1 = 0; p1 < array[0].length / 2; p1++) {
				int p2 = array[0].length - p1 - 1;
				int temp = array[row][p1];
				array[row][p1] = array[row][p2];
				array[row][p2] = temp;
			}
		}
		return new GImage(array);
	}

}
