package com.paulzverev.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
