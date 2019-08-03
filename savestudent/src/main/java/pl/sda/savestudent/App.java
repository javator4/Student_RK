package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Jan", "Kowalskie", 1));
        studentList.add(new Student("Katarzyna", "Nowak", 1));
        studentList.add(new Student("Tomasz", "Nowicki", 1));
        studentList.add(new Student("Jacek", "Gyros", 1));
        studentList.add(new Student("Edi", "Petarda", 1));


        writeJSONFile(studentList);

    }



    public static void writeJSONFile(List<Student> studentList){

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("studentList.json"), studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
