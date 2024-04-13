def number_of_students(data: list[tuple[str, int]]) -> int:
    return len(data)


def average_mark(data: list[tuple[str, int]]) -> float:
    total = sum(num for _, num in data)
    return round(total / len(data), 2)


def name_of_best_student(data: list[tuple[str, int]]) -> str:
    best_student = max(data, key=lambda x: x[1])
    return best_student[0]


def name_of_worst_student(data: list[tuple[str, int]]) -> str:
    worst_student = min(data, key=lambda x: x[1])
    return worst_student[0]


if __name__ == "__main__":
    student_data = [('Luke', 49), ('Cat', 49), ('Nick', 49), ('Mazza', 49)]
    print("There are", number_of_students(student_data), "students.")
    print("The average mark is:", average_mark(student_data))
    print("The best student is:", name_of_best_student(student_data))
    print("The worst student is:", name_of_worst_student(student_data))
