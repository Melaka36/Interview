class Book:
    def __init__(self,id,title,content):
        self.id = id
        self.title = title
        self.content = content
        self.lastpage=0

    def display_page(self):
        print(self.content[self.lastpage])

    def turn_page(self):
        if self.lastpage < len(self.content)-1:
            self.lastpage += 1
        else:
            print("You have reached the end of the book")

class Library:
    def __init__(self):
        self.collection = dict()
        self.active_book = None
        self.id_counter = 0

    def add_to_collection(self,title,content):
        new_book = Book(self.id_counter,title,content)
        self.collection[new_book.id] = new_book