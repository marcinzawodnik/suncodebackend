package com.example.suncodebackend.dataItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/data")
public class DataItemApi {

    @Autowired
    private DataItemRepo dataItemRepo;

    @Autowired
    public DataItemApi(DataItemRepo dataItemRepo) {

        this.dataItemRepo = dataItemRepo;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public Iterable<DataItem> getDataItem(int id, int distinct) {
        if (id == 0 && distinct == 0) {
            return dataItemRepo.findDataItemByKolumna1NotUnique();
        } else if(id == 1 && distinct == 0) {
            return dataItemRepo.findDataItemByKolumna2NotUnique();
        } else if(id == 2 && distinct == 0) {
            return dataItemRepo.findDataItemByKolumna3NotUnique();
        } else if(id == 3 && distinct == 0) {
            return dataItemRepo.findDataItemByKolumna4NotUnique();
        } else if(id == 0 && distinct == 1) {
            return dataItemRepo.findDataItemByKolumna1Unique();
        } else if(id == 1 && distinct == 1) {
            return dataItemRepo.findDataItemByKolumna2Unique();
        } else if(id == 2 && distinct == 1) {
            return dataItemRepo.findDataItemByKolumna3Unique();
        } else if(id == 3 && distinct == 1) {
            return dataItemRepo.findDataItemByKolumna4Unique();
        } else {
            return null;
        }

//    @GetMapping
//    public Optional<DataItem> getDataItem(long id){
//
//        Optional<DataItem> d = dataItemRepo.findById(id);
//        return d;
//    }
    }
}