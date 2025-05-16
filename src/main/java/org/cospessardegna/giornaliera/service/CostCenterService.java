package org.cospessardegna.giornaliera.service;
import org.cospessardegna.giornaliera.service.CostCenterService;
import org.cospessardegna.giornaliera.entities.CostCenter;
import org.springframework.stereotype.Service;
import org.cospessardegna.giornaliera.repository.CostCenterRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CostCenterService {
    private final CostCenterRepository costCenterRepository ;

    public CostCenterService(CostCenterRepository costCenterRepository) {
        this.costCenterRepository= costCenterRepository;
    }
    public List<CostCenter> findAll(){
        return costCenterRepository.findAll();
    }
    public Optional<CostCenter>  findById(Integer id){
        return costCenterRepository.findById(id);
    }
    public CostCenter save(CostCenter costCenter){
        return costCenterRepository.save(costCenter);
    }
    public void deleteById (Integer id){
        costCenterRepository.deleteById(id);
    }
}

