public class Shapes {
	private double length;
	private double breadth;		
	Shapes(){		
	length = 0;		
	breadth = 0;	
	}			
	Shapes(double len, double br){		
	length = len;		
	breadth = br;	
	}		
	Shapes(double side){		
	length = side;		
	breadth = side;			
	}		
	double getArea(){		
	return length * breadth;	
	}
}
