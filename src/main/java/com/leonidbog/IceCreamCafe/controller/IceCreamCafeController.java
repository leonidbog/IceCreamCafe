package com.leonidbog.IceCreamCafe.controller;

import com.leonidbog.IceCreamCafe.model.IceCream;
import com.leonidbog.IceCreamCafe.service.IceCreamCafeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("icecreamcafe")
@AllArgsConstructor
public class IceCreamCafeController {

    private IceCreamCafeService cafeService;

    @GetMapping("all")
    public List<IceCream> findAll(){
        return cafeService.findAll();
    }
    @PostMapping("newicecream")
    public IceCream save(@RequestBody IceCream iceCream){
        return cafeService.save(iceCream);
    }
    @PostMapping("update")
    public IceCream update(@RequestBody IceCream iceCream){
        return cafeService.update(iceCream);
    }
    @GetMapping("items/{id}")
    public IceCream findById(@PathVariable Long id){
        return cafeService.findById(id);
    }
    @DeleteMapping("items/delete/{id}")
    public void deleteById(@PathVariable Long id){
        cafeService.deleteById(id);
    }

}
