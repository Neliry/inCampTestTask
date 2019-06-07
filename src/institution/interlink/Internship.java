package institution.interlink;

import institution.University;
import person.Student;
import java.util.ArrayList;

public class Internship {

    private String name;
    private ArrayList<Student> studentsList = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudents(University university) {
        int averageKnowledgeLevel = university.getAverageKnowledgeLevel();
        for (Student student: university.getStudentsList()){
            if (student.getKnowledge().getLevel() > averageKnowledgeLevel)
                studentsList.add(student);
        }
    }

    public String getStudents() {
        String list = "";
        for (Student student: studentsList){
            list += student.getName() + "\n";
        }
        return list;
    }
}
