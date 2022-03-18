import org.junit.Test;

import static org.junit.Assert.*;

public class yungTest {
    @Test
    public void equi(){
        var check=new yung();
        assertEquals("yes",check.idle(0,0,0));
    }
    @Test
    public void notequi(){
        var check=new yung();
        assertEquals("no",check.idle(4,-2,0));
    }
}