package com.example.validation;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinimumRequiredParametersValidator implements ConstraintValidator<MinimumRequiredParameters, Object> {

    private String[] fields;

    private int minimum;

    private int count;

    @Override
    public void initialize(MinimumRequiredParameters constraintAnnotation) {
        this.fields = constraintAnnotation.value();
        this.minimum = constraintAnnotation.minimum();
        this.count = 0;
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        BeanWrapper wrapper = PropertyAccessorFactory.forBeanPropertyAccess(value);

        for (String field: fields) {
            if (wrapper.getPropertyValue(field) != null) { count++; }
        }

        return count >= minimum;
    }
}
