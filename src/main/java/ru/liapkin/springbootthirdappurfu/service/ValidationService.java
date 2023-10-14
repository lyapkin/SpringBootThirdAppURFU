package ru.liapkin.springbootthirdappurfu.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.liapkin.springbootthirdappurfu.exception.ValidationFailedException;

@Service
public interface ValidationService {

    void isValid(BindingResult bindingResult) throws ValidationFailedException;

}
