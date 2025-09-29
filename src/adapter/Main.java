package adapter;

public class Main {
    public static void main(String[] args) {
        LegacyUserService legacyUserService = new LegacyUserService();
        UserDataProvider provider = new LegacyUserAdapter(legacyUserService);

        System.out.println(provider.fetchUserData("123"));
        System.out.println(provider.fetchUserData("12"));
    }
}