public class  SnakeLadderGameUC5{
   public static void main(String[] args){
      //Variables
      int numberOfPlayers = 1;

      //Constants
      int NoPlay=0;
      int Ladder=1;
      int Snake=2;
      int NUM_OF_PLAY = 1000;
      int WIN_POSITION = 100;
      int[] position = new int[NUM_OF_PLAY];

      System.out.println( " Only " + numberOfPlayers + " player is playing the game at position " + position + " now "  ) ;
      
      //Computation
      for (int numOfPlay=0 ; numOfPlay < NUM_OF_PLAY ; numOfPlay++) {
         position[0] = 0;
         int diceNumber = (int)Math.floor(Math.random() * 10)%6 + 1;
         int option = (int)Math.floor(Math.random() * 10)%3 ;
         if ( position[numOfPlay] >  WIN_POSITION   ){
            position[numOfPlay]=position[numOfPlay-1];
         }
         if ( option == NoPlay ) {
            position[numOfPlay + 1] = position[numOfPlay] ;
            System.out.println( " The Player is at the same position " + position[numOfPlay+1] ) ;
         }
         else if ( option == Ladder ){
            position[ numOfPlay+1 ] = position[numOfPlay] + diceNumber;
            System.out.println( "Player moves forward to position:" + position[numOfPlay+1] ) ;
         }
         else if ( option == Snake ) {
            position[ numOfPlay+1 ] = position[numOfPlay] - diceNumber;
               if ( position[numOfPlay+1] < 0 ){
                  position[numOfPlay+1] = 0;
                  System.out.println( " Game restarts " ) ;
               }
            System.out.println( "Player moves back to position:" + position[numOfPlay+1] ) ;
         }
         if ( position[numOfPlay+1] == WIN_POSITION ){
            System.out.println( " The Player wins the Snake ladder game " ) ;
            System.exit(0);
         }

         
      } 
   }
}
