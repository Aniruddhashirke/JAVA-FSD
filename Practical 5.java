import java.util.Scanner;

class Book{
    int bookid;
    String title;
    String author;

    void BookDetails(int id, String t, String a) {
        bookid = id;
        title = t;
        author = a;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class IssuedBook extends Book{
    String issueDate;
    String returnDate;

    void IssueDetails(String issue, String ret) {
        issueDate = issue;
        returnDate = ret;
    }

    void displayIssueDate() {
        displayBook();
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Return Date: " + returnDate);
    }
}

public class LibraryMS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        IssuedBook b1 = new IssuedBook();

        System.out.println("Enter book details : ");
        System.out.println("Book ID : ");
        int Xid = input.nextInt();
        System.out.println("Title of book : ");
        String t = input.next();
        System.out.println("Author of book : ");
        String a = input.next();

        b1.BookDetails(Xid, t,a);

        System.out.println("Issue date : ");
        String isd = input.next();
        System.out.println("return date : ");
        String rd = input.next();
        b1.IssueDetails(isd,rd);

        System.out.println("Issued book details :");
        b1.displayIssueDate();
    }
}
