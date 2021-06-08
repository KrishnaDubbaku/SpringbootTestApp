package boot.git.messasge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner
{
private static Logger log=LoggerFactory.getLogger(MessageRunner.class);
	@Override
	public void run(String... args) throws Exception 
	{
		int a=10;
		try
		{
			log.info("STARTED");
			System.out.println("HELLO GIT HUB ");
			System.out.println("WELCOME TO SPRING BOOOT USING GITHUB"+a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		log.info("END");
	}

}
