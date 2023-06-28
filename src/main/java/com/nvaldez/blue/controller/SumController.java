package com.nvaldez.blue.controller;

import com.nvaldez.blue.service.SumService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SumController {

    private final SumService sumService;

    @GetMapping("/sum")
    @Operation(summary = "Returns the sum of non-repeated ints in an array.")
    @Parameter(
            name = "array",
            description = "Array of ints.",
            schema = @Schema(type = "string"),
            examples = {
                    @ExampleObject(name = "Example 1", value = "10,40,100,10,40"),
                    @ExampleObject(name = "Example 2", value = "1,22,3,56,10,3,4,3,20,10")
            }
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful response",
                    content = @Content(schema = @Schema(implementation = Integer.class),
                            examples = {
                                    @ExampleObject(name = "Example 1", value = "100"),
                                    @ExampleObject(name = "Example 2", value = "103")
                            }))
    })
    public Integer getSum(@RequestParam(name = "array") String arrayS) {
        return this.sumService.getSum(arrayS);

    }

    @GetMapping("/")
    public String getHello() {
        return "hello";

    }
}
