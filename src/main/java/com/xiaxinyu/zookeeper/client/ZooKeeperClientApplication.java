package com.xiaxinyu.zookeeper.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZooKeeperClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZooKeeperClientApplication.class, args);
    }
}
