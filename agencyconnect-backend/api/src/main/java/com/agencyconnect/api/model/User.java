package com.agencyconnect.api.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseDocument{

    @Id
    private String id;

    private String username;
    private String email;
    private UserProfile profile;
}


