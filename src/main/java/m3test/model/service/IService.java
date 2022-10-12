package m3test.model.service;


import java.sql.SQLException;

public interface IService<E> {
    void Add(E e) throws SQLException;
    void search(E e);
    boolean delete(int id) throws SQLException;
    boolean edit(E e) throws SQLException;
}
