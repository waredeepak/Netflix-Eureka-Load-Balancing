package com.netflix.eureka.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
public interface FetchService {
	@RequestMapping("/firstEurekaClient")
    String firstEurekaClient();
}


