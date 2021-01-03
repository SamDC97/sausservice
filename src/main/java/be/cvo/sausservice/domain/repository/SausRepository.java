package be.cvo.sausservice.domain.repository;

import be.cvo.sausservice.domain.SausEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SausRepository extends JpaRepository<SausEntity, Integer> {
}
