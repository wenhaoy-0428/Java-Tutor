from enum import Enum


class MyEnum(Enum):
    VALUE1 = 1
    VALUE2 = 2
    VALUE3 = 3
    VALUE4 = 4


# Get the enum value based on index
index = 2
enum_value = list(MyEnum)[index]
print(enum_value)  # Output: MyEnum.VALUE3
