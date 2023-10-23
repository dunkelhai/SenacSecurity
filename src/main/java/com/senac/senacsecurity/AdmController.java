package com.senac.senacsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdmController {

    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin!";
    }
}

