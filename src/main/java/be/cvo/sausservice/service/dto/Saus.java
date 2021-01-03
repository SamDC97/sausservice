package be.cvo.sausservice.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Saus {

    private Integer id;
    private String name;
    private Double price;
    private String description;
}
