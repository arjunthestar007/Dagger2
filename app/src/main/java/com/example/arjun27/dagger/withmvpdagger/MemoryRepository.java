package com.example.arjun27.dagger.withmvpdagger;

public class MemoryRepository implements LoginRepository {

    User user;

    @Override
    public User getuser() {
        if (user == null) {
            User user = new User("arjun", "mur");
            user.setId(1);
            return user;
        } else {
            return user;
        }
    }

    @Override
    public void saveUser(User user) {


        if (user == null) {
            user = getuser();
        }
        this.user = user;

    }


}
