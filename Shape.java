package PaintApplication;
import java.awt.Graphics;

public abstract class Shape {
	int x,y;		//Coordinates on canvas
	ShapeColor bcolor, fcolor;
	Shape(int a, int b)
	{
		x = a;
		y = b;
		
	}
	void setColor(ShapeColor c, ShapeColor c2)
	{
		bcolor = c;
		fcolor = c2;
	}
	abstract void draw(Graphics g);
}
