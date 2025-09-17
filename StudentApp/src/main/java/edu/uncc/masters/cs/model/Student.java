package edu.uncc.masters.cs.model;

public class Student {

    private int StudentId;
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;
    private String enrollmentDate;
    private String course;
    private String grade;
    private float gpa;

    public Student(int studentId, String name, int age, String email, String phone, String address, String enrollmentDate, String course, String grade, float gpa) {
        StudentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.enrollmentDate = enrollmentDate;
        this.course = course;
        this.grade = grade;
        this.gpa = gpa;
    }

    public Student(){}

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", course='" + course + '\'' +
                ", grade='" + grade + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
