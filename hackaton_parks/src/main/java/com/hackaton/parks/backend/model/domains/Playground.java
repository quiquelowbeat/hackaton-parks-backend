package com.hackaton.parks.backend.model.domains;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@ToString
@Document(collection = "playground_areas")
public class Playground {

    @MongoId
    private int id;
    private int area_id;
    private String adress;
    private String district_name;
    private int district_id;
    private String neightbour_name;
    private int neightbour_code;

}
