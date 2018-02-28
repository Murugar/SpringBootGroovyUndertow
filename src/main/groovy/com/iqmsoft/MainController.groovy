package com.iqmsoft

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class MainController {

    @RequestMapping('/')
    String home() {
        return 'Spring Boot Groovy Undertow'
    }
}
