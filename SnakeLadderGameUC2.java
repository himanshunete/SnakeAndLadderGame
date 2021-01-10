public class  SnakeLadderGameUC2{
   public static void main(String[] args){
      int numberOfPlayers = 1;
      int position = 0;
      System.out.println( " Only " + numberOfPlayers + " player is playing the game at position " + position + " now "  ) ;
      double diceNumber = Math.floor(Math.random() * 10)%6 + 1;
      System.out.println( " Player rolls the dice and the dice number he gets is: " + diceNumber );

   } 
}
