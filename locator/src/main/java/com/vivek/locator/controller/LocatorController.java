package com.vivek.locator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LocatorController {

    @PostMapping("/sendLocator")
    public ResponseEntity<String> sendLocator(@RequestBody LocatorRequest locatorRequest) {
        String locator = locatorRequest.getLocator();
        System.out.println("Received Locator: " + locator);
        // Further processing (e.g., logging, storage)
        return ResponseEntity.ok("Locator received: " + locator);
    }

    // Request DTO
    public static class LocatorRequest {
        private String locator;

        public String getLocator() {
            return locator;
        }

        public void setLocator(String locator) {
            this.locator = locator;
        }
    }
}
