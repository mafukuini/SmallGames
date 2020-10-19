import java.util.Scanner;

public class SimpleGame {
	
    static char [] position = {'X','X','X','_','_','_','O','O','O'};
    static private int count = 0;

	public static void main(String[] args) {
  
		int pos1,pos2;
  
		System.out.println("Hello players,welcome to le game.");
		System.out.println("Each player takes turns.\nPlayer 1 uses X while player two uses O. Good luck.");
		System.out.println("The following are the addresses of the cells. Use them to move your avatars.");
   
   
		addresses();
		display();
   
		while(!checkWinner()){
       
       
			Scanner sc = new Scanner(System.in);
			pos1 = sc.nextInt();
			pos2 = sc.nextInt();
   
			move(pos1,pos2);
		}
    }
	
	
	public static void addresses(){
	    //when called, this method will just print
	    //the addresses of the cells to the screen.
		//the addresses are used to move the avatars
		//("X" and "0" are the avatars)
	   
	    System.out.println("¡-----—¡---—--¡--—---¡");
	    System.out.println("|   1  |   2  |   3  |");
	    System.out.println("|------+––--–-+--—---");
	    System.out.println("|   4  |   5  |   6  |");
	    System.out.println("| -----+–––---+--—---");
	    System.out.println("|   7  |   8  |   9  |");
	    System.out.println("!-----—!-----—!----—!");
	}
	
	    
	public static void display(){
		
		//this function does all the magic.
		//Actually, nothing close to that. The function(or method) 
		//is used to freshly display the updated avatar
		//("X" , "_" and "0" are the avatars) every time a valid move is made.
	    System.out.println("¡------—¡------—¡----—¡");
	    System.out.println("|   "+position[0]+"   |   "+position[1]+"   |  "+position[2]+"  |");
	    System.out.println("|-------+–--––--+----—|");
	    System.out.println("|  "+position[3]+"    |    "+position[4]+"  |  "+position[5]+"  |");
	    System.out.println("|-------+–-–---–+----—|");
	    System.out.println("|    "+position[6]+"  |   "+position[7]+"   |  "+position[8]+"  |");
        System.out.println("!----—--!------—!----—!");
	}
	   
	    
	public static boolean checkWinner(){
	    //this function returns a boolean value after 
	    //checking whether there is a winner, 
	    //given the conditions in the brackets.
	    int x = 0;
	        
	    if(((x == 0 || x == 3 || x == 6)&&(position[x]  ==  position[x+1]&&position[x+1]  ==  position[x+2]&&position[x+2]  ==  'X'))||((x == 0 || x == 1 || x == 2)&&(position[x]  ==  position[x+3]&&position[x+3]  ==  position[x+6]&&position[x+6]  ==  'X')||(position[2] == position[4]&&position[4] == position[6]&&position[6] == 'X')||(position[0] == position[4]&&position[4] == position[8]&&position[8] == 'X')){
	        System.out.println("\"X\" won");
	        return true;
	    } else if(((x == 0 || x == 3 || x == 6)&&(position[x]  ==  position[x+1]&&position[x+1]  ==  position[x+2]&&position[x+2]  ==  'O'))||((x == 0 || x == 1 || x == 2)&&(position[x]  ==  position[x+3]&&position[x+3]  ==  position[x+6]&&position[x+6]  ==  'O')||(position[2] == position[4]&&position[4] == position[6]&&position[6] == 'O')||(position[0] == position[4]&&position[4] == position[8]&&position[8] == 'O')){
		System.out.println("\"O\" won");
	        return true;
	    }else
	        return false;
	}
	    
	    
	public static void move(int moveFrom,int moveTo){
		
		//this is the function
		//that moves the X and O characters.
		//A move is valid if it satisfies all the 
		//if - else conditions
		
	    if((moveTo>0&&moveTo<10)&&(moveFrom<10&&moveFrom>0)){
            count++;
            int validMove=moveFrom-moveTo;
            
            if((validMove == 3||validMove == 1||validMove == -3||validMove == -1)){//to check if the 'avatar' is moved within its range. 
                if(position[moveTo-1] == '_'||position[moveFrom-1] == '_'){//to check if the target is empty
                    if((count%2 != 0&&(position[moveFrom-1] == 'X'||position[moveTo-1] == 'X'))||(count%2 == 0&&(position[moveFrom-1] == 'O'||position[moveTo-1] == 'O'))){//to make sure no one plays twice
                        char temp=position[moveFrom-1];
                        position[moveFrom-1]=position[moveTo-1];
                        position[moveTo-1]=temp;
                     }else{
                      System.out.println("orea rada acha pupa");
                      count--;
                    }
                 }else{
                     System.out.println("Illegal move. Cell is already occupied");
                     count--;
                }
            }else{
                 System.out.println("Illegal move. Cell is out of bound");
                 count--;
             }
            display();
	     }else{
            System.out.println("Please enter numbers ranging from 1 to 9");
        }
    }  
}
