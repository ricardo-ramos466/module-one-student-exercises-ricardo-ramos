package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {
    private int you;
    private int date;
    private DateFashion fashion = new DateFashion();
    private int table;
    @Test
    public void you_and_date_stylish(){
        // Act - Both you and date are stylish
        you = 10; date = 10;
        // Assert - should return 2
        Assert.assertEquals(2,table);


    }
}
