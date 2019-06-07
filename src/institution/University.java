package institution;

import person.Student;

import java.util.ArrayList;

public class University {

    private String name;
    private ArrayList<Student> studentsList = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public int getAverageKnowledgeLevel(){
        int knowledgeLevel = 0;
        for (Student student: studentsList){
            knowledgeLevel += student.getKnowledge().getLevel();
        }
        return knowledgeLevel/studentsList.size();
    }
}
