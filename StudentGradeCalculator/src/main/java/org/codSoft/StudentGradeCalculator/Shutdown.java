package org.codSoft.StudentGradeCalculator;

public class Shutdown extends Studies {

    public Shutdown() {
        super("off");
    }

    @Override
    public boolean execute(Student student) {
        student.setStatus("Shutting down...");
        return false;
    }
}
