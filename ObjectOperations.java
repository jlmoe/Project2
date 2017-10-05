import java.util.*;
public class ObjectOperations{
	
	//data members for fillArray
	
	
	
	
	public static void fillArray(GraphicObject[] objectList, Scanner filename){	
		char type;
		int x;
		int y;
		int red;
		int green;
		int blue;
		int param1;
		int param2;
		int index = 0;
		
		while(filename.hasNextLine()){
			String firstLetter = filename.nextLine();
			type = firstLetter.charAt(0);
			x = filename.nextInt();
			y = filename.nextInt();
			red = filename.nextInt();
			green = filename.nextInt();
			blue = filename.nextInt();
			
			switch(type){
			case 'C': 	// case circle
				
				param1 = filename.nextInt();	// param1 is radius
				Circle circle = new Circle(x, y, red, green, blue, param1);	//create the circle
				
				objectList[index] = circle;	//add the circle to the list
				index++;	//move to next index
				
				break;
				
			case 'R':	//param1 is length, param2 is width
				
				param1 = filename.nextInt();
				param2 = filename.nextInt();
				
				Rectangle rectangle = new Rectangle(x, y, red, green, blue, param1, param2);
				
				objectList[index] = rectangle;	//add the rectangle to the list
				index++;	//move to next index
				
				break;
				
			case 'S':	//param1 is square
				
				param1 = filename.nextInt();
				
				Square square = new Square(x, y, red, green, blue, param1);
				
				objectList[index] = square;
				index++;
				
				break;
				
			case 'E':	// param1 is the semiMajorAxis, param2 is the semiMinorAxis
				
				param1 = filename.nextInt();
				param2 = filename.nextInt();
				
				Ellipse ellipse = new Ellipse(x, y, red, green, blue, param1, param2);
				
				objectList[index] = ellipse;
				index++;
				
				break;
				
			default:
				throw new RuntimeException("TYPE MISMATCH");	
			}	//end switch
		}	//end while
	}	//end fillArray

	public static void drawList(GraphicObject[] objectList){
		for(int i = 0; objectList.length > i ; i++){
			objectList[i].draw();
		}
	}

	public static void printList(GraphicObject[] objectList){
		for(int i = 0; objectList.length > i; i++){
			System.out.println(objectList[i].toString());
		}
	}
}
