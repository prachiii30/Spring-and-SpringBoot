package com.Prachi.SpringBoot.repo;

import com.Prachi.SpringBoot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void save(Laptop lap){
        System.out.println("Saved!");
    }

}
