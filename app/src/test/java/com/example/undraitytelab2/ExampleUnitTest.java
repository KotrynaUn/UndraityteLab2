package com.example.undraitytelab2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test(expected = NullPointerException.class)
    public void getNumbersCountWhenNull(){
        Calculator.getNumbersCount(null);
    }
    @Test
    public void getNumbersCountWhenEmpty(){
        final String givenString = "";
        final int expectedResult = 0;
        final int actualResult = Calculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getNumbersCountWhenSpaces(){
        final String givenString = "    ";
        final int expectedResult = 0;
        final int actualResult = Calculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getNumbersCountWhenNumbers(){
        final String givenString = "123";
        final int expectedResult = 3;
        final int actualResult = Calculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getNumbersCountWhenSymbols(){
        final String givenString = ",./-";
        final int expectedResult = 0;
        final int actualResult = Calculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getNumbersCountWhenWords(){
        final String givenString = "Labas ir ate";
        final int expectedResult = 0;
        final int actualResult = Calculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void getCharsCountWhenNull(){
        Calculator.getCharsCount(null);
    }
    @Test
    public void getCharsCountWhenEmpty(){
        final String givenString = "";
        final int expectedResult = 0;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getCharsCountWhenSpaces(){
        final String givenString = "    ";
        final int expectedResult = 4;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getCharsCountWhenNumbers(){
        final String givenString = "123";
        final int expectedResult = 3;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getCharsCountWhenSymbols(){
        final String givenString = ",./-";
        final int expectedResult = 4;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getCharsCountWhenWords(){
        final String givenString = "Labas ir ate";
        final int expectedResult = 12;
        final int actualResult = Calculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void getWordsCountWhenNull(){
        Calculator.getWordsCount(null);
    }

    @Test
    public void getWordsCountWhenEmpty(){
      final String givenString = "";
      final int expectedResult = 0;
      final int actualResult = Calculator.getWordsCount(givenString);

     assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getWordsCountWhenSpaces(){
        final String givenString = "    ";
        final int expectedResult = 0;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getWordsCountWhenNumbers(){
        final String givenString = "123";
        final int expectedResult = 1;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getWordsCountWhenSymbols(){
        final String givenString = ",./-";
        final int expectedResult = 1;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getWordsCountWhenWords(){
        final String givenString = "Labas ir ate";
        final int expectedResult = 3;
        final int actualResult = Calculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }


}

