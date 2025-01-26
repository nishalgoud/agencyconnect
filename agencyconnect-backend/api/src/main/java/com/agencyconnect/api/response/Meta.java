package com.agencyconnect.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
public class Meta {
    private String requestId;         // Unique identifier for tracing requests
    private String version;           // API version
    private Instant timestamp;        // UTC timestamp of the response

    public static Meta create(String requestId, String version) {
        return Meta.builder()
                .requestId(requestId)
                .version(version)
                .timestamp(Instant.now()) // Auto-generate timestamp
                .build();
    }
}
