package com.ua.okono;

import junit.framework.Assert;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        Methods methods = new Methods();
        Assert.assertEquals(methods.calculateMultipleBy(new int[]{5, 4, 3, 2, 1}, 2), 6);
        Assert.assertFalse("Calculated sum is false",methods.calculateMultipleBy(new int[]{5,4,3,2,1},2) == 5);
        Assert.assertEquals(0, methods.calculateMultipleBy(new int[]{5, 4, 3, 2, 1}, 7));
        Assert.assertEquals(true, Arrays.equals(methods.createMassiveFromIndexMassive(new int[]{-2, 5, 0, 2, 0}, 0), new int[]{2, 4}));
        Assert.assertFalse("False result returned", Arrays.equals(methods.createMassiveFromIndexMassive(new int[]{-2, 5, 1, 2, 1}, 0), new int[]{1}));
        Assert.assertEquals(methods.firstPositiveOrNegative(new int[]{1,2,3}), "Positive");
        Assert.assertNotSame("Positive", methods.firstPositiveOrNegative(new int[]{-2, 2, 3}));
        Assert.assertTrue("Not the same massive", Arrays.equals(methods.isSortingAsc(new int[]{3,-1,5,1,2}), new int[]{-1,1,2,3,5}));
        Assert.assertEquals(Arrays.equals(methods.pairElementsCheck(new int[]{2,7,3,8,2}), new int[]{2,8,4}), false);
        Assert.assertEquals(true,Arrays.equals(methods.pairElementsCheck(new int[]{2,7,3,8,3}), new int[]{2,8}));
        Assert.assertEquals(methods.digitReplacement(new int[]{2,7,3,1,1}, 2), 2);
        Assert.assertTrue("False assertion",methods.digitReplacement(new int[]{3,1,-2,4,5}, 7) == 0);
        Assert.assertTrue("Not the same massive",Arrays.equals(methods.positiveNegativeZero(new int[]{7,-14,5,2,0,0,1,4}), new int[]{5,1,2}));
        Assert.assertEquals("Replacement isn't performed",Arrays.equals(methods.minMaxReplacement(new int[]{1,2,3}), new int[]{3,2,1}), true);
        Assert.assertFalse("Replacement is performed",Arrays.equals(methods.minMaxReplacement(new int[]{1,2,3}), new int[]{1,2,3}));
        Assert.assertTrue(Arrays.equals(methods.remainderFromDivision(new int[]{1,2,3,4}, 2, 0), new int[]{2,4}));
        Assert.assertEquals("Not empty massive is created",Arrays.equals(methods.remainderFromDivision(new int[]{1,2,3,4}, 7, 0),new int[]{}), true);
        Assert.assertEquals(Arrays.equals(methods.replace(new int[]{6,-11,2,0,3,7}), new int[]{-11,6,0,2,7,3}), true);
        Assert.assertEquals(Arrays.equals(methods.replace(new int[]{6,-11,2,0,3,7}), new int[]{6,-11,2,0,7,3}), false);
        Assert.assertTrue(methods.minMaxPairSum(new int[]{4,2,1,0,3,1}) == 4);
        Assert.assertNotSame(methods.minMaxPairSum(new int[]{4,2,1,0,3,1}), 3);
        Assert.assertEquals(methods.multipleBy(new int[]{4,2,1,0,3,1}, 2), 12);
        Assert.assertTrue(methods.multipleBy(new int[]{4,2,1,0,3,1}, 5) == 1);
        Assert.assertTrue(Arrays.equals(methods.modularity(new int[]{4,-13,1,0,-7,3}), new int[]{4,0,1,0,0,3}));
        Assert.assertEquals(methods.maxMinAbs(new int[]{5,2,3,-1,-3,-3,-10}),"Negative amount is > Positive amount");
        Assert.assertNotSame("Negative amount is > Positive amount",methods.maxMinAbs(new int[]{5,2,3,6,4,3-1,-3,-3,-10}));
        Assert.assertTrue("Negative amount != Positive amount", methods.maxMinAbs(new int[]{5, 2, 3, -5, -3, -2}).equals("Negative amount = Positive amount"));
        Assert.assertTrue(Arrays.equals(methods.firstMax(new int[]{1,2,3}),new int[]{1,0,3}));
        Assert.assertFalse(Arrays.equals(methods.firstMax(new int[]{1,2,3}),new int[]{0,2,0}));
        Assert.assertTrue(Arrays.equals(methods.lastElement(new int[]{5,33,2,13,22},2),new int[]{2,22}));
        Assert.assertTrue(Arrays.equals(methods.lastElement(new int[]{5,33,2,13,22},8),new int[]{}));
        //methods.createMassiveFromIndexList(list,0);
        //methods.lessThanValue(10,2);
        //methods.beforeZeroPrint(3);
    }
}
