package abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
        customerManager.getCustomer();

        CustomerManager customerManager2=new CustomerManager();
        customerManager2.baseDatabaseManager=new SqlServerDatabaseManager();
        customerManager2.getCustomer();
    }
}
