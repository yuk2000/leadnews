package com.heima.wemedia.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(Runner.class)
class WmNewsAutoScanServiceTest {

    @Autowired
    WmNewsAutoScanService wmNewsAutoScanService;

    @Test
    void autoScanWmNews() {
        wmNewsAutoScanService.autoScanWmNews(6233);
    }
}