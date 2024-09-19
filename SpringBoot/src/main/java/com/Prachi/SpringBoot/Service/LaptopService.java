package com.Prachi.SpringBoot.Service;

import com.Prachi.SpringBoot.model.Laptop;
import com.Prachi.SpringBoot.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component
@Service
public class LaptopService {

    @Autowired
    private LaptopRepo r;

    public  void addLaptop(Laptop lap){
        r.save(lap);
    }
    public boolean isGood_Bad(){
        return true;
    }


}
