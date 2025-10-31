package test.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuperHeroModel {

    private String name;
    private String intelligence;
    private String fullName;
    private String groupAffiliation;
    private String speed;
    private String power;

}
