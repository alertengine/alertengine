package com.pmobile.alertengine;

import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = H2IntegrationTestConfig.class)
@TestPropertySource(
        locations = "classpath:test.properties")
@ComponentScan("com.pmobile.alertengine")
@EntityScan("com.pmobile.alertengine")
@IfProfileValue(name = "targetPlatform", value = "test")
public class H2IntegrationTestConfig {


}
