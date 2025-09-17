package edu.uncc.masters.cs;

import edu.uncc.masters.cs.model.Student;
import edu.uncc.masters.cs.utility.StudentURL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

import java.util.LinkedList;

public class StudentAppMain {
    public String fetchDataFromApi(String userurl) {
        RestClient restClient = RestClient.create();
        ResponseEntity<String> response = restClient
                .method(HttpMethod.GET)
                .uri(userurl)
                .retrieve()
                .toEntity(String.class);
//        String apiData = response.getBody();
        return response.getBody();
    }
    public void parseStudentJson(String studentjsonString){
        LinkedList<Student> studentList = new LinkedList<>();
        JSONArray jsonArray = new JSONArray(studentjsonString);
        System.out.println(jsonArray.length());
        int studentId = 0;
        for(int i = 0; i < jsonArray.length(); i++ ) {
            JSONObject jsonStudentObject = jsonArray.getJSONObject(i);
            studentId = jsonStudentObject.getInt("studentId");
            String name = jsonStudentObject.getString("name");
            int age = jsonStudentObject.getInt("age");
            String email = jsonStudentObject.getString("email");
            String phone = jsonStudentObject.getString("phone");
            String address = jsonStudentObject.getString("address");
            String enrollmentDate = jsonStudentObject.getString("enrollmentDate");
            String course = jsonStudentObject.getString("course");
            String grade = jsonStudentObject.getString("grade");
            float gpa = jsonStudentObject.getFloat("gpa");

            Student student = new Student(studentId, name, age, email, phone, address, enrollmentDate, course, grade, gpa);
            studentList.add(student);

        }
        for( Student student : studentList){
            System.out.println(student);
        }
    }


    public static void main(String[] args) {
        StudentAppMain s = new StudentAppMain();
        String baseurl = StudentURL.getBaseurl();
        String studenturl = StudentURL.getPhotoURL(baseurl);
        String studentjsonString = s.fetchDataFromApi(studenturl);
        s.parseStudentJson(studentjsonString);
    }
}
