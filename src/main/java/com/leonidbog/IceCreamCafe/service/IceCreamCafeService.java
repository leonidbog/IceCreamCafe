package com.leonidbog.IceCreamCafe.service;

import com.leonidbog.IceCreamCafe.model.IceCream;
import com.leonidbog.IceCreamCafe.repository.InMemoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IceCreamCafeService {
    private InMemoryRepo repository;

    public List<IceCream> findAll(){
        return repository.findAll();
    }

    public IceCream save(IceCream iceCream){
        return repository.save(iceCream);
    }

    public IceCream update(IceCream iceCream){
        return repository.update(iceCream);
    }

    public IceCream findById(Long id){
        return repository.findById(id);
    }

    public void deleteById(Long id){
       repository.deleteById(id);
    }

}
