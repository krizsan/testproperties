package se.ivankrizsan.spring.testproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.Map;

/**
 * Tests variable-sized properties lists and the reduction of properties in that list
 * in tests.
 *
 * @author Ivan Krizsan
 */
@SpringBootTest
@TestPropertySource
public class ProfilePropertiesTest {
    /* Constant(s): */
    private static final Logger LOGGER = LoggerFactory.getLogger(ProfilePropertiesTest.class);
    protected static final int EXPECTED_PROPERTIES_COUNT = 2;

    /* Instance variable(s): */
    @Autowired
    protected TestProperties testProperties;

    /**
     * Tests obtaining properties.
     * Expected result:
     * The properties list should contain the expected number of properties.
     */
    @Test
    public void populatePropertiesListTest() {
        /* List the properties in the list. */
        LOGGER.info("********** TestProperties:");
        for (Map.Entry<String, String> entry : testProperties.getPropertylist().entrySet()) {
            LOGGER.info("A property from the TestProperties: {} = {}",
                entry.getKey(), entry.getValue());
        }

        /* Verify the number of properties. */
        Assertions.assertEquals(
            EXPECTED_PROPERTIES_COUNT,
            testProperties.getPropertylist().size(),
            "The properties list should contain the expected number of properties");
    }
}
