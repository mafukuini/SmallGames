package tictactoe;

public class SortCharacters {

    char [] position={'X','X','X','_','_','_','O','O','O'};
    private int count=0;
    
    public void addresses(){
    //when called, this method will just print
    //the addresses to the screen. 
        
        System.out.println("¡---—¡---—¡--—¡");
        System.out.println("|    1   |   2   |   3  |");
        System.out.println("| -----+–––+--—");
        System.out.println("|    4    |   5   |   6  |");
        System.out.println("| -----+–––+--—");
        System.out.println("|     7  |    8   |   9  |");
        System.out.println("!---—!---—!--—!");
    }
    
    public void display(){
        
        System.out.println("¡---—¡---—¡--—¡");
        System.out.println("|   "+position[0]+"   |   "+position[1]+"   |  "+position[2]+"   |");
        System.out.println("|-----+–––+--—|");
        System.out.println("|  "+position[3]+"    |    "+position[4]+"   |   "+position[5]+"  |");
        System.out.println("|-----+–––+--—|");
        System.out.println("|    "+position[6]+"  |   "+position[7]+"   |  "+position[8]+"  |");
        System.out.println("!---—!---—!--—!");
    }
    
    public boolean checkWinner(){
        //this function returns a boolean value after 
        //checking whether there is a winner. 
        
            if((position[0]==position[4]&&position[4]==position[8]&&position[8]=='X')||(position[0]==position[3]&&position[3]==position[6]&&position[6]=='X')||(position[2]==position[5]&&position[5]==position[8]&&position[8]=='X')||(position[2]==position[4]&&position[4]==position[6]&&position[6]=='X')||(position[1]==position[4]&&position[4]==position[7]&&position[7]=='X')||(position[3]==position[4]&&position[4]==position[5]&&position[5]=='X')){
            System.out.println("sam won");
            return true;
        }
            
        else if((position[0]==position[4]&&position[4]==position[8]&&position[8]=='O')||(position[0]==position[3]&&position[3]==position[6]&&position[6]=='O')||(position[2]==position[5]&&position[5]==position[8]&&position[8]=='O')||(position[2]==position[4]&&position[4]==position[6]&&position[6]=='O')||(position[1]==position[4]&&position[4]==position[7]&&position[7]=='O')||(position[3]==position[4]&&position[4]==position[5]&&position[5]=='O')){
            System.out.println("mariko ameshinda");
            return true;
        }
        
        else
            return false;
 
    }
    
    public void move(int moveFrom,int moveTo){
        if((moveTo>0&&moveTo<10)&&(moveFrom<10&&moveFrom>0)){
            count++;
            int validMove=moveFrom-moveTo;
            
            if((validMove==3||validMove==1||validMove==-3||validMove==-1)){//to check if the 'avatar' is moved within its range. 
                if(position[moveTo-1]=='_'||position[moveFrom-1]=='_'){//to check if the target is empty
                    if((count%2!=0&&(position[moveFrom-1]=='X'||position[moveTo-1]=='X'))||(count%2==0&&(position[moveFrom-1]=='O'||position[moveTo-1]=='O'))){//to make sure no one plays twice
                        char temp=position[moveFrom-1];
                        position[moveFrom-1]=position[moveTo-1];
                        position[moveTo-1]=temp;
                     }
                    else{
                      System.out.println("orea rada acha pupa");
                      count--;
                    }
                 }
                else{
                     System.out.println("Illegal move. Cell is already occupied");
                     count--;
                }
            }
            else{
                 System.out.println("Illegal move. Cell is out of bound");
                 count--;
             }
        
            display();
        }
        else{
            System.out.println("Please enter numbers ranging from 1 to 9");
        }
        
    }  
}
