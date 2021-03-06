package mypackage;

import java.util.logging.Level;
import java.util.logging.Logger;

class ChildLogger{
    private Logger logger = Logger.getLogger("sam.logging.child");
    
    private Level level = null;
    public ChildLogger() {
        //level = Level.INFO;
        //setting the level of this child logger, if not specified, it
        // will use the level of the parent logger
        logger.setLevel(level);
    }
    
    public void aMethod() {
        logger.log(Level.INFO, "Info message from Child Logger");
        logger.log(Level.SEVERE, "Severe message from Child Logger");
    }
}
