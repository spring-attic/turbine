package turbine;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.bus.turbine.EnableBusTurbine;
import org.springframework.context.annotation.Configuration;

/**
 * @author Spencer Gibb
 * @author Dave Syer
 */
@Configuration
@EnableAutoConfiguration
@EnableBusTurbine
public class TurbineApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineApplication.class).web(false).run(args);
    }
}
