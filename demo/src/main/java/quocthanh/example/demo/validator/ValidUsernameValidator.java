package quocthanh.example.demo.validator;

import quocthanh.example.demo.repository.IUserRepository;
import quocthanh.example.demo.validator.annotation.ValidUsername;
import jakarta.validation.ConstrainValidator;
import jakarta.validation.ConstrainValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;


public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ContraintValidatorContext context){
        if(userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}
