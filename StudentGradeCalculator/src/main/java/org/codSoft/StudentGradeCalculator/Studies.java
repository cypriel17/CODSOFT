package org.codSoft.StudentGradeCalculator;

import java.util.List;

public class Studies extends Study {
    private final String name;
    private final String argument;

    public Studies(String name, String argument) {
        super(name, argument);
        this.name = name;
        this.argument = argument;
    }
    @Override
    public boolean execute(Student student) {

        switch (getName().toLowerCase()) {
            case "commerce":
                List<String> commerceSubjects = List.of("Economics", "BusinessStudies", "Accounting");
                for (String subject : commerceSubjects) {
                    student.setStatus("Studying " + subject);
                }
                break;
            case "languages":
                List<String> languageSubjects = List.of("English", "Afrikaans", "Zulu", "Xhosa");
                for (String subject : languageSubjects) {
                    student.setStatus("Studying " + subject);
                }
                break;
            case "science":
                List<String> scienceSubjects = List.of("Physics", "Chemistry", "Biology", "Geography");
                for (String subject : scienceSubjects) {
                    student.setStatus("Studying " + subject);
                }
                break;
            default:
                throw new IllegalArgumentException("Unsupported study area: " + getName());
        }

        return true;
    }
}
