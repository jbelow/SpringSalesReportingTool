package jbelow.springsalesreportingtool;

import jbelow.springsalesreportingtool.iface.SalesInput;
import jbelow.springsalesreportingtool.iface.SalesOutput;
import jbelow.springsalesreportingtool.impl.ConsoleOutput;
import jbelow.springsalesreportingtool.impl.FileInput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("jbelow.springsalesreportingtool")
public class AppConfig {
//    @Bean
//    public ShippingPolicy FreeShipping() {
//        return new FreeShipping();
//    }

    @Bean
    public SalesOutput ConsoleOutput() {
        return new ConsoleOutput();
    }

    @Bean
    public SalesInput FileInput() {
        return  new FileInput();
    }


}
