package dao;

import model.Autor;

import java.sql.SQLException;
import java.util.List;

public interface AutorDAO {
    void addAutor(Autor autor) throws SQLException;
    List<Autor> listaAutores() throws SQLException;
    Autor getAutor(int id) throws SQLException;
    void updateAutor(Autor autor) throws SQLException;
    void deleteAutor(int id) throws SQLException;
}
