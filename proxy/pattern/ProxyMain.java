package proxy.pattern;

public class ProxyMain {
    public static void main(String[] args) throws Exception {

        DatabaseExecutor nonAdminExecutor = new DatabaseExecutorProxy("NonAdmin", "Admin@123");
        nonAdminExecutor.executeDatabase("UPDATE");

        DatabaseExecutor adminExecuter = new DatabaseExecutorProxy("Admin", "Admin@123");
        adminExecuter.executeDatabase("DELETE");


        DatabaseExecutor nonAdminExecutorDELETE = new DatabaseExecutorProxy("NonAdmin", "Admin@123");
        nonAdminExecutorDELETE.executeDatabase("DELETE");



    }
}
