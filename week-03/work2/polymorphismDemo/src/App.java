public class App {
    public static void main(String[] args) throws Exception {
        // BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), 
        //     new ConsoleLogger(), new DatabaseLogger() };
            
        // for (BaseLogger logger : loggers) {
        //     logger.Log("Log mesaji");
        // }

        // constructor yapısı
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
