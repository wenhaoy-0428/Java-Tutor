from cap import Shape, Colour, Card, Player
from random import shuffle  # Just here to shuffle the deck

prompts = {
    "main": {
        "optLen": 2,
        "option":
            "Would you like to:\n"
            "1. Ask a question.\n"
            "2. Guess a card.",
        "prompt":
            "Which option would you like? ",
    },
    "question": {
        "optLen": 6,
        "option":
            "Which question would you like to ask?\n"
            "1. How many cards with a certain colour?\n"
            "2. How many cards with a certain shape?\n"
            "3. How many cards with a certain number?\n"
            "4. How many cards with a certain colour and number?\n"
            "5. How many cards with a certain shape and number?\n"
            "6. How many cards with a certain colour and shape?",
        "prompt":
            "Which option would you like? "
    },
    "guess": {

    },
    "color": {
        "optLen": 4,
        "option":
            "The colour options are:\n"
            "1. RED\n"
            "2. BLUE\n"
            "3. GREEN\n"
            "4. YELLOW",
        "prompt":
            "Which colour do you want? ",
    },
    "shape": {
        "optLen": 4,
        "option":
            "The shape options are:\n"
            "1. HEXAGON\n"
            "2. CIRCLE\n"
            "3. DIAMOND\n"
            "4. RHOMBUS",
        "prompt":
            "Which shape do you want? ",
    },
    "number": {
        "optLen": 4,
        "prompt": "Enter a number from 1-4 (inclusive): ",
    }
}


# Function to display a prompt and get user input
def display_prompt(prompt):
    # Display the prompt message
    if "option" in prompts[prompt]:
        print(prompts[prompt]["option"])
    while True:
        try:
            option = int(input(prompts[prompt]["prompt"]))
            # Check if the input is within the valid range
            if option < 1 or option > prompts[prompt]["optLen"]:
                raise ValueError
            break
        except ValueError:
            print("This is not an option, try again")
            if prompt == "main" or prompt == "question":
                print(prompts[prompt]["option"])
            # Display an error message if the input is invalid
        # Return the user's option
    return option


class Vertex:
    def __init__(self, vertex_id, run):
        self.id = vertex_id
        self.neighbors = []
        self.run = run

    def add_neighbor(self, neighbor):
        if neighbor not in self.neighbors:
            self.neighbors.append(neighbor)
            return True


class Graph:
    def __init__(self):
        self.vertices = {}

    def add_vertex(self, vertex):
        if isinstance(vertex, Vertex) and vertex.id not in self.vertices:
            self.vertices[vertex.id] = vertex
            return True
        else:
            return False

    def add_edge(self, v1, v2):
        if v1 in self.vertices and v2 in self.vertices:
            self.vertices[v1].add_neighbor(v2)
            return True
        else:
            return False

    def get_vertex(self, vertex_id):
        return self.vertices[vertex_id]

    def __iter__(self):
        return iter(self.vertices.values())

    def move_to_next(self, vertex, option):
        return self.get_vertex(self.vertices[vertex.id].neighbors[option - 1])

    def has_next(self, vertex):
        return len(self.vertices[vertex.id].neighbors) > 0


def play(player):
    global num_question_asked, num_wrong_guess
    # SETUP
    guessed = []
    colors = list(Colour)
    shapes = list(Shape)
    numbers = [1, 2, 3, 4]
    num_question_asked = 0
    num_wrong_guess = 0

    # Create the graph
    graph = Graph()
    # Create the vertices
    v1 = Vertex("main", lambda: display_prompt("main"))

    def question_output():
        global num_question_asked
        num_question_asked += 1
        return display_prompt("question")

    v2 = Vertex("question", question_output)

    def color_output():
        color = colors[display_prompt('color') - 1]
        print(f"The player has {player.how_many_colour(color)} cards with colour {color}.")
    v3 = Vertex("color", color_output)

    def shape_output():
        shape = shapes[display_prompt('shape') - 1]
        print(f"The player has {player.how_many_shape(shape)} cards with shape {shape}.")
    v4 = Vertex("shape", shape_output)

    def number_ouput():
        number = display_prompt('number')
        print(f"The player has {player.how_many_number(number)} cards with number {number}.")
    v5 = Vertex("number", number_ouput)

    def color_number_output():
        color = colors[display_prompt('color') - 1]
        number = display_prompt('number')
        print(
            f"The player has {player.how_many_colour_number(color, number)} cards with colour {color} and number {number}.")
    v6 = Vertex("color_number", color_number_output)

    def shape_number_output():
        shape = shapes[display_prompt('shape') - 1]
        number = display_prompt('number')
        print(
            f"The player has {player.how_many_shape_number(shape, number)} cards with shape {shape} and number {number}.")
    v7 = Vertex("shape_number", shape_number_output)

    def color_shape_output():
        color = colors[display_prompt('color') - 1]
        shape = shapes[display_prompt('shape') - 1]
        print(
            f"The player has {player.how_many_colour_shape(color, shape)} cards with colour {color} and shape {shape}.")
    v8 = Vertex("color_shape", color_shape_output)

    def guess():
        global num_wrong_guess
        color = colors[display_prompt("color")-1]
        shape = shapes[display_prompt("shape")-1]
        number = display_prompt("number")
        card = Card(color, shape, number)
        if (player.has_card(card)):
            print(f'The player has the card {card}.')
            if (card in guessed):
                print("But you already knew that.")
            else:
                guessed.append(card)
                print("Good guess!")
        else:
            print(f"The player does not have the card {card}.")
            num_wrong_guess += 1

    v9 = Vertex("guess", guess)

    graph.add_vertex(v1)
    graph.add_vertex(v2)
    graph.add_vertex(v3)
    graph.add_vertex(v4)
    graph.add_vertex(v5)
    graph.add_vertex(v6)
    graph.add_vertex(v7)
    graph.add_vertex(v8)
    graph.add_vertex(v9)
    # Create the edges
    graph.add_edge("main", "question")
    graph.add_edge("main", "guess")
    # question
    graph.add_edge("question", "color")
    graph.add_edge("question", "shape")
    graph.add_edge("question", "number")
    graph.add_edge("question", "color_number")
    graph.add_edge("question", "shape_number")
    graph.add_edge("question", "color_shape")

    # start the game
    print("Welcome to Sleuth!")

    while len(guessed) != 3:
        current_vertex = graph.get_vertex("main")
        while 1:
            # run the current vertex
            option = current_vertex.run()
            # move to the next vertex
            if (not graph.has_next(current_vertex)):
                break
            current_vertex = graph.move_to_next(current_vertex, option)
            
    print(
        f"Congratulations!\nIt took you {num_question_asked} questions and {num_wrong_guess} incorrect guesses.\nThe player's hand was: {guessed[0]}, {guessed[1]}, {guessed[2]}")


if __name__ == "__main__":
    # The code here is not part of the tests, so you
    # can modify this as you like to do your own testing.
    deck = []
    for colour in Colour:
        for shape in Shape:
            for number in range(1, 5):
                deck.append(Card(colour, shape, number))
    shuffle(deck)
    print(deck[0:3])
    play(Player(deck[0:3]))
