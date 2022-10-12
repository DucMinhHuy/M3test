package m3test.model;

public class Students {
    private int students_id;
    private String students_name;
    private String students_phone;
    private String students_address;
    private String students_email;
    private ClassRoom classRoom;
    private String students_date_of_birth;

    public Students(int students_id, String students_name, String students_phone, String students_address, ClassRoom classRoom, String students_date_of_birth) {
        this.students_id = students_id;
        this.students_name = students_name;
        this.students_phone = students_phone;
        this.students_address = students_address;
        this.classRoom = classRoom;
        this.students_date_of_birth = students_date_of_birth;
    }

    public Students() {
    }

    public Students(int students_id, String students_name, String students_phone, String students_address, String students_email, ClassRoom classRoom, String students_date_of_birth) {
        this.students_id = students_id;
        this.students_name = students_name;
        this.students_phone = students_phone;
        this.students_address = students_address;
        this.students_email = students_email;
        this.classRoom = classRoom;
        this.students_date_of_birth = students_date_of_birth;
    }

    public Students(String students_name, String students_phone, String students_address, int classRoom, String students_date_of_birth) {
        this.students_name = students_name;
        this.students_phone = students_phone;
        this.students_address = students_address;
        this.classRoom.setClass_id(classRoom);
        this.students_date_of_birth = students_date_of_birth;
    }

    public Students(String students_name, String students_phone, String students_address, String students_date_of_birth) {
        this.students_name = students_name;
        this.students_phone = students_phone;
        this.students_address = students_address;
        this.students_date_of_birth = students_date_of_birth;
    }

    public int getStudents_id() {
        return students_id;
    }

    public void setStudents_id(int students_id) {
        this.students_id = students_id;
    }

    public String getStudents_name() {
        return students_name;
    }

    public void setStudents_name(String students_name) {
        this.students_name = students_name;
    }

    public String getStudents_phone() {
        return students_phone;
    }

    public void setStudents_phone(String students_phone) {
        this.students_phone = students_phone;
    }

    public String getStudents_address() {
        return students_address;
    }

    public void setStudents_address(String students_address) {
        this.students_address = students_address;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public String getStudents_date_of_birth() {
        return students_date_of_birth;
    }

    public void setStudents_date_of_birth(String students_date_of_birth) {
        this.students_date_of_birth = students_date_of_birth;
    }

    public String getStudents_email() {
        return students_email;
    }

    public void setStudents_email(String students_email) {
        this.students_email = students_email;
    }
}
