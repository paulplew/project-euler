import os.path


# function to read the given file name
# returns the read file as a str
def read_file(name):
    # if the file does not exist an error will be thrown
    if not os.path.exists(name):
        raise NameError("The file {} doesn't exist.".format(name))

    with open(name) as f:
        read = f.read()
    return read


# function to convert the given string
# to the sum of it's character's values
# hello -> 8+5+12+12+15
def str_to_score(word):
    word = word.lower()
    total = 0
    for character in word:
        total += ord(character) - 96
    return total


# set this to the content of the read file converted to lowercase
read_names = read_file("./names.txt")
names = []
names_scores = 0

# while the number of commas in the file is more than 0
while read_names.count(',') > 0:
    # add the first name in the string to the list of names
    # format of the names in the file is "NAME",
    # this removes the first and last quote on the name
    names.append(read_names[1:read_names.find(',') - 1])
    # set the string holding the file to everything except the name that
    # was removed
    read_names = read_names[read_names.find(',') + 1:len(read_names)]
# because the for loop cant go through all the names set the last name here
names.append(read_names[1:len(read_names) - 1])

names = sorted(names)  # THANK YOU PYTHON :D

for x in range(0, len(names)):

    # multiply the score of the name by its position
    names_scores += str_to_score(names[x]) * (x + 1)

print(names_scores)
