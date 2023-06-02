package quocthanh.example.demo.validator;

import quocthanh.example.demo.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import quocthanh.example.demo.validator.annotation.ValidCategoryId;
public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId()!= null;
    }
}