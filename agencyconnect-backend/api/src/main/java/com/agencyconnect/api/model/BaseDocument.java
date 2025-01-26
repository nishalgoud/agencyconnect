package com.agencyconnect.api.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.Instant;

public class BaseDocument {

    @DocumentReference(lazy = true)
    private User createdBy;

    @DocumentReference(lazy = true)
    private User updatedBy;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;
}
