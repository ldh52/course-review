package kr.co.yahopet.service;

import java.util.List;
import kr.co.yahopet.entity.User;
import kr.co.yahopet.repositoty.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUid(String uid) {
        return userRepository.findById(uid).orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(String uid) {
        userRepository.deleteById(uid);

    }

    @Override
    public int login(String uid, String pwd) {
        return 0;
    }
}
