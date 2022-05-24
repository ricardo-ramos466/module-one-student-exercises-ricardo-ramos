package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {
    private AnimalGroupName animal = new AnimalGroupName();
    private String herd;

    @Test
    public void grabs_animal_Pack(){
        // Act - get animal Pack
         herd = animal.getHerd("lion");
        // Assert - Make sure animal sound is correct
        Assert.assertEquals("Pride",herd);
    }
    @Test
    public void provides_unknown_if_nonexistant(){
        // Act - nonexistant animal
        herd = animal.getHerd("tuccan");
        // Assert - herd is null
        Assert.assertEquals("unknown",herd);
    }
    @Test
    public void provides_unknown_if_null(){
        // Act - null animal
        herd = animal.getHerd("");
        // Assert - Herd is unknown
        Assert.assertEquals("unknown",herd);
    }
    @Test
    public void is_case_insensitive(){
        // Act - make non cased animal
        herd = animal.getHerd("gIrAfFe");
        // Assert - Herd is Tower
        Assert.assertEquals("Tower",herd);
    }
}
