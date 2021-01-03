package be.cvo.sausservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SausEntity {

    @Id
    private Integer id;
    private String name;
    private Double price;
    private String description;
}
