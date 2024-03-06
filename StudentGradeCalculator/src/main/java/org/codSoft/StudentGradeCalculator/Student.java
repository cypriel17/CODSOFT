package org.codSoft.StudentGradeCalculator;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String status;
    private String name;


    private final List<Study> studyRecords = new ArrayList<>();


    public Student(String name) {
        this.name = name;
        this.status = "Ready";
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean handleStudy(Study study) {
        boolean records = study.execute(this);
        if (records) {
            studyRecords.add(study);
        }
        return records;
    }
    @Override
    public String toString() {
        return this.name + " > " + this.studyRecords;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Study> getHistory() {
        return this.studyRecords;
    }


}
