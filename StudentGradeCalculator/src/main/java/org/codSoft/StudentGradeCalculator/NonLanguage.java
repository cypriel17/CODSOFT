package org.codSoft.StudentGradeCalculator;

import org.codSoft.StudentGradeCalculator.NonLanguages.*;

public class NonLanguage extends Studies {

    public NonLanguage(String name, String grade) {
        super(name, grade);
    }

    @Override
    public boolean execute(Student target) {
        String grade = target.getGrade(this);
        target.setStatus(grade);
        return true;
    }

    public static NonLanguage createStudy(String subject, String grade) {
        if (nonLanguages.contains(subject)) {
            switch (subject) {
                case "mathematics":
                    return new Mathematics(subject, grade);
                case "mathslit":
                    return new MathematicalLiteracy(subject, grade);
                case "lifesciences":
                    return new LifeSciences(subject, grade);
                case "music":
                    return new Music(subject, grade);
                case "lo":
                    return new LifeOrientation(subject, grade);
                case "geography":
                    return new Geography(subject, grade);
                case "tourism":
                    return new Tourism(subject, grade);
                case "accounting":
                    return new Accounting(subject, grade);
                case "consumer":
                    return new Consumer(subject, grade);
                case "cat":
                    return new CAT(subject, grade);
                case "history":
                    return new History(subject, grade);
                case "physics":
                    return new Physics(subject, grade);
                case "economics":
                    return new Economics(subject, grade);
                case "business":
                    return new BusinessStudies(subject, grade);
                case "agriculture":
                    return new Agriculture(subject, grade);
                case "religious":
                    return new Religious(subject, grade);
                default:
                    throw new IllegalArgumentException("Unsupported non-language subject: " + subject);
            }
        }
        throw new IllegalArgumentException("Invalid subject: " + subject);
    }
}
