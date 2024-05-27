public class Card {
    private Colour colour;
    private Shape shape;
    private int number;

    public Card(Colour colour, Shape shape, int number) {
        this.colour = colour;
        this.shape = shape;
        this.number = number;
    }

    public Colour getColour() {
        return this.colour;
    }

    public Shape getShape() {
        return this.shape;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %s", this.number, this.colour, this.shape);
    }
}
