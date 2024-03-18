package org.codSoft.StudentGradeCalculator;

import java.util.Scanner;

public class GradeDisplay {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Student student;

        String name = getInput("What is your name? ");
        student = new Student(name);

        Studies study;
        boolean shouldContinue = true;
        do {
            String studyDetails = getInput(student.getName() + "> Enter Your Studies, And Grade?").strip().toLowerCase();
            try {
                study = Studies.create(studyDetails);
                shouldContinue = student.handleStudy(study);
            } catch (IllegalArgumentException e) {
                student.setStatus("Sorry, I did not understand '" + studyDetails + "'.");
            }
            System.out.println(student);
            student.showResult();
        } while (shouldContinue);

    }
    private static String getInput(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();

        while (input.isBlank()) {
            System.out.println(prompt);
            input = scanner.nextLine();
        }
        return input;
    }
}
