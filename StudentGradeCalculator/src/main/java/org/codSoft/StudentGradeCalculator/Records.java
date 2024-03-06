package org.codSoft.StudentGradeCalculator;

import java.util.List;

public class Records extends Study {

    public Records() {
        super("records");
    }

    @Override
    public boolean execute(Student student) {

        List<Study> studyHistory = student.getHistory();

        if (getArgument().isEmpty()) {
            for (Study study : studyHistory) {
                study.execute(student);
                System.out.println(student);
            }
        }

        student.setStatus("Student records so far...");

        return true;

    }
}
