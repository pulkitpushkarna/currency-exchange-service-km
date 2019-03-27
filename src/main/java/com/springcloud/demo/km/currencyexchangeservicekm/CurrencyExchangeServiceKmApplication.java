package com.springcloud.demo.km.currencyexchangeservicekm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeServiceKmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceKmApplication.class, args);
	}
}
