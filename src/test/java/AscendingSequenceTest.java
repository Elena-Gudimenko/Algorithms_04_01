import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequenceHappyPath(){
        //0, 1, 2, 3, 4, 5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

}

