package com.wiley.beginningspring.ch11.repository;

import com.wiley.beginningspring.ch11.Model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private Map<Integer, User> users = new HashMap<>();

    @PostConstruct
    public void setup(){
        users.put(1, new User(1, "Mert Caliskan", "123 Main Street"));
        users.put(2, new User(2, "Kenan Sevindik", "123 Main Street"));
    }
    public void save(User user){
        users.put(user.getId(), user);
    }

    public List<User> findAll(){
        return new ArrayList<User>(users.values());
    }
    public User find(int id){
        return users.get(id);
    }
    public void update(int id, User user){
        users.put(id, user);
    }
    public void delete(int id){
        users.remove(id);
    }
}
