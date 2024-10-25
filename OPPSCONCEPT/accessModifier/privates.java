package accessModifier;

public class privates{
    public String name;
    protected  String Email;
    private String password;

    // getter and setter 
    public String getPassword(){
        return this.password;
    }

    public String setPassword(String pass){
    return this.password=pass;
    }   
    public static void main(String[] args) {
        privates account1=new privates();
        account1.name="birju kumar";
        account1.Email="apanacolllege@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

    }
}
