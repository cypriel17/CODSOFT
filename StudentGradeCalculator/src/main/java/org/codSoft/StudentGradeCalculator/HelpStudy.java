package org.codSoft.StudentGradeCalculator;

public class HelpStudy extends Studies {
    public HelpStudy() {
        super("HelpStudy");
    }

    @Override
    public boolean execute(Student student) {

        System.out.println("To calculate you must enter your subject and module, " +
                "e.g Mathematics 71");
        return true;
    }
}
