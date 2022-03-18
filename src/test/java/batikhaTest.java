import org.junit.Test;

import static org.junit.Assert.*;


public class batikhaTest {
    @Test
    public void isEven(){
        batikha check=new batikha();
        assertEquals("yes",check.helwa(14));
    }
    @Test
    public void isODD(){
        batikha check=new batikha();
        assertEquals("no",check.helwa(11));
    }
    @Test
    public void isZero(){
        batikha check=new batikha();
        assertEquals("no",check.helwa(0));
    }
    @Test
    public void isheavy(){
        batikha check=new batikha();
        assertEquals("no",check.helwa(21));
    }
    @Test
    public void impossible(){
        batikha check=new batikha();
        assertEquals("no",check.helwa(-5));
    }
}