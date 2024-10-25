
package accessModifier;
public class defaults {
    String name;//default type another package can not access the anoter file or folder.
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="birju kumar";
        System.out.println(account1.name);
    }
}
