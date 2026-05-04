public class Deck {
  private Card[] cards;

  //EXAMPLE. 加入 52 隻牌入SYSTEM

  // constructor
  public Deck() {
    // 13 x 4
    this.cards = new Card[13 * Suite.values().length]; // 0-51
    int idx = 0;
    for (int i = 1; i <= 13; i++) {
      for (Suite suite : Suite.values()) {
         this.cards[idx] = new Card(i, suite);
         idx++;
      }
    }
  }

  // get set
  public Card[] getCards() {
    return this.cards;
  }

  // shuffle (random)

  // Class  -> 5 Cards -> boolean


  public static void main(String[] args) {
    Deck d1 = new Deck();
    Card[] cards = d1.getCards();
    for (int i = 0; i < cards.length; i++) {
      System.out.println(cards[i].getRank() + " " + cards[i].getSuite());
    }
  }
}