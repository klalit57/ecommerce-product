package com.assignment.ecommerce.datafixture;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


@Component
public class LoadData {

    private final DataFixture dataFixture;

    @Autowired
    public LoadData(DataFixture dataFixture) {
        this.dataFixture = dataFixture;
    }

    
    //we are providing the class path of data.json file present in our root
    @PostConstruct
    public void init() throws IOException {
        dataFixture.insertData("data.json", "products");
    }
}