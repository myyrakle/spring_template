package com.myyrakle.app.modules.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class IndexResponse {
    public boolean success = true;
}

@RestController()
@RequestMapping("user")
public class UserController {
    @GetMapping("")
    IndexResponse index() {
        return new IndexResponse();
    }
}
