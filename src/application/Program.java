package application;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> list = new ArrayList<>();
		
		list.add((Shape) new Rectangle(3.0, 2.0));
		list.add((Shape) new Circle(2.0));
		
	}
 
   public static double totalArea(List<Shape> list) {
	   
	   Double sum = 0.0;
	   for(Shape l : list) {
		   sum+= l.area();
	   }
	   return sum;
   }
}
