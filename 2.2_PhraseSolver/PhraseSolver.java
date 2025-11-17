public class PhraseSolver {
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;

  public PhraseSolver() {
    this.player1 = new Player();
    this.player2 = new Player();
    this.game = new Board();
    this.solved = false;
  }

  // Play method stub 
  public void play() {
    // Game loop
  }

  // Getters and setters if needed
  public Player getPlayer1() {
    return player1;
  }

  public Player getPlayer2() {
    return player2;
  }

  public Board getGame() {
    return game;
  }

  public boolean isSolved() {
    return solved;
  }

  public void setSolved(boolean solved) {
    this.solved = solved;
  }
}