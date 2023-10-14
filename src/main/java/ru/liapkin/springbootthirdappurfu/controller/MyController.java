package ru.liapkin.springbootthirdappurfu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.liapkin.springbootthirdappurfu.model.*;
import ru.liapkin.springbootthirdappurfu.util.DateTimeUtil;

import javax.validation.Valid;
import java.util.Date;

@Slf4j
@RestController
public class MyController {

    @PostMapping(value = "/feedback")
    public void feedback(@Valid @RequestBody Request request) {

        log.info("request: {}", request);
        try {
            log.info("Разница с момента получения Request сервисами 1 и 2: {}мс",
                    new Date().getTime() - DateTimeUtil.getCustomFormat().parse(request.getReceivedTime()).getTime());
        } catch (Exception e) {
            log.error(e.toString());
        }

    }

}
