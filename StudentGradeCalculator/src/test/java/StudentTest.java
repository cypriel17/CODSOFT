import org.codSoft.StudentGradeCalculator.Language;
import org.codSoft.StudentGradeCalculator.NonLanguage;
import org.codSoft.StudentGradeCalculator.Student;
import org.codSoft.StudentGradeCalculator.Studies;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void handleStudy_AddNewStudy() {
        Student student = new Student("John");
        Studies study = new Language("english", "78");
        assertTrue(student.handleStudy(study));
        assertEquals(1, student.studyRecords.size());
    }

    @Test
    public void handleStudy_AddExistingStudy() {
        Student student = new Student("Alice");
        Studies study = new NonLanguage("mathematics", "75");
        student.handleStudy(study);
        assertTrue(student.handleStudy(study), "Subject mathematics already exists in the records.\n");
        assertEquals(1, student.studyRecords.size());
    }

    @Test
    public void getGrade_ValidPercentage() {
        Student student = new Student("Bob");
        Studies study = new NonLanguage("physics", "85");
        assertEquals("A+", student.getGrade(study));
    }

    @Test
    public void getGrade_InvalidPercentage() {
        Student student = new Student("Carol");
        Studies study = new NonLanguage("chemistry", "105");
        assertThrows(IllegalArgumentException.class, () -> student.getGrade(study));
    }

    @Test
    public void getGradeForPercentage_ValidPercentage() {
        Student student = new Student("David");
        assertEquals("A", student.getGradeForPercentage(75));
    }

    @Test
    public void getGradeForPercentage_InvalidPercentage() {
        Student student = new Student("Eve");
        assertThrows(IllegalArgumentException.class, () -> student.getGradeForPercentage(Double.parseDouble("Invalid percentage: 105")));
    }
}
