package holaMundo;

import java.time.Duration;

import pattern.command.Command;
import pattern.command.ExtendedCommand;

public class holaMundo {

	public static void main(String[] args) {
		
		String objeto = new String ();
		
		objeto = "Hola Mundo";
		
		System.out.println(objeto);
		
		Command command = new ExtendedCommand(Duration.parse("pt1s"));
		System.out.println("Command must run at " + command.timeToRun());
		command.run();

	}

}
