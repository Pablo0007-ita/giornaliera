package org.cospessardegna.Giornaliera.service;
import org.cospessardegna.Giornaliera.service.UserService;
import org.cospessardegna.Giornaliera.entities.User;
import org.springframework.stereotype.Service;
import org.cospessardegna.Giornaliera.repository.UserRepository;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    private final UserRepository userRepository ;

    public UserService(UserRepository userRepository) {
        this.userRepository= userRepository;
    }
    public List<User> findAll(){
    return userRepository.findAll();
    }
    public Optional<User>  findById(Integer id){
    return userRepository.findById(id);
    }
    public User save(User user){
    return userRepository.save(user);
    }
    public void deleteById (Integer id){
     userRepository.deleteById(id);
}
    }

