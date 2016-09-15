import org.junit.Test;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import ua.epam.GetIndex;

import static org.junit.Assert.*;

/**
 * Created by Oleksii_Sydorenko on 9/14/2016.
 */
public class IndexTest {
    GetIndex test = new GetIndex();
    int [] myArray = {0,1,2,3,4,5};
    int [] myArrayFull = {4,4,4,4,4,4};
    int [] myArrayOne = {0};
    int [] myArrayEmptyIn = {};
    int number;


    @Test
    public void emptyArray() throws Exception{
        int [] myArrayEmpty = {};
        int [] result = test.getArrayIndex(myArray,0);
        Assert.assertArrayEquals(result,myArrayEmpty);
    }
    @Test
    public void emptyArrayIn() throws Exception{
        int [] myArrayEmpty = {};
        int [] result = test.getArrayIndex(myArrayEmptyIn,number);
        Assert.assertArrayEquals(result,myArrayEmpty);
    }

    @Test
    public void oneNumberArray() throws Exception{
        int [] result = test.getArrayIndex(myArray,1);
        Assert.assertArrayEquals(myArrayOne,result);
    }

    @Test
    public void fullNumberArray() throws Exception{
        int [] result = test.getArrayIndex(myArrayFull,4);
        Assert.assertArrayEquals(myArray,result);
    }

}
