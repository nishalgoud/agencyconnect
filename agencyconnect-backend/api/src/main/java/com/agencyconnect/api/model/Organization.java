package com.agencyconnect.api.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

@Document(collection = "organizations")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Organization extends BaseDocument {
    @Id
    private String id;

    private String name;

    @Nullable
    private String description;

    private OrganizationProfile profile;

}
