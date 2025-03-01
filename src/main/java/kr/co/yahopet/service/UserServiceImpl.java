package kr.co.yahopet.service;

import java.util.List;
import kr.co.yahopet.entity.User;
import kr.co.yahopet.repositoty.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
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
        User user = findByUid(uid);
        if (user == null) {
            return USER_NOT_EXIST;
        }
        if (BCrypt.checkpw(pwd, user.getPwd())) {
            return CORRECT_LOGIN;
        }
        return WRONG_PASSWORD;
    }
}
