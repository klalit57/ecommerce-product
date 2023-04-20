package com.assignment.ecommerce.datafixture;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//This class loads the initial data in json file to our database at the time of starting of application
@Component
public class DataFixture {

    private final ResourceLoader resourceLoader;
    private final ObjectMapper objectMapper;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public DataFixture(ResourceLoader resourceLoader, ObjectMapper objectMapper, MongoTemplate mongoTemplate) {
        this.resourceLoader = resourceLoader;
        this.objectMapper = objectMapper;
        this.mongoTemplate = mongoTemplate;
    }

    public void insertData(String fileName, String collectionName) throws IOException {
        InputStream inputStream = resourceLoader.getResource("classpath:" + fileName).getInputStream();
        List<Object> documents = objectMapper.readValue(inputStream, List.class);
        mongoTemplate.insert(documents, collectionName);
    }
}

