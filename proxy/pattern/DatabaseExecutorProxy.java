package proxy.pattern;

public class DatabaseExecutorProxy implements DatabaseExecutor{
    boolean ifAdmin;
    DatabaseExecutorImpl dbExecuter;

    public DatabaseExecutorProxy(String name, String passwd) {
        if(name == "Admin" && passwd == "Admin@123") {
            ifAdmin = true;
        }
        dbExecuter = new DatabaseExecutorImpl();
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if(ifAdmin) {
            dbExecuter.executeDatabase(query);
        } else {
            if(query.equals("DELETE")) {
                throw new Exception("DELETE not allowed for non-admin user  :: Access Denied");
            } else {
                dbExecuter.executeDatabase(query);
            }
        }
    }
}
