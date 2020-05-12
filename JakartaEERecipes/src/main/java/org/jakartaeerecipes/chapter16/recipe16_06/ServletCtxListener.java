
package org.jakartaeerecipes.chapter16.recipe16_06;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Juneau
 */
public class ServletCtxListener implements ServletContextListener {
    Thread printerThread = null;
    
    @Resource(name ="concurrent/AcmeThreadFactory")
    ManagedThreadFactory threadFactory;

    public void contextInitialized(ServletContextEvent scEvent) {

        MessagePrinter printer = new MessagePrinter();
        //Thread loggerThread = threadFactory..newThread(printer);
        //loggerThread.start();
    }

    public void contextDestroyed(ServletContextEvent scEvent) {
        synchronized (printerThread) {
            printerThread.interrupt();
        }
    }
}