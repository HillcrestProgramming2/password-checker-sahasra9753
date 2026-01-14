package org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.*;

public class CriteriaCheckerTest {
   @Test
    void testStrongPassword() {
        assertEquals(5, CriteriaChecker.evaluateCriteria("Secure@2024"));
        assertEquals("Strong", CriteriaChecker.determineStrength(5));
    }

    @Test
    void testWeakPassword() {
        assertEquals(1, CriteriaChecker.evaluateCriteria("12345"));
        assertEquals("Weak", CriteriaChecker.determineStrength(1));
    }
}


}
