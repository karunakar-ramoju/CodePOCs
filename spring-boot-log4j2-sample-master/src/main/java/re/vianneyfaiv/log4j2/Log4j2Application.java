package re.vianneyfaiv.log4j2;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class Log4j2Application {

	private final static Logger LOGGER = LoggerFactory.getLogger(Log4j2Controller.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Log4j2Application.class, args);
	}
	
	
	
	
	@Scheduled(initialDelay = 1000, fixedRate = 6000)
	public void run() {
		
		LOGGER.debug("This is a debug message");
		LOGGER.info("This is an info message");
		LOGGER.warn("This is a warn message");
		LOGGER.error("This is an error message");
		
		System.out.println("Current time is :: " + Calendar.getInstance().getTime());
	}
}
