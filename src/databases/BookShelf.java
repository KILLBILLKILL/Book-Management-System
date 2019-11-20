package databases;

import classes.Book;
import exceptions.NoSuchBookException;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    public List<Book> queryBooks()
    {


        return new ArrayList<>(bookList);

    }
    //保存很多的书
    //保存书的集合
    private List<Book> bookList=new ArrayList<>();
    //饿汉模式
    private  static BookShelf instance =new BookShelf();
    public static BookShelf getInstance() {
        return instance;
    }

    public Book search(String ISBN) throws NoSuchBookException {
        for(Book book :bookList)
        {
            if(book.is(ISBN))
            {
                return book;
            }
        }
        throw new NoSuchBookException(ISBN);
    }

    public void putbook(Book book) {
        bookList.add(book);
    }
}
