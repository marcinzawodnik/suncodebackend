package com.example.suncodebackend.dataItem;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DataItemRepo  extends CrudRepository<DataItem, Long> {

@Query(nativeQuery = true,value = "select * from tabela_testowa where kolumna1 in (select kolumna1 from tabela_testowa group by kolumna1 having count(id) > 1 ) order by id")
Iterable<DataItem> findDataItemByKolumna1NotUnique();

@Query(nativeQuery = true,value = "select * from tabela_testowa where kolumna2 in (select kolumna2 from tabela_testowa group by kolumna2 having count(id) > 1) order by id")
Iterable<DataItem> findDataItemByKolumna2NotUnique();

@Query(nativeQuery = true,value = "select * from tabela_testowa where kolumna3 in (select kolumna3 from tabela_testowa group by kolumna3 having count(id) > 1 ) order by id")
Iterable<DataItem> findDataItemByKolumna3NotUnique();

@Query(nativeQuery = true,value = "select * from tabela_testowa where kolumna4 in (select kolumna4 from tabela_testowa group by kolumna4 having count(id) > 1 ) order by id")
Iterable<DataItem> findDataItemByKolumna4NotUnique();

    @Query(nativeQuery = true,value = "select * from tabela_testowa where kolumna1 not in (select kolumna1 from tabela_testowa group by kolumna1 having count(id) > 1 ) order by id")
    Iterable<DataItem> findDataItemByKolumna1Unique();

    @Query(nativeQuery = true,value = "select * from tabela_testowa where kolumna2 not in (select kolumna2 from tabela_testowa group by kolumna2 having count(id) > 1) order by id")
    Iterable<DataItem> findDataItemByKolumna2Unique();

    @Query(nativeQuery = true,value = "select * from tabela_testowa where kolumna3 not in (select kolumna3 from tabela_testowa group by kolumna3 having count(id) > 1 ) order by id")
    Iterable<DataItem> findDataItemByKolumna3Unique();

    @Query(nativeQuery = true,value = "select * from tabela_testowa where kolumna4 not in (select kolumna4 from tabela_testowa group by kolumna4 having count(id) > 1 ) order by id")
    Iterable<DataItem> findDataItemByKolumna4Unique();


}
