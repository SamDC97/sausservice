package be.cvo.sausservice.service;

import be.cvo.sausservice.domain.SausEntity;
import be.cvo.sausservice.domain.repository.SausRepository;
import be.cvo.sausservice.service.dto.Saus;
import be.cvo.sausservice.service.mapper.SausMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SausService {

    @Autowired
    private SausRepository sausRepository;
    @Autowired
    private SausMapper sausMapper;

    public void addSaus(Saus saus){
        sausRepository.save(sausMapper.toEntity(saus));
    }

    public List<Saus> getAll(){
        return StreamSupport
                .stream(sausRepository.findAll().spliterator(), false)
                .map(s -> sausMapper.toDTO(s))
                .collect(Collectors.toList());
    }

    public Saus getById(Integer id){
        Optional<SausEntity> sausEntityOptional = sausRepository.findById(id);
        if (sausEntityOptional.isPresent()){
            return sausMapper.toDTO(sausEntityOptional.get());
        }
        return null;
    }
}
