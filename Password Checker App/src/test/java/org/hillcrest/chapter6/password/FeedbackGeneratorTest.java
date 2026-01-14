package org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.*;

public class FeedbackGeneratorTest {
  @Test
    void testFeedbackGenerated() {
        String feedback = FeedbackGenerator.generateFeedback("password123");
        assertTrue(feedback.contains("uppercase"));
        assertTrue(feedback.contains("special"));
    }

}
