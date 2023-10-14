package ru.liapkin.springbootthirdappurfu.service;

import org.springframework.stereotype.Service;
import ru.liapkin.springbootthirdappurfu.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);
}
