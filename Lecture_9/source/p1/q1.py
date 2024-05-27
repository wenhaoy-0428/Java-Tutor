"""
This Python task will take a step towards doing something useful, and deal with both reading and writing to a file, while making a decision in-between.
The scaffold starts with a function header def only_positives(input_filename: str, output_filename: str) -> None, and the task is to complete this function:
The function receives two parameters, a str input_filename which is the name of the input file, and a str output_filename, which is the name of the output file (surprise!).
The function should read values from the input file. These values are guaranteed to be ints. Each value is on its own line.
It should then write the positive values (i.e. > 0) to the output file. Each value should be written to its own line.
Don't forget to close the file when you're done (either manually, or automatically).
As usually there is a __main__ section that is not tested, but you may wish to use for your own tests. You are given some example input data (in.txt). This is one of the tests, but it is not the only tested data (and you can mess around with the file, the tests use a different copy of the data).
The example data is:
1 6 0 -5 4 -7 3 
and the function should produce the following output file from it:
1 6 4 3
"""


def only_positives(input_filename: str, output_filename: str) -> None:
    with open(input_filename, "r") as readFile, open(output_filename, "w") as writeFile:
        lines = readFile.readlines()

        for i, line in enumerate(lines):
            readLine = int(line.strip())
            if readLine > 0:
                writeFile.write(f"{readLine}")
                if i < len(lines) - 1:  # Check if it's not the last positive number
                    writeFile.write("\n")


if __name__ == "__main__":
    only_positives("in.txt", "out.txt")
