import java.util.List;

public class Player {
    private List<Card> cards;

    public Player(List<Card> cards) {
        this.cards = cards;
    }

    public int howManyColour(Colour colour) {
        return (int) this.cards.stream()
                .filter(card -> card.getColour() == colour)
                .count();
    }

    public int howManyShape(Shape shape) {
        return (int) this.cards.stream()
                .filter(card -> card.getShape() == shape)
                .count();
    }

    public int howManyNumber(int number) {
        return (int) this.cards.stream()
                .filter(card -> card.getNumber() == number)
                .count();
    }

    public int howManyColourNumber(Colour colour, int number) {
        return (int) this.cards.stream()
                .filter(card -> card.getColour() == colour && card.getNumber() == number)
                .count();
    }

    public int howManyColourShape(Colour colour, Shape shape) {
        return (int) this.cards.stream()
                .filter(card -> card.getColour() == colour && card.getShape() == shape)
                .count();
    }

    public int howManyShapeNumber(Shape shape, int number) {
        return (int) this.cards.stream()
                .filter(card -> card.getShape() == shape && card.getNumber() == number)
                .count();
    }

    public boolean hasCard(Card card) {
        return this.cards.contains(card);
    }
}