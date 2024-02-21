//Books program
import java.util.Scanner;

class Book {
    String name, author;
    int price, num_pages;

    Book(String n, String a, int p, int np) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.num_pages = np;
    }

    public String toString() {
        return "Book name:" + name + "\nAuthor:" + author + "\nPrice:" + price + "\nNumber of pages:" + num_pages;
    }
}

class BookDet{
    static Scanner s = new Scanner(System.in);

    static Book set() {
        s.nextLine();
        System.out.println("Enter book name");
        String n = s.nextLine();
        System.out.println("Enter author name");
        String a = s.nextLine();
        System.out.println("Enter price of book");
        int p = s.nextInt();
        if (p < 0) {
            System.out.println("Invalid Price");
            System.exit(1);
        }
        System.out.println("Enter no of pages");
        int np = s.nextInt();
        if (np < 0) {
            System.out.println("Invalid no of pages");
            System.exit(1);
        }
        Book b1 = new Book(n, a, p, np);
        return b1;
    }

    public static void main(String sx[]) {
        int n;
        System.out.println("Enter no of books");
        n = s.nextInt();
        Book b[] = new Book[n];
        for (int i = 0; i < n; i++)
            b[i] = set();
        System.out.println("Details of books entered");
        for (int i = 0; i < n; i++)
            System.out.println(b[i]);
    }
}
