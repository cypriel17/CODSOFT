package org.codSoft.StudentGradeCalculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Student {
    private String status;
    private String name;

    public final List<Studies> studyRecords = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean handleStudy(Studies study) {

        for (Studies existingStudy : studyRecords) {
            if (existingStudy.getName().equals(study.getName())) {
                System.out.println("\nSubject " + study.getName() + " already exists in the records.");
                return true; // Returns true indicating the study is in the records, for the student to retry
            }
        }

        boolean records = study.execute(this);
        if (records) {
            studyRecords.add(study);
        }
        return records;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" > ");
        for (Studies study : studyRecords) {
            sb.append(study.getName()).append(": ").append(getGrade(study)).append(", ");
        }
        if (!studyRecords.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGrade(Studies study) {
        int percentage = Integer.parseInt(study.getArgument());
        if (percentage >= 0 && percentage <= 29) {
            return "F";
        } else if (percentage >= 30 && percentage <= 39) {
            return "E";
        } else if (percentage >= 40 && percentage <= 49) {
            return "D";
        } else if (percentage >= 50 && percentage <= 59) {
            return "C";
        } else if (percentage >= 60 && percentage <= 69) {
            return "B";
        } else if (percentage >= 70 && percentage <= 79) {
            return "A";
        } else if (percentage >= 80 && percentage <= 100) {
            return "A+";
        } else {
            throw new IllegalArgumentException("Invalid percentage: " + percentage);
        }
    }

    public void showResult() {

        System.out.println(TableBuilder.buildTable(studyRecords));

        int totalMarks = 0;
        int numberOfSubjects = studyRecords.size();

        for (Studies study : studyRecords) {
            totalMarks += Integer.parseInt(study.getArgument());
        }

        double averagePercentage = totalMarks / (double) numberOfSubjects;
        String averageGrade = getGradeForPercentage(averagePercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f\n", averagePercentage);
        System.out.println("Average Grade: " + averageGrade + "\n");
    }

    public String getGradeForPercentage(double percentage) {
        try {
            if (percentage >= 0 && percentage <= 29) {
                return "F";
            } else if (percentage >= 30 && percentage <= 39) {
                return "E";
            } else if (percentage >= 40 && percentage <= 49) {
                return "D";
            } else if (percentage >= 50 && percentage <= 59) {
                return "C";
            } else if (percentage >= 60 && percentage <= 69) {
                return "B";
            } else if (percentage >= 70 && percentage <= 79) {
                return "A";
            } else if (percentage >= 80 && percentage <= 100) {
                return "A+";
            }
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Invalid percentage: " + percentage);
        }
        return null;
    }
}
