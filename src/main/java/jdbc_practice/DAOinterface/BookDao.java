package jdbc_practice.DAOinterface;

import jdbc_practice.model.Book;
import java.sql.SQLException;
import java.util.List;

public interface BookDao {

    /** This is the method to be used to list down all the records from the books table.*/
    List<Book> getAllBooks() throws ClassNotFoundException, SQLException;

    /** This method to be used to create a record in the books table. */
    void saveBook(List<Book> BookList);

    /** This is the method to be used to delete a record from the Student table corresponding to a passed books id. */
    boolean deleteBook(int id);

    /** This is the method to be used to update a record into the books table. */
    boolean updateBook(Book book, int id);
}
