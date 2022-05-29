package proxy.pattern;

public class DatabaseExecutorImpl implements DatabaseExecutor {

    @Override
    public void executeDatabase(String query) throws Exception {
        System.out.println("Going to execute query: "+query);
    }
}
