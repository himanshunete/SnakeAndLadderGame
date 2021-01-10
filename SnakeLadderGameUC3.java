public class  SnakeLadderGameUC3{
   public static void main(String[] args){
      //Variables
      int numberOfPlayers = 1;
      int position = 0;

      //Constants
      int NoPlay=0;
      int Ladder=1;
      int Snake=2;
      int NUM_OF_PLAY = 20;
      

      System.out.println( " Only " + numberOfPlayers + " player is playing the game at position " + position + " now "  ) ;
      
      //Computation
      for (int numOfPlay=1 ; numOfPlay <= NUM_OF_PLAY ; numOfPlay++) {
         int diceNumber = (int)Math.floor(Math.random() * 10)%6 + 1;
         int option = (int)Math.floor(Math.random() * 10)%3 ;
         if ( option == NoPlay ) {
            System.out.println( " The Player is at the same position " + position ) ;
         }
         else if ( option == Ladder ){
            position = position + diceNumber;
            System.out.println( "Player moves forward to position:" + position ) ;
         }
         else if ( option == Snake ) {
            position = position - diceNumber;
               if ( position < 0 ){
                  System.exit(0);
               }
            System.out.println( "Player moves back to position:" + position ) ;
         }

      } 
   }
}
