package bootpackage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggerClass {
	
	public LoggerClass() {
		BasicConfigurator.configure();
		Logger log = Logger.getLogger("LogPruebas");
	}
	
}
