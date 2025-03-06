package DAY6;

public class BookCopy{
    String title;
    String author;
    int price;

    BookCopy(String title,String author,int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    BookCopy(BookCopy anotherBook)
    {
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.price = anotherBook.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("Original Constructor : ");
        BookCopy obj = new BookCopy("Java","Abhishek",45678);
        obj.display();

        System.out.println("Copied Constructor ");
        BookCopy obj1 = new BookCopy(obj);
        obj1.display();
    }


}
