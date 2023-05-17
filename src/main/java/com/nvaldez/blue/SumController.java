package com.nvaldez.blue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    private final SumService sumService;

    public SumController(SumService sumService) {
        this.sumService = sumService;
    }

    @GetMapping("/sum")
    public Integer getSum(@RequestParam(name = "array") String arrayS) {
        return this.sumService.getSum(arrayS);

    }

    @GetMapping("/")
    public String getSum() {
        return "hello";

    }
}
