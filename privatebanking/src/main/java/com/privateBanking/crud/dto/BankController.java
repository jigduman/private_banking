package com.privateBanking.crud.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;

@RestController
@RequestMapping("/api")
public class BankController {

    @Operation(summary = "Create Bank", description = "Create a new bank entry")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Bank created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input", content = @Content(mediaType = "application/json", examples = @ExampleObject(value = "{ \"message\": \"Invalid input\" }")))
    })
    @PostMapping("/banks")
    public ResponseEntity<example> createBank(@RequestBody example example) {
        // Simulate creating the bank
        // In a real application, you would save the bank details to the database
        return new ResponseEntity<>(example, HttpStatus.CREATED);
    }

    @Operation(summary = "Get Bank", description = "Get bank details by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Bank found", content = @Content(mediaType = "application/json", examples = @ExampleObject(value = "{ \"id\": 5, \"minimal_deposit\": 10, \"net_worth\": 3100, \"description\": \"This Bank is the most...\" }"))),
            @ApiResponse(responseCode = "404", description = "Bank not found", content = @Content(mediaType = "application/json", examples = @ExampleObject(value = "{ \"message\": \"Bank not found\" }")))
    })
    @GetMapping("/banks/{id}")
    public ResponseEntity<example> getBank(@PathVariable int id) {
        // Simulate fetching the bank details
        // In a real application, you would fetch the details from the database
        example example = new example();
        example.setId(id);
        example.setDeposit(10);
        example.setWorth(3100);
        example.setDescription("This Bank is the most...");
        return new ResponseEntity<>(example, HttpStatus.OK);
    }
}

