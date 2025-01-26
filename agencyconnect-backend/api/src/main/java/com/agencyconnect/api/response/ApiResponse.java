package com.agencyconnect.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.ProblemDetail;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class ApiResponse<T> {
    private T data;                    // Main payload
    private Meta meta;                 // Metadata (request ID, timestamp, etc.)
    private List<ProblemDetail> errors; // List of errors (using Spring's ProblemDetail)

    // Factory methods for success and error
    public static <T> ApiResponse<T> success(T data, Meta meta) {
        return ApiResponse.<T>builder()
                .data(data)
                .meta(meta)
                .errors(null)
                .build();
    }

    public static <T> ApiResponse<T> error(List<ProblemDetail> errors, Meta meta) {
        return ApiResponse.<T>builder()
                .data(null)
                .meta(meta)
                .errors(errors)
                .build();
    }
}
