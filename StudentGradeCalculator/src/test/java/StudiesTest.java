import org.codSoft.StudentGradeCalculator.Language;
import org.codSoft.StudentGradeCalculator.NonLanguage;
import org.codSoft.StudentGradeCalculator.Studies;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StudiesTest {

    @Test
    public void createLanguageStudy() {
        Studies study = Studies.create("english 78");
        assertTrue(study instanceof Language);
        assertEquals("english", study.getName());
        assertEquals("78", study.getArgument());
    }

    @Test
    public void createNonLanguageStudy() {
        Studies study = Studies.create("mathematics 75");
        assertTrue(study instanceof NonLanguage);
        assertEquals("mathematics", study.getName());
        assertEquals("75", study.getArgument());
    }

    @Test
    public void createUnknownSubject() {
        assertThrows(IllegalArgumentException.class, () -> Studies.create("chemistry B"));
    }

    @Test
    public void createInvalidInstruction() {
        assertThrows(IllegalArgumentException.class, () -> Studies.create("physics"));
    }

    @Test
    public void createInvalidInstructionEmptyGrade() {
        assertThrows(IllegalArgumentException.class, () -> Studies.create("geography"));
    }
}
