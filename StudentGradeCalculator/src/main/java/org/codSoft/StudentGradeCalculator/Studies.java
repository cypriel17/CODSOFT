package org.codSoft.StudentGradeCalculator;

import java.util.List;

public abstract class Studies {
    private final String name;
    private String argument;

    public abstract boolean execute(Student target);

    public Studies(String name) {
        this.name = name.trim().toLowerCase();
        this.argument = "";
    }

    public Studies(String name, String argument) {
        this(name);
        this.argument = argument.trim();
    }

    public String getName() {
        return name;
    }

    public String getArgument() {
        return this.argument;
    }

    static final List<String> languages;
    static final List<String> nonLanguages;

    static {
        languages = List.of("afrikaans", "english", "isindebele",
                "isixhosa", "isizulu", "sesotho",
                "setswana", "siswati", "sepedi",
                "tshivenda", "xitsonga"
        );

        nonLanguages = List.of(
                "mathematics", "mathslit", "lifesciences", "physics",
                "accounting", "business", "economics", "geography", "lo",
                "history", "cat", "religious" ,"consumer", "music", "agriculture", "tourism"
        );
    }

    public static Studies create(String instruction) {
        String[] args = instruction.toLowerCase().trim().split(" ");
        String subject = args[0];
        switch (subject) {
            case "shutdown":
            case "quit":
            case "off":
                return new Shutdown();
            case "help":
                return new HelpStudy();
            default:
                if (args.length > 1) {
                    String grade = args[1];
                    if (nonLanguages.contains(subject)) {
                        return new NonLanguage(subject, grade);
                    } else if (languages.contains(subject)) {
                        return new Language(subject, grade);
                    }
                }
                throw new IllegalArgumentException("Unsupported command or invalid instruction: " + instruction);
        }
    }

}
