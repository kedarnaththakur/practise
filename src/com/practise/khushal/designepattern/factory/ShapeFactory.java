package com.practise.khushal.designepattern.factory;

public class ShapeFactory {
   public Shape getShape(String ShapeType)
   {
	   if (ShapeType == null) {
		return null;
	   }
	   else if (ShapeType.equalsIgnoreCase("CIRCLE")) {
		    return new Circle();
	  }
	  else if (ShapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
	  }
	  else if (ShapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
	  }	  
	  return null;
   }
}
