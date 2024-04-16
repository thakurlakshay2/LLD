package ProxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String cleint, EmployeeDo obj) throws Exception {
        if(cleint.equals("ADMIN")){
            employeeDao.create(cleint,obj);
            return;
        }
        throw new Exception("Access denied");
    }

    @Override
    public void delete(String cleint, int employeeId) throws Exception {
        if(cleint.equals("ADMIN")){
            employeeDao.delete(cleint,employeeId);
            return;
        }
        throw new Exception("Access denied");
    }

    @Override
    public EmployeeDo get(String cleint, int employeeId) throws Exception {
        if(cleint.equals("ADMIN")|| cleint.equals("USER")){
           return  employeeDao.get(cleint,employeeId);

        }
        throw new Exception("Access denied");
    }

}
