package m3test.model.service.student;

import m3test.connection.ConnectionCMS;
import m3test.model.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentsService implements IStudents {
    private static final String SELECT_USER_BY_ID="SELECT students_id,students_name,students_phone,students_address,students_email,class_id,students_date_of_birth FROM students WHERE students_id=?";
    private static final String INSERT_STUDENTS_SQL="INSERT INTO students(students_name,students_phone,students_address,students_email,class_id,students_date_of_birth) VALUES (?,?,?,?,?,?);";
    private static final String DELETE_STUDENTS_SQL="DELETE FROM students WHERE id=?;";
    private static final String EDIT_STUDENTS_SQL= "UPDATE students set students_name=?,students_phone=?,students_address=?,students_email=?,class_id=?,students_date_of_birth=? WHERE students_id=?;";

    @Override
    public void Add(Students students) throws SQLException {
        System.out.println(INSERT_STUDENTS_SQL);
        try(Connection connection=ConnectionCMS.getConnection();
        PreparedStatement statement=connection.prepareStatement(INSERT_STUDENTS_SQL);){
            statement.setString(1,students.getStudents_name());
            statement.setString(2,students.getStudents_phone());
            statement.setString(3,students.getStudents_address());
            statement.setString(4,students.getStudents_email());
            statement.setInt(5,students.getClassRoom().getClass_id());
            statement.setString(6,students.getStudents_date_of_birth());
            statement.setInt(7,students.getStudents_id());
            System.out.println(statement);
            statement.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void search(Students students) {

    }

    @Override
    public boolean delete(int id) throws SQLException {
        boolean delete;
        try(Connection connection= ConnectionCMS.getConnection();
            PreparedStatement statement=connection.prepareStatement(DELETE_STUDENTS_SQL);){
            statement.setInt(1,id);
            delete =statement.executeUpdate()>0;
        }
        return delete;
    }

    @Override
    public boolean edit(Students students) throws SQLException {
        boolean Edit;
        try(Connection connection=ConnectionCMS.getConnection();
            PreparedStatement statement=connection.prepareStatement(EDIT_STUDENTS_SQL);){
            statement.setString(1,students.getStudents_name());
            statement.setString(2,students.getStudents_phone());
            statement.setString(3,students.getStudents_address());
            statement.setString(4,students.getStudents_email());
            statement.setInt(5, students.getClassRoom().getClass_id());
            statement.setInt(6,students.getStudents_id());
            Edit=statement.executeUpdate()>0;
        }
        return Edit;
    }
    public Students selectStudents(int id){
        Students students=null;
        try(Connection connection=ConnectionCMS.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(SELECT_USER_BY_ID);){
            preparedStatement.setInt(1,id);
            System.out.println(preparedStatement);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String name=resultSet.getString("students_name");
                String phone=resultSet.getString("students_phone");
                String address=resultSet.getString("students_address");
                String email=resultSet.getString("students_email");
                String class_id= resultSet.getString("class_id");
                String
            }
        }
    }
}
