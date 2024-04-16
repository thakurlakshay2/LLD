package ProxyPattern;

public interface EmployeeDao {
    public void create(String cleint,EmployeeDo obj) throws Exception;
    public void delete(String cleint,int employeeId ) throws Exception;
    public EmployeeDo get(String cleint,int employeeId ) throws Exception;

}
