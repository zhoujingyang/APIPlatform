package com.test.platform.config;


import com.test.platform.model.config.FileBean;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;

@Configuration
@EnableTransactionManagement
public class FileConfig implements EnvironmentAware {
    private RelaxedPropertyResolver pathPropertyResolver;



    @Bean(name = "fileBean")
    public FileBean fileBeanFactory() throws IOException {
        FileBean bean = new FileBean();
        bean.setFilePath(pathPropertyResolver.getProperty("path"));
        return bean;
    }

    @Override
    public void setEnvironment(Environment environment) {
        pathPropertyResolver = new RelaxedPropertyResolver(environment, "file.");
    }
}
