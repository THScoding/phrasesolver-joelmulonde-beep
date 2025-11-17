public class Board {
  private String phrase;
  private String solvedPhrase;
  private int currentLetterValue;

  public Board() {
    this.phrase = "";
    this.solvedPhrase = "";
    this.currentLetterValue = 0;
  }

  // Accessors and mutators matching UML names
  public String getSolvedPhrase() {
    return solvedPhrase;
  }

  public String getPhrase() {
    return phrase;
  }

  public int getLetterValue() {
    return currentLetterValue;
  }

  public void setLetterValue(int value) {
    this.currentLetterValue = value;
  }

  // stub 

  public boolean solvePhrase(String attempt) {
    // simple check if the attempt equals phrase
    if (attempt != null && attempt.equals(phrase)) {
      this.solvedPhrase = attempt;
      return true;
    }
    return false;
  }
}