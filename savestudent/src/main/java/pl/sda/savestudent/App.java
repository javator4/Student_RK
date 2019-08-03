package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {

    public static void main(String[] args) {

//        List<Student> students = new ArrayList<Student>();
//
//        studentList.add(new Student("Jan", "Kowalskie", 1));
//        studentList.add(new Student("Katarzyna", "Nowak", 2));
//        studentList.add(new Student("Tomasz", "Nowicki", 3));
//        studentList.add(new Student("Jacek", "Gyros", 4));
//        studentList.add(new Student("Edi", "Petarda", 5));

        Student student = new Student("Jan", "Kowalskie", 1);
        Student student2 = new Student("Katarzyna", "Nowak", 2);
        Student student3 = new Student("Tomasz", "Nowicki", 3);
        Student student4 = new Student("Jacek", "Gyros", 4);
        Student student5 = new Student("Edi", "Petarda", 5);

        List<Student> students = Arrays.asList(student,student2, student3, student4, student5);

        writeJSONFile(students);

    }



    public static void writeJSONFile(List<Student> studentList){

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("students.json"), studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
