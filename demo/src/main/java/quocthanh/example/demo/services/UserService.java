package quocthanh.example.demo.services;

import quocthanh.example.demo.entity.User;
import quocthanh.example.demo.repository.IUserRepository;
import quocthanh.example.demo.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IUserRepository roleRepository;
    public void save(User user){
        userRepository.save(user);
        Long userId = user.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName( "USER");
        if (roleId != 0 && userId != 0){
            userRepository.addRoleToUser(userId, roleId);
        }
    }
}
