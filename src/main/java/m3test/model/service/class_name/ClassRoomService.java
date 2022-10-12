package m3test.model.service.class_name;

import m3test.connection.ConnectionCMS;
import m3test.model.ClassRoom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClassRoomService implements IClass {
    private static final String DELETE_CLASS_SQL="DELETE FROM class WHERE id=?;";
    private static final String EDIT_CLASS_SQL= "UPDATE class set class_name=? WHERE class_id=?;";
    @Override
    public void Add(ClassRoom classRoom) throws SQLException {

    }

    @Override
    public void search(ClassRoom classRoom) {

    }

    @Override
    public boolean delete(int id) throws SQLException {
        boolean delete;
        try(Connection connection=ConnectionCMS.getConnection();
            PreparedStatement statement=connection.prepareStatement(DELETE_CLASS_SQL);){
            statement.setInt(1,id);
            delete =statement.executeUpdate()>0;
        }
        return delete;
    }

    @Override
    public boolean edit(ClassRoom classRoom) throws SQLException {
        boolean Edit;
        try(Connection connection=ConnectionCMS.getConnection();
        PreparedStatement statement=connection.prepareStatement(EDIT_CLASS_SQL);){
            statement.setString(1,classRoom.getClass_name());
            statement.setInt(2,classRoom.getClass_id());
            Edit=statement.executeUpdate()>0;
        }
        return Edit;
    }
}
