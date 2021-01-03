package be.cvo.sausservice.web;

import be.cvo.sausservice.service.SausService;
import be.cvo.sausservice.service.dto.Saus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SausResource {

    @Autowired
    private SausService sausService;

    @PostMapping("/add-saus")
    private void addSaus(@RequestBody Saus saus){
        sausService.addSaus(saus);
    }

    @GetMapping("/saus")
    public ResponseEntity<List<Saus>> getAll(){
        List<Saus> sausList = sausService.getAll();
        return new ResponseEntity<>(sausList, HttpStatus.OK);
    }

    @GetMapping("/saus/{id}")
    public ResponseEntity<Saus> getById(Integer id){
        Saus saus = sausService.getById(id);
        return new ResponseEntity<>(saus, HttpStatus.OK);
    }
}
