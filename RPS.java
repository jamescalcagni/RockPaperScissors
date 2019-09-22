public class RPS {

  public static void main(String[]args)

    {
      System.out.println("Enter Rock, Paper, or Scissors");


      String play = IO.readString();

      int shoot;
      if (play.equalsIgnoreCase("rock")){
        shoot = 1;
      }else if (play.equalsIgnoreCase("paper")){
        shoot = 2;
      }else if (play.equalsIgnoreCase("scissors")){
        shoot = 3;
      } else {
      shoot = 9;
    }

  //  int shoot = IO.readInt();

      int x;
      if (shoot == 1) {
        x  = 0;
      } else if (shoot == 2){
        x = 1;
      } else if (shoot == 3 ){
        x = 2;
      } else {
        x = 9;
        System.out.println("not a valid entry");
      }
      String playerChoice;
        if (x == 0){
              playerChoice = "rock";
        }else if (x == 1){
              playerChoice = "paper";
        }else if (x == 2){
            playerChoice = "scissors" ;
        }else {
          playerChoice = "an invalid entry";
        }

      System.out.println("The player chose" + " " + playerChoice);

      int y = (int) (Math.random()*2 + 1);
      String computerChoice;
      if (y == 0){
            computerChoice = "rock";
      }else if (y == 1){
            computerChoice = "paper";
      }else if (y == 2){
            computerChoice = "scissors" ;
      }else {
            computerChoice = "an invalid entry";
      }

    System.out.println("The computer chose" + " " + computerChoice);

    String winner;

    if (playerChoice.equals(computerChoice)){
          winner = "It's a tie :)";
        }else if (computerChoice.equals("scissors") && playerChoice.equals("rock")){
              winner = "The winner is the Player, rock crushes scissors.";
          }  else if (computerChoice.equals("paper")  && playerChoice.equals("rock")){
              winner = "The computer is the winner, paper covers rock.";
          }  else if (playerChoice.equals("scissors") && computerChoice.equals("paper")){
              winner = "The winner is the Player, scissors cut paper.";
          } else if (playerChoice.equals("scissors") && computerChoice.equals("rock")){
              winner = "The computer is the winner, rock crushes scissors.";
          } else if (playerChoice.equals("paper") && computerChoice.equals("scissors")){
              winner = "The computer is the winner, scissors cuts paper.";
          } else if (playerChoice.equals("paper") && computerChoice.equals("rock")){
              winner = "The winner is the Player, rock covers paper.";
          } else {
              winner = "no winner";
          }

    System.out.println(winner);


  }
}
