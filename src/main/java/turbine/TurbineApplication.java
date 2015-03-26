package turbine;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.amqp.EnableTurbineAmqp;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.StandardEnvironment;

/**
 * @author Spencer Gibb
 * @author Dave Syer
 */
@Configuration
@EnableAutoConfiguration
@EnableTurbineAmqp
@EnableDiscoveryClient
public class TurbineApplication {

	public static void main(String[] args) {
		boolean cloudEnvironment = new StandardEnvironment().acceptsProfiles("cloud");
		new SpringApplicationBuilder(TurbineApplication.class).web(!cloudEnvironment).run(args);
	}
}
