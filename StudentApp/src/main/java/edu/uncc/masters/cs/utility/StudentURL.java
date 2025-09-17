package edu.uncc.masters.cs.utility;

public class StudentURL {

    private static final String baseurl = "http://localhost:8080/myStudentApp";
    private static final String studentpath = "/studentdetails";

    public static String getBaseurl(){
        return baseurl;
    }

    public static String getPhotoURL(String baseurl){
        String url = null;
        try{
            StringBuilder builder = new StringBuilder(baseurl);
            builder.append(studentpath);
            url = builder.toString();
            System.out.println("URL: " + url);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }
}
