package com.brunner.e_commerce.email.dto;

public record EmailMessageDTO(
        String id,
        String to,
        String subject,
        String content
) { }
