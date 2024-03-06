package org.codSoft.StudentGradeCalculator;

public class Shutdown extends Study {

    public Shutdown() {
        super("off");
    }

    @Override
    public boolean execute(Student student) {
        student.setStatus("Shutting down...");
        return false;
    }
}
