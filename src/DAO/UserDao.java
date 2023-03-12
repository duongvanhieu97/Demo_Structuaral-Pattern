package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<Users> {
    private List<Users> users = new ArrayList<>();
    public UserDao() {
        users.add(new Users(1, "ka", "ka@gmail.com"));
        users.add(new Users(2, "hieu", "hieu@gmail.com"));
    }
    @Override
    public List<Users> getAll() {
        return users;
    }

    @Override
    public Optional<Users> get(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst();
    }

    @Override
    public void save(Users user) {
        users.add(user);
    }

    @Override
    public void update(Users user) {
        get(user.getId()).ifPresent(existUser -> {
            existUser.setName(user.getName());
            existUser.setEmail(user.getEmail());
        });
    }

    @Override
    public void delete(Users user) {
        get(user.getId()).ifPresent(existUser -> users.remove(existUser));
    }
}
