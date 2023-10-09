package uz.pdp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.entity.RawData;

public interface RawDataDAO extends JpaRepository<RawData, Long> {



}
