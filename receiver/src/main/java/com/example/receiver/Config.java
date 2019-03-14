package com.example.receiver;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    @Bean("queue1")
    public Queue firstQueue() {
        return new Queue("queue1");
    }

    @Bean("queue2")
    public Queue secondQueue() {
        return new Queue("queue2");
    }

    @Bean("queue3")
    public Queue thirdQueue() {
        return new Queue("queue3");
    }

    //直连
    @Bean("directExchange")
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }

    //订阅
    @Bean("fanoutExchange")
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }

    //主题
    @Bean("topicExchange")
    public TopicExchange topicExchange(){
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding binding1(@Qualifier("queue1") Queue queue, @Qualifier("directExchange") DirectExchange exchange ){
        return BindingBuilder.bind(queue).to(exchange).with("abc");
    }

    @Bean
    public Binding binding2(@Qualifier("queue2") Queue queue,@Qualifier("fanoutExchange") FanoutExchange exchange ){
        return BindingBuilder.bind(queue).to(exchange);
    }

    @Bean
    public Binding binding4(@Qualifier("queue3") Queue queue,@Qualifier("fanoutExchange") FanoutExchange exchange ){
        return BindingBuilder.bind(queue).to(exchange);
    }

    @Bean
    public Binding binding3(@Qualifier("queue3") Queue queue,@Qualifier("topicExchange") TopicExchange exchange ){
        return BindingBuilder.bind(queue).to(exchange).with("abc.*");
    }
}
