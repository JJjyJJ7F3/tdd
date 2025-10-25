package self.jjjyjj.tdd.alan;

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
}
