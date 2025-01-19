package com.agencyconnect.api.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "organizations")
@Data
public class Organization {
}
