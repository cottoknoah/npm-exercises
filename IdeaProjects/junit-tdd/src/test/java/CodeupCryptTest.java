import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testVersionSetting() {
        assertEquals(0, CodeupCrypt.VERSION, 0);
        CodeupCrypt.VERSION = 1.5;
        assertEquals(1.5, CodeupCrypt.VERSION, 0);
    }

    @Test
    public void testHashPassword() {
        String originalString = "test";

        String hashedString = CodeupCrypt.hashPassword(originalString);
        assertEquals("t3st", hashedString);

        String secondOriginal = "cat";
        String hashedSecond = CodeupCrypt.hashPassword(originalString);
//        assertEquals("C4T", hashedThird);
    }

    @Test
    public void testCheckPassword() {
        assertTrue(CodeupCrypt.checkPassword("test","t3st"));
        assertTrue(CodeupCrypt.checkPassword("CAT","C4T"));
        assertFalse(CodeupCrypt.checkPassword("ug","ug"));
        assertTrue(CodeupCrypt.checkPassword("123","123"));
    }
}
