package com.hackaton.parks.backend.model.domains;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@ToString
@NoArgsConstructor @AllArgsConstructor
@Document(collection = "users")
public class User {

    @MongoId
    private String id;
    private String username;
    private String password;
    private String identityDocument;

}
