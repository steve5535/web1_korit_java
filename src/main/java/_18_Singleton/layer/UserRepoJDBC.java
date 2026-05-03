package _18_Singleton.layer;

public class UserRepoJDBC implements UserRepo{

    @Override
    public User[] findAll() throws Exception {
        return new User[0];
    }

    @Override
    public void saveAll(User[] users) throws Exception {

    }
}
