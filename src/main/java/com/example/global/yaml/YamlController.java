package com.example.global.yaml;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class YamlController {

    @Value("${data.example}")
    private String example;

    @GetMapping("/test/yaml")
    public String logYaml() {
        log.error("example: {}", example);
        log.info("example: {}", example);
        log.trace("example: {}", example);
        log.debug("example: {}", example);
        return example;
    }
}
