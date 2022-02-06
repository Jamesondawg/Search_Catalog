package Catalog;

public class Book {

    String Title;
    int Genre;
    int Top_Sellers;
    int Rating;
    int Book_position;


    public Book (String Book_title, int bookGenre, int BestSeller, int bookRating, int Book_num )
    {
        this.Title = Book_title;
        this.Genre = bookGenre;
        this.Top_Sellers = BestSeller;
        this.Rating = bookRating;
        this.Book_position = Book_num;

    }

}
