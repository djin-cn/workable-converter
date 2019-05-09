package com.liumapp.workable.converter.factory;

import com.liumapp.workable.converter.config.ConverterConfig;

/**
 * file ConverterConfigManager.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/5/9
 */
public class ConverterConfigManager {

    private static ConverterConfigManager INSTANCE;

    private static ConverterConfig params;

    private ConverterConfigManager () {
    }

    public static ConverterConfigManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConverterConfigManager();
            buildingConverterConfig(INSTANCE);
        }
        return INSTANCE;
    }

    public static ConverterConfig getParams() {
        return params;
    }

    private static void buildingConverterConfig (ConverterConfigManager INSTANCE) {
        INSTANCE.params = new ConverterConfig();
        
    }
}