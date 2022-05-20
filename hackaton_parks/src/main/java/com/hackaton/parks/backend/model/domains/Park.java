package com.hackaton.parks.backend.model.domains;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@ToString
@Document(collection = "parks")
public class Park {

    @MongoId
    private int id;
    private String name;
    private String road_name;
    private int road_number;
    private String neighbourhood;
    private int district_id;
    private String district;
    private String postalCode;
    private String geo_epgs_25831_x;
    private String geo_epgs_25831_y;
    private String geo_epgs_4326_x;
    private String geo_epgs_4326_y;

}
