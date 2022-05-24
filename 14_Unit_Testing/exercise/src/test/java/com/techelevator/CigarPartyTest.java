package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {
    private CigarParty reachesRequieredAmount = new CigarParty();
    private boolean result;
    @Test
    public void returns_true_if_correct(){
        // Act - get result if cigar are 45, and no weekend
        result = reachesRequieredAmount.haveParty(45,false);
        // Assert - should return true
        Assert.assertEquals(true,result);
        // Act - get result if weekend and 69 cigars
        result = reachesRequieredAmount.haveParty(55,true);
        //Assert - should return true
        Assert.assertEquals(true,result);
        // Act - get result if weekend and 60 cigars
        result = reachesRequieredAmount.haveParty(60,true);
        //Assert - should return true
        Assert.assertEquals(true,result);
        // Act - get result if non-weekend and 60 cigars
        result = reachesRequieredAmount.haveParty(60,false);
        //Assert - should return true
        Assert.assertEquals(true,result);
        // Act - get result if weekend and 40 cigars
        result = reachesRequieredAmount.haveParty(40,true);
        //Assert - should return true
        Assert.assertEquals(true,result);
        // Act - get result if non-weekend and 40 cigars
        result = reachesRequieredAmount.haveParty(40,false);
        //Assert - should return true
        Assert.assertEquals(true,result);
    }
    @Test
    public void wrong_number_of_cigars(){
        // Act - if cigars are 61, and not weekend
        result = reachesRequieredAmount.haveParty(61,false);
        //Assert - should return false
        Assert.assertEquals(false,result);
        // Act - if cigars are 39, and not weekend
        result = reachesRequieredAmount.haveParty(39,false);
        //Assert - should return false
        Assert.assertEquals(false,result);
        // Act - if cigars are 71, and not weekend
        result = reachesRequieredAmount.haveParty(61,false);
        //Assert - should return false
        Assert.assertEquals(false,result);
        // Act - get result if cigars are 20, and weekend
        result = reachesRequieredAmount.haveParty(20,true);
        //Assert - should return false
        Assert.assertEquals(false,result);

    }

}
