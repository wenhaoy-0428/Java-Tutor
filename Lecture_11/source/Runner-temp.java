public class Runner {
    public static void main(String[] args) {
        // 在这里编写测试代码
    }
}

enum Shape {
    RHOMBUS,
    CIRCLE,
    DIAMOND,
    HEXAGON
}

enum Colour {
    RED,
    GREEN,
    YELLOW,
    BLUE
}

class Card {
    private Colour colour;
    private Shape shape;
    private int number;

    public Card(Colour colour, Shape shape, int number) {
        this.colour = colour;
        this.shape = shape;
        this.number = number;
    }

    public Colour getColour() {
        return colour;
    }

    public Shape getShape() {
        return shape;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number + ", " + colour + ", " + shape;
    }
}

class Player {
    private List<Card> cards;

    public Player(List<Card> cards) {
        this.cards = cards;
    }

    public int howManyColour(Colour colour) {
        int count = 0;
        for (Card card : cards) {
            if (card.getColour() == colour) {
                count++;
            }
        }
        return count;
    }

    public int howManyShape(Shape shape) {
        int count = 0;
        for (Card card : cards) {
            if (card.getShape() == shape) {
                count++;
            }
        }
        return count;
    }

    public int howManyNumber(int number) {
        int count = 0;
        for (Card card : cards) {
            if (card.getNumber() == number) {
                count++;
            }
        }
        return count;
    }

    public int howManyColourNumber(Colour colour, int number) {
        int count = 0;
        for (Card card : cards) {
            if (card.getColour() == colour && card.getNumber() == number) {
                count++;
            }
        }
        return count;
    }

    public int howManyColourShape(Colour colour, Shape shape) {
        int count = 0;
        for (Card card : cards) {
            if (card.getColour() == colour && card.getShape() == shape) {
                count++;
            }
        }
        return count;
    }

    public int howManyShapeNumber(Shape shape, int number) {
        int count = 0;
        for (Card card : cards) {
            if (card.getShape() == shape && card.getNumber() == number) {
                count++;
            }
        }
        return count;
    }

    public boolean hasCard(Card card) {
        return cards.contains(card);
    }
}
