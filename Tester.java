import java.util.*;
import java.io.*;
public class Tester {

	public static void main(String[] args) {
		String file;
		Scanner input = new Scanner(System.in);
		Scanner dataFile;
		FileReader in;
		boolean goodFileName = false;
		GraphicObject[] objectList = new GraphicObject[20];
		
		StdDraw.setCanvasSize(1000, 1000);
		StdDraw.setXscale(0, 1000);
		StdDraw.setYscale(0, 1000);
		
		StdDraw.setPenRadius(0.02);
		
		
		System.out.print("Please enter a file containing graphic objects: ");
		file = input.nextLine();
		
		while(!goodFileName){
			try{
				in = new FileReader(file);
				dataFile = new Scanner(in);
				ObjectOperations.fillArray(objectList, dataFile);
				goodFileName = true;
				/*try{
					ObjectOperations.fillArray(objectList, dataFile);
					goodFileName = true;
				}
				catch(RuntimeException r){
					System.out.println("There is a data mismatch in your file!");
					System.out.println("Would you like to try a different file? (Y/N");
					if(input.nextInt() == 'Y'){
						System.out.print("Please enter a file containing graphic objects: ");
						file = input.nextLine();
					}
					else{
						throw new RuntimeException("PROGRAM TERMINATED");
					}
				}	//end file read
			*/
			}
			catch(IOException e){
				System.out.println("This file does not exist, please try again.");
				System.out.print("Please enter a file containing graphic objects: ");
				file = input.nextLine();
			}//end file name read
		}// end while
		
		
		input.close();
		
		
		
		ObjectOperations.printList(objectList);
	}

}


/*
 * Scanner keyboard = new Scanner(System.in);
		boolean goodFileName = false;
		String fileName;
		int[][]theMaze = new int[15][15];		

		System.out.print("Please enter a file containing only a 15x15 matrix: ");	//user prompt
		fileName=keyboard.nextLine();

		while(!goodFileName){	//runs as long as the file is incorrect
			try{
				FileReader in = new FileReader(fileName);
				Scanner dataFile = new Scanner(in);
				try{
					theMaze = MazeOperations.fillMaze(theMaze, dataFile);
					goodFileName = true;//this allows us to exit the while loop
					//we also verify the array is the correct size
				}
				catch(RuntimeException r){
					System.out.println("This array is not the right size!");
					System.out.print("Please enter a file containing only a 15x15 matrix: ");	
					fileName=keyboard.nextLine();
				}	
				//by this point we know the file exists
				//now we check to see if the array is the required size
			}
			catch(IOException e){
				System.out.println("This file does not exist, please try again");
				System.out.print("Please enter a file containing only a 15x15 matrix: ");
				fileName=keyboard.nextLine();
			}
		}//end while

		//now we have loaded the file, lets try and solve the maze
		MazeOperations.traverseMaze(theMaze, 0, 0);
		MazeOperations.printMaze(theMaze);
		
keyboard.close(); // close the resource leak
 */
