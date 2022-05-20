package com.hackaton.parks.backend.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
public class ParkDto {

    private String name;
    private String road_name;
    private int road_number;
    private String neightbour_name;
    private String district;
    private int postal_code;
    private String description;

}
