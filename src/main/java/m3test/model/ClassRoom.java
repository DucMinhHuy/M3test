package m3test.model;

public class ClassRoom {
    private String class_name;
    private int class_id;

    public ClassRoom(String class_name, int class_id) {
        this.class_name = class_name;
        this.class_id = class_id;
    }

    public ClassRoom() {
    }

    public ClassRoom(String class_name) {
        this.class_name = class_name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }
}
