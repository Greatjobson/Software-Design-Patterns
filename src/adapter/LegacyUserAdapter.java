package adapter;

public class LegacyUserAdapter implements UserDataProvider{
    private LegacyUserService legacyUserService;
    public LegacyUserAdapter(LegacyUserService legacyUserService){
        if(legacyUserService == null){
            throw new IllegalArgumentException("legacyUserServise cannot be null");
        }
        this.legacyUserService = legacyUserService;
        //new LegacyUserSefr object
        //
    }

    @Override
    public String fetchUserData(String userId) {

        if (userId == null || userId.isEmpty()) {
            throw new IllegalArgumentException("User ID cannot be null or empty");
        }

        String[] data = legacyUserService.getUserInfo(userId);
        String json = String.format(
                "{\"id\": \"%s\", \"name\": \"%s\", \"email\": \"%s\"}",
                data[0], data[1], data[2]
        );
        return json;
    }
}
