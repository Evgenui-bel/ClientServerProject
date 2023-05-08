package com.evgen.server.controllers;

import com.evgen.server.models.Type;
import com.evgen.server.objects.TypeRequest;
import com.evgen.server.repositories.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/types")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TypesController {
    @Autowired
    TypeRepository chronicleRepository;

    @PostMapping("/add")
    public String sendTypes(@RequestBody TypeRequest typesRequest) {
        Type chronicle = new Type(typesRequest.getTitle(), typesRequest.getDescription());
        chronicleRepository.save(chronicle);
        return "success";
    }

    @GetMapping("/getall")
    public Object getTypes() {
        return chronicleRepository.findAll();
    }
}
