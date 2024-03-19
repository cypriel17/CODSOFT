package org.codSoft.StudentGradeCalculator;

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

}
