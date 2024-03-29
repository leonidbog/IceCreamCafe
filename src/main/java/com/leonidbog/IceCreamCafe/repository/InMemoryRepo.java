package com.leonidbog.IceCreamCafe.repository;

import com.leonidbog.IceCreamCafe.model.IceCream;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryRepo {
    private Long currId = 0L;
    private List<IceCream> iceCreams = new ArrayList<>();
    public List<IceCream> findAll(){
        return iceCreams;
    }

    public IceCream save(IceCream iceCream){
        iceCream.setId(currId++);
        iceCreams.add(iceCream);
        return iceCream;
    }

    public IceCream update(IceCream iceCream){
        for (int i = 0; i < iceCreams.size(); i++) {
            if(iceCream.getId().equals(iceCreams.get(i).getId())){
                iceCreams.set(i, iceCream);
                return iceCream;
            }
        }
        return null;
    }

    public IceCream findById(Long id){
        for (int i = 0; i < iceCreams.size(); i++) {
            IceCream iceCream = iceCreams.get(i);
            if(iceCream.getId().equals(id)){
                return iceCream;
            }
        }
        return null;
    }

    public void deleteById(Long id){
        for (int i = 0; i < iceCreams.size(); i++) {
            IceCream iceCream = iceCreams.get(i);
            if(iceCream.getId().equals(id)){
                iceCreams.remove(i);
                return;
            }
        }
    }


}
