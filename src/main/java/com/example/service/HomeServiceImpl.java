package com.example.service;

import com.example.dao.HomeDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HomeServiceImpl implements HomeService{
    @Resource
    private HomeDao homeDao;
}
