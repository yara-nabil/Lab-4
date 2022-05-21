package com.company;
public class ATM1 {
    public int amount = 50000;
    public String checking(int value){
        if (amount>value)
            return "Transaction Accepted";
        else
            return " Rejected transection ";
    }
}
package com.company;
public class ATM {
    public int takemoney(int value){
        ATM1 atm = new ATM1();
        String tmam = atm.checking(value);
        if(tmam=="Transaction Accepted")
        {
            int NewBalance = atm.amount - value ;
            System.out.println(" you have take "+value);
            System.out.println(" your new balance is "+NewBalance);
            return 1;
        }
        else{
            System.out.println(" your balnace is not enough to do this
                    transaction ");
            return 0;
        }
    }
}
package com.company;
        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;
class ATMTest {
    @Test
    public void test1 (){
        ATM test1 = new ATM();
        assertEquals(1,test1.takemoney(1000));
    }
    @Test
    public void test2(){
        ATM test2 = new ATM();
        assertEquals(1,test2.takemoney(10000));
    }
    @Test
    public void test3 (){
        ATM test3 = new ATM();
        assertEquals(0,test3.takemoney(150000));
    }
}
