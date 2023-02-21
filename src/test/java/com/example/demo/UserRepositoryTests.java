package com.example.demo;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTests {
    @Autowired private UserRepository repo;

    @Test
    public void testAddNew() {
        UserModel user = new UserModel();
        user.setEmail("alex.stevenson@gmail.com");
        user.setPassword("alexs123456");
        user.setFirstName("Alex");
        user.setLastName("Stevenson");

        UserModel savedUser = repo.save(user);
        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll(){
        Iterable<UserModel> users = repo.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);

        for(UserModel user: users){
            System.out.println(user);
        }
    }

    @Test
    public void updateTest(){
        Integer userId=1;
        Optional<UserModel> optionalUser = repo.findById(userId);
        UserModel user = optionalUser.get();
        user.setPassword("hello2000");
        repo.save(user);

        UserModel updatedUser = repo.findById(userId).get();
        Assertions.assertThat(updatedUser.getPassword()).isEqualTo("hello2000");
    }

    @Test
    public void testGet(){
        Integer userId=2;
        Optional<UserModel> optionalUser = repo.findById(userId);
        Assertions.assertThat(optionalUser).isPresent();
        System.out.println(optionalUser.get());
    }

    @Test
    public void testDelete(){
        Integer userId=4;
        repo.deleteById(userId);

        Optional<UserModel> optionalUser = repo.findById(userId);
        Assertions.assertThat(optionalUser).isNotPresent();
    }

}
