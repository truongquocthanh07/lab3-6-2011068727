package quocthanh.example.demo.validator;

import quocthanh.example.demo.entity.User;
import quocthanh.example.demo.validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User>{
    @Override
    public boolean isValid(User user, ConstrainsValidatorContext context) {
        if (user == null)
            return true;
        return user.getId() != null;
    }
}
