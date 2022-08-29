import java.util.Scanner;

class Library{

    String[] books ;
    int no_of_books;
    Library()
    {
        this.books = new String[100];
        no_of_books = 0;
    }
//--------------------------------------------------------------------------------------------------
    void Addbook(String s)
    {

        books[no_of_books]= s;
        no_of_books++;
        System.out.println(s  + "  book as been added too the library !");
    }
//    ---------------------------------------------------------------------------------------------------
    void showbooks()
    {
        System.out.println();
        System.out.println(":::: THE BOOKS IN THE LIBRARY ARE ::::");
        for(String i : this.books)
        {
            if(i==null)
                continue;

            System.out.println("*  " + i);
        }
        System.out.println();
    }
//--------------------------------------------------------------------------------------------------
    void issuebook(String s)
    {
        for(int i =0;i<this.books.length;i++)
        {
            if(s==this.books[i])
            {
                System.out.println("THE BOOK " + s +" HAS BEEN ISSUE TO YOU ! HAVE A GOOD DAY !!");
                System.out.println();
                this.books[i]=null;
                return;
            }
        }
        System.out.println("THE BOOK IS NOT IN THE LIBRARY or PLEASE CHECK THE SPELLING OF THE BOOK");
        System.out.println();
    }
    void returnBook(String book)
    {
        Addbook(book);
    }
}





//------------------------------------------------------------------------------------------




public class ONLINElibrary {
    public static void main(String[] args) {
        Library iiita = new Library();

        Scanner sc = new Scanner(System.in);


        iiita.Addbook("THINK AND GROW RICH");
        iiita.Addbook("ADVENTURES OF SHERLOCK HOLMES");
        iiita.Addbook("CATCHER IN THE RYE");

        iiita.showbooks();


        iiita.issuebook("ADVENTURES OF SHERLOCK HOLMES");


        iiita.showbooks();

        iiita.returnBook("ADVENTURES OF SHERLOCK HOLMES");

        iiita.showbooks();


    }
}
