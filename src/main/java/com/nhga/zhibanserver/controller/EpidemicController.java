package com.nhga.zhibanserver.controller;

import com.nhga.zhibanserver.entity.Epidemic;
import com.nhga.zhibanserver.service.IEpidemicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
@RequestMapping("/")
public class EpidemicController {
    @Autowired
    private IEpidemicService epidemicSvc;

    @CrossOrigin
    @RequestMapping("epidemic/add")
    public boolean add(@RequestBody Epidemic data) {
        Date date = new Date();
        String date_time = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(date);

        try {
            return epidemicSvc.save(data);
        } catch (Exception ex) {
            System.out.println(date_time + "保存数据库Epidemic error：" + ex.getMessage());
            return false;
        }
    }
}