package self.jjjyjj.tdd.alan;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Username {
    private final String username;

    public Username(String username) {
        if (username == null || username.length() < 3) {
            throw new InvalidNameException("Username must be at least 3 characters long");
        }

        this.username = username;
    }

    public String toLowerCase() {
        return username.toLowerCase();
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
