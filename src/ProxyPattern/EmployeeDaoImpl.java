package ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String cleint, EmployeeDo obj) throws Exception {
System.out.println("create new row  in the employee table");
    }

    @Override
    public EmployeeDo get(String cleint, int employeeId) throws Exception {
            System.out.println("feth client and employee id");
            return new EmployeeDo();
    }

    @Override
    public void delete(String cleint, int employeeId) throws Exception {
    System.out.println("delete row of employeeId:"+ employeeId);
    }
}
