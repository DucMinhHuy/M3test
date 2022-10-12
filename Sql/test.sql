USE testM3;
CREATE TABLE class(
    class_name VARCHAR(100),
    class_id INT AUTO_INCREMENT PRIMARY KEY
);
CREATE TABLE students(
    students_id INT AUTO_INCREMENT PRIMARY KEY ,
    students_name VARCHAR(50),
    students_phone VARCHAR(50),
    students_address VARCHAR(100),
    students_email VARCHAR(50),
    class_id INT,
    students_date_of_birth VARCHAR(50),
    FOREIGN KEY (class_id) REFERENCES class(class_id)
);
INSERT INTO class(class_name) VALUE ('english'),('japan'),('vietnamese');
INSERT INTO students(students_name, students_phone, students_address, students_email, class_id, students_date_of_birth) VALUE
('duc minh huy','0971365312','thai binh','huy@gmail.com',1,'100799'),('nguyen duy hung','0977133666','yen bai','hungheo@gmail.com',2,'120798'),
('nguyen duy phong','09444444','quang ninh','phongperro@gmail.com',3,'290299'),
('vu hien luong','037676767','bac ninh','luonglon@gmail.com',1,'310898'),
('linh lung linh','0444444444','be di lac','linhluon@gmail.com',2,'40497');



SELECT * FROM students JOIN class ON students.class_id = class.class_id WHERE class.class_id=1;
