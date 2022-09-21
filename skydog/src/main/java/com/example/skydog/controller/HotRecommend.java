package com.example.skydog.controller;


import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.module.vo.UserVisit;
import com.example.skydog.module.vo.Userbehavior;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/spark")
public class HotRecommend {



    @PostMapping("/HotRecommend")
    @ApiOperation("用户点击")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userVisit", value = "用户点击", dataType = "UserVisit"),
    })
    //数据类型 (16824372947 江西 南昌  小明  广告ID)
    public void spark1(@RequestBody UserVisit userVisit) throws Exception{
        HashMap<String, Object> pros = new HashMap<>(3);
        pros.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.60.128:9092");
        pros.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        pros.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> producer = new KafkaProducer<>(pros);
        //将对象转换成字符串发送到kafka
        String elem=userVisit.getTime()+" "+userVisit.getProvince()+" "+userVisit.getCity()+" "+userVisit.getUserId()+" "+userVisit.getAdId();
            ProducerRecord<String, String> record = new ProducerRecord<>("HotRecommend", null, elem);
        producer.send(record);

    }
    @PostMapping("/Recommend")
    @ApiOperation("用户行为操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userbehavior", value = "用户行为操作", dataType = "Userbehavior"),
    })
    //数据类型 (16824372947   小明  广告ID  操作行为)
    public void spark2(@RequestBody Userbehavior userbehavior) throws Exception{
        HashMap<String, Object> pros = new HashMap<>(3);
        pros.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.60.128:9092");
        pros.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        pros.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> producer = new KafkaProducer<>(pros);
        //将对象转换成字符串发送到kafka
        String elem=userbehavior.getTime()+" "+userbehavior.getUserId()+" "+userbehavior.getAdId()+" "+userbehavior.getBehavior();
        ProducerRecord<String, String> record = new ProducerRecord<>("Recommend", null, elem);
        producer.send(record);

    }
}
