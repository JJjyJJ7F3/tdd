package self.jjjyjj.tdd.alan;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The username should be converted to lowercase and should be at least 3 characters long.
 * Note this class is a value object, so it should be immutable.
 */
public class Username {

    private final String name;

    public Username(String name) {
        if (name.length() < 3) {
            throw new InvalidNameException("Username must be at least 3 characters long");
        }

        this.name = name;
    }

    public String toLowerCase() {
        return this.name.toLowerCase();
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
