package _18_Singleton.layer;

public interface UserRepo {
    User[] findAll() throws Exception;
    void saveAll(User[] users) throws Exception;
}
