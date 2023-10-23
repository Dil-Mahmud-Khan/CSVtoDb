//package com.csv.config;
//
//
//import com.csv.model.Customer;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.job.builder.JobBuilder;
//import org.springframework.batch.item.file.FlatFileItemReader;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableBatchProcessing
//public class BatchConfig {
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    private JobBuilderFactory jobBuilder;
//
//    @Autowired
//    private StepBuilderFactory stepBuilderFactory;
//
//
//    @Bean
//    public FlatFileItemReader <Customer> reader(){
//      FlatFileItemReader<Customer> reader=  new FlatFileItemReader<Customer>();
//      reade
//    }
//
//}
