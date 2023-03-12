package DAO;

public class Test {
    private static Dao<Users> userDao;

    public static void main(String[] args) {
        userDao = new UserDao();

        Users user1 = userDao.get(1).get();
        System.out.println("user1: " + user1);

        user1.setName("updated." + user1.getName());
        userDao.update(user1);

        System.out.println("All users: ");
        userDao.getAll().forEach(user -> System.out.println(user));
    }
}
