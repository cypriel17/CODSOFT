package org.codSoft.StudentGradeCalculator;

public abstract class Study {
    private final String name;
    private String argument;

    public abstract boolean execute(Student target);

    public Study(String name){
        this.name = name.trim().toLowerCase();
        this.argument = "";
    }

    public Study(String name, String argument) {
        this(name);
        this.argument = argument.trim();
    }

    public String getName() {
        return name;
    }

    public String getArgument() {
        return this.argument;
    }

    public static Study create(String instruction) {
        String[] args = instruction.toLowerCase().trim().split(" ");
        switch (args[0]){
            case "shutdown":
            case "off":
                return new Shutdown();
            case "help":
                return new HelpStudy();
            case "records":
                return new Records();
            default:
                throw new IllegalArgumentException("Unsupported command: " + instruction);
        }
    }
}

