package com.zhl.springcloud.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
@Slf4j
public class CustomGlobalFilter implements GlobalFilter, Ordered {

    @Value("${server.port}")
    private String port;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("spring cloud gateway processing request port:{}",port);
        log.info("进入自定义的filter");
        //结束
//        return exchange.getResponse().setComplete();
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}