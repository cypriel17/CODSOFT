package org.codSoft.StudentGradeCalculator;

import java.util.List;

public class TableBuilder {

    public static String buildTable(List<Studies> records) {
        StringBuilder table = new StringBuilder();

        table.append(String.format("| %-5s | %-20s | %-5s |\n", "ID", "Subject", "Grade"));
        table.append("+-------+----------------------+-------+\n");

        for (int i = 0; i < records.size(); i++) {
            Studies study = records.get(i);
            String id = String.valueOf(i + 1);
            String subject = study.getName();
            String grade = study.getArgument();
            table.append(String.format("| %-5s | %-20s | %-5s |\n", id, subject, grade));
        }

        table.append("+-------+----------------------+-------+\n");

        return table.toString();
    }
}
