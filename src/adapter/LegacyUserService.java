package adapter;

public class LegacyUserService {
    public String[] getUserInfo(String userId) {
        return new String[]{userId, "John", "john@example.com"};
    }
}