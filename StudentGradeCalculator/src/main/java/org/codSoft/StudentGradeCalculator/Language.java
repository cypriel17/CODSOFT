package org.codSoft.StudentGradeCalculator;

import org.codSoft.StudentGradeCalculator.Languages.*;
import org.codSoft.StudentGradeCalculator.NonLanguages.LifeSciences;

public class Language extends Studies {

    public Language(String name, String grade) {
        super(name, grade);
    }

    @Override
    public boolean execute(Student target) {
        String grade = target.getGrade(this);
        target.setStatus(grade);
        return true;
    }
    public static Language create(String subject, String grade) {
        if (languages.contains(subject)) {
            switch (subject) {
                case "english":
                    return new English(subject, grade);
                case "xitsonga":
                    return new Xitsonga(subject, grade);
                case "siswati":
                    return new SiSwati(subject, grade);
                case "tshivenda":
                    return new TshiVenda(subject, grade);
                case "isizulu":
                    return new IsiZulu(subject, grade);
                case "isixhosa":
                    return new IsiXhosa(subject, grade);
                case "isindebele":
                    return new IsiNdebele(subject, grade);
                case "afrikaans":
                    return new Afrikaans(subject, grade);
                case "sepedi":
                    return new Sepedi(subject, grade);
                case "sesotho":
                    return new Sesotho(subject, grade);
                case "setswana":
                    return new SeTswana(subject, grade);
                default:
                    throw new IllegalArgumentException("Unsupported language subject: " + subject);
            }
        }
        throw new IllegalArgumentException("Invalid subject: " + subject);
    }
}
