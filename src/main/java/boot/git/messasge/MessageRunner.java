package boot.git.messasge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception 
	{
		int a=10;
 		System.out.println("HELLO GIT HUB ");
		System.out.println("WELCOME TO SPRING BOOOT USING GITHUB"+a);
	}

}
