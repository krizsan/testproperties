package se.ivankrizsan.spring.testproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Custom properties container that accepts a variable number of properties.
 *
 * @author Ivan Krizsan
 */
@Component
@ConfigurationProperties(prefix = "test")
public class TestProperties {
    /* Constant(s): */

    /* Instance variable(s): */
    protected Map<String, String> propertylist = new HashMap<>();

    public Map<String, String> getPropertylist() {
        return propertylist;
    }

    public void setPropertylist(Map<String, String> propertylist) {
        this.propertylist = propertylist;
    }
}
