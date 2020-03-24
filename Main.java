package tictactoe;

import java.util.Scanner;

import tictactoe.SortCharacters;


public class Main {

  public static void main(String[] args) {
  
  int pos1,pos2;
  SortCharacters sam=new SortCharacters();
  
   System.out.println("Hello players,welcome to le game.");
   System.out.println("Each player takes turns.\nPlayer 1 uses X while player two uses O. Good luck.");
   System.out.println("The following are the addresses of the cells. Use them to move your avatars.");
   
   
   sam.addresses();
   sam.display();
   
   while(!sam.checkWinner()){
       
       
       Scanner sc=new Scanner(System.in);
       pos1=sc.nextInt();
       pos2=sc.nextInt();
   
   
       sam.move(pos1,pos2);
       
   }
  }
}
