package dao;

import model.Autor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutorDAOImpl implements AutorDAO {

//Añadir autor a la bbdd
    @Override
    public void addAutor(Autor autor) throws SQLException {
        String sql = "INSERT INTO libro (titulo) VALUES (?)";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, autor.getNombreAutor());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) autor.setId(rs.getInt(1));

                System.out.println("· Autor añadido a la base de datos con éxito.");
            }
        }
    }

//Listar los autores almacenados en la bbdd
    @Override
    public List<Autor> listaAutores() throws SQLException {
        String sql = "SELECT id, nombreAutor FROM Autor";
        List<Autor> lista = new ArrayList<>();

        try (Connection conn = ConnectionManager.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new Autor(rs.getString("nombreAutor"), rs.getInt("id")));
            }
        }
        return lista;
    }

//Buscar autor por id
    @Override
    public Autor getAutor(int id) throws SQLException {
        return null;
    }

    @Override
    public void updateAutor(Autor autor) throws SQLException {

    }

    @Override
    public void deleteAutor(int id) throws SQLException {

    }
}
