package ru.netology.springbootconditionalapp.repository;

import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.CollectionStartEvent;
import ru.netology.springbootconditionalapp.profile.Authorities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        if (user.equals("admin") && password.equals("1234")) {
            Collections.addAll(list, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user") && password.equals("3652")) {
            Collections.addAll(list, Authorities.READ, Authorities.WRITE);
        }
        return list;
    }
}