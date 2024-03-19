package org.codSoft.StudentGradeCalculator;

import java.util.Scanner;

public class GradeDisplay {
    static Scanner scanner;

    public static void main(String[] args) {
        initializeScanner();

        String name = getInput("What is your name? ");
        welcomeMessage(name);

        Student student = new Student(name);

        boolean shouldContinue = true;
        do {
            String studyDetails = getInput(student.getName() + "> Enter Your Studies, And Grade?");

            if (studyDetails.equalsIgnoreCase("help")) {
                displayHelpMessage();
            } else if (studyDetails.equalsIgnoreCase("off") || studyDetails.equalsIgnoreCase("quit")) {
                shutdown();
            } else if (!studyDetails.isEmpty()) {
                handleStudyDetails(student, studyDetails);
            } else {
                shouldContinue = false;
            }
        } while (shouldContinue);
    }

    static void initializeScanner() {
        scanner = new Scanner(System.in);
    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine().strip();
    }

    public static void welcomeMessage(String name) {
        System.out.print("WELCOME! < " + name + " > TO THE GRADING SYSTEM!\nFor Subjects Like:\nLife Orientation - Use Lo 76\n" +
                "Life sciences - e.g lifesciences 98\n" +
                "Agricultural sciences - e.g agriculture 95\n" +
                "Business Studies - e.g business 78\n" +
                "Physical sciences - e.g physics 92\n" +
                "Mathematical literacy - e.g mathslit 76" +
                "\n\nType 'help' for more instructions.\n");
    }

    public static void displayHelpMessage() {
        System.out.println("\nTo calculate you must enter your subject and module" +
                "\nFor Subjects Like:\nLife Orientation - Use Lo 76\n" +
                "Life sciences - e.g lifesciences 98\n" +
                "Agricultural sciences - e.g agriculture 95\n" +
                "Business Studies - e.g business 78\n" +
                "Physical sciences - e.g physics 92\n" +
                "Mathematical literacy - e.g mathslit 76\n");
    }

    public static void shutdown() {
        System.out.println("Shutting down...");
        System.exit(0);
    }

    static void handleStudyDetails(Student student, String studyDetails) {
        try {
            Studies study = Studies.create(studyDetails);
            boolean shouldContinue = student.handleStudy(study);
            System.out.println(student);
            student.showResult();
        } catch (IllegalArgumentException e) {
            System.out.println("\nSorry, I did not understand '" + e.getMessage() + "'.");
        }
    }
}
