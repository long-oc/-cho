/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Long
 */
public class MathJUnitTest {
    @Test
    public void getFactorial_RunsWell_IfValidArgumrnt(){
        assertEquals(120, demogit.DemoGit.getFac(5));// xanh vi minh tianh ra nhu ki vong
    }
    
    //can test coi co nem ngoai le hay khong
    //neu dung la may nem ve ngoai le illegalargumentexception trong
    //tinh huong giai thua -5 thi ta co mau xanh
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        //ngoai le khong phai value. chi co the kiem tra no
        demogit.DemoGit.getFac(10);
    }
    
    public MathJUnitTest() {
        
    }
    // helloword
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
