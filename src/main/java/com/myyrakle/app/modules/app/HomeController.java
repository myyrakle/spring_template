package com.myyrakle.app.modules.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class IndexResponse {
    public boolean success = true;
}

@RestController
public class HomeController {
    @GetMapping("/")
    IndexResponse index() {
        return new IndexResponse();
    }
}
