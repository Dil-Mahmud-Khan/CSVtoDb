package com.csv.service;
import java.io.IOException;
import java.util.List;

import com.csv.helper.CSVHelper;
import com.csv.model.Customer;
import com.csv.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CSVService {

    @Autowired
    CustomerRepository repository;

    public void save(MultipartFile file) {
        try {
            List<Customer> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    public List<Customer> getAllTutorials() {
        return repository.findAll();
    }
}
