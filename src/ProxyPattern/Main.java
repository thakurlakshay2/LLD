package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        try{
        EmployeeDao emptyEMpObj=new EmployeeDaoProxy();
        emptyEMpObj.create("ADMIN",new EmployeeDo());
        System.out.println("Operation success");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
