package be.cvo.sausservice.service.mapper;

import be.cvo.sausservice.domain.SausEntity;
import be.cvo.sausservice.service.dto.Saus;
import org.springframework.stereotype.Component;

@Component
public class SausMapper {

    public SausEntity toEntity(Saus saus){
        return new SausEntity(saus.getId(), saus.getName(), saus.getPrice(), saus.getDescription());
    }

    public Saus toDTO(SausEntity sausEntity){
        return new Saus(sausEntity.getId(), sausEntity.getName(), sausEntity.getPrice(), sausEntity.getDescription());
    }
}
