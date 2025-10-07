package self.jjjyjj.tdd.alan;

/**
 * The username should be converted to lowercase and should be at least 3 characters long
 */
public class Username {

    private String name;

    public Username(String name) {
        if (name.length() < 3) {
            throw new InvalidNameException("Username must be at least 3 characters long");
        }

        this.name = name;
    }

    public String toLowerCase() {
        return this.name.toLowerCase();
    }

}
