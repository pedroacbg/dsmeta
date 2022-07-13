package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.Service.SaleService;
import com.devsuperior.dsmeta.entities.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<List<Sale>> findSales(){
        return ResponseEntity.ok().body(service.findSales());
    }

}
