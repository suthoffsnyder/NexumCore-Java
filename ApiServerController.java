package com.nexum.core.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chain")
public class ApiServerController {

    @GetMapping("/height")
    public long getHeight() {
        return 10086L;
    }

    @GetMapping("/tx/{txId}")
    public String getTx(@PathVariable String txId) {
        return "Transaction: " + txId;
    }
}
