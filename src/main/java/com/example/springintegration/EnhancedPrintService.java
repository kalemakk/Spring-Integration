package com.example.springintegration;

import org.springframework.util.concurrent.ListenableFuture;

public interface EnhancedPrintService {
    void print(Person person);
    ListenableFuture<String> fullName(Person person);
}
