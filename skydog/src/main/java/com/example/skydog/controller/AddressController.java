package com.example.skydog.controller;

import com.example.skydog.dao.AddressDao;
import com.example.skydog.enums.ResultEnum;
import com.example.skydog.module.entity.Address;
import com.example.skydog.module.vo.ResultVO;
import com.example.skydog.service.AddressService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: 张振彬
 * @create: 2022-09-07
 * @version: 1.0
 */
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/add")
    public ResultVO addAddress(@RequestBody Address address){

        return addressService.add((address));
    }

    @GetMapping("/delete/{addressId}")
    public ResultVO deleteAddress(@PathVariable Integer addressId) {
        return addressService.delete(addressId);
    }

    @PostMapping("/update")
    public ResultVO updateAddress(@RequestBody Address address){
        return addressService.update((address));
    }


    @GetMapping("/queryId/{addressId}")
    public ResultVO queryId(@PathVariable Integer addressId) {
        Address address = addressService.queryId(addressId);

        return new ResultVO(ResultEnum.SUCCESS,address);
    }


}
