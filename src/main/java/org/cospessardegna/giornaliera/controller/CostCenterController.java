package org.cospessardegna.giornaliera.controller;

import org.cospessardegna.giornaliera.entities.CostCenter;
import org.cospessardegna.giornaliera.service.CostCenterService;
import org.cospessardegna.giornaliera.service.CostCenterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/costCenter")
public class CostCenterController {
    private final CostCenterService costCenterService;
    public CostCenterController (CostCenterService costCenterService){
        this.costCenterService=costCenterService;

    }
    @GetMapping
    public List<CostCenter> getAll(){
        return costCenterService.findAll();
    }
    @GetMapping("/{id}")
    public CostCenter getById(@PathVariable Integer id){
        return costCenterService.findById(id).orElseThrow();}
    @PostMapping
    public CostCenter create(@RequestBody CostCenter user){
        CostCenter tmp= user;
        System.out.println(""+tmp);

        return costCenterService.save(user);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        costCenterService.deleteById(id);
    }

}
