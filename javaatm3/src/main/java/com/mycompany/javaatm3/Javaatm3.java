
package com.mycompany.javaatm3;

public class Javaatm3 {

    public static void main(String[] args) {
       
        ATM atm = new ATM();
        
        Account account = new Account("Enes", "123456", 2000);
        
        atm.calis(account);
        
    }
}
