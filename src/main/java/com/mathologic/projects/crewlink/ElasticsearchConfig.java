///**
// * 
// */
//package com.mathologic.projects.crewlink;
//
//import javax.annotation.Resource;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.elasticsearch.common.transport.TransportAddress;
//import org.elasticsearch.env.Environment;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
///**
// * @author Administrator
// *
// */
//@Configuration
//@PropertySource(value = "classpath:config/elastic.properties")
//public class ElasticsearchConfig {
//
//	   @Resource
//	    private Environment environment;
//
//	    @Bean
//	    public Client client() {
//	        TransportClient client = new TransportClient();
//	        TransportAddress address = new InetSocketTransportAddress(
//	                environment.getProperty("elasticsearch.host"), 
//	                Integer.parseInt(environment.getProperty("elasticsearch.port"))
//	        );
//	        client.addTransportAddress(address);        
//	        return client;
//	    }
//
//	    @Bean
//	    public ElasticsearchOperations elasticsearchTemplate() {
//	        return new ElasticsearchTemplate(client());
//	    }
//
//}
