package ru.liapkin.springbootthirdappurfu.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.liapkin.springbootthirdappurfu.model.Response;
import ru.liapkin.springbootthirdappurfu.util.DateTimeUtil;

import java.util.Date;

@Slf4j
@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService {

    @Override
    public Response modify(Response response) {

        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        log.info("Поле response.systemTime изменилось на {}", response.getSystemTime());

        return response;

    }

}
