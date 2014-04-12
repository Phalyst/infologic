package conf;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import conf.RepositoryConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

/**
 *
 * @author boniface
 */
@Configuration
@ComponentScan(basePackages = "domain")     
@Import(RepositoryConfig.class)
@ActiveProfiles("integration-test")
public class TestConfig {
    
}
