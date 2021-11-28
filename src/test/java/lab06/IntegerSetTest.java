package lab06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerSetTest {

    @Test
    public void shouldAddElementsFromScope() {
        IntegerSet integerSet = new IntegerSet();
        integerSet.insertElement(1);
        integerSet.insertElement(2);
        integerSet.insertElement(3);
        integerSet.insertElement(4);
        integerSet.insertElement(99);
        integerSet.insertElement(100);

        assertEquals("1 2 3 4 99 100 ", integerSet.toString());
    }

    @Test
    public void shouldNotIncludeElementsOutOfRange() {
        IntegerSet integerSet = new IntegerSet();
        integerSet.insertElement(1);
        integerSet.insertElement(2);
        integerSet.insertElement(101);
        integerSet.insertElement(0);

        assertEquals("1 2 ", integerSet.toString());
    }

    @Test
    public void shouldMakeUnionFromTwoIntegerSets(){
        IntegerSet integerSet1 = new IntegerSet();
        integerSet1.insertElement(1);
        integerSet1.insertElement(100);
        integerSet1.insertElement(9);
        integerSet1.insertElement(55);
        integerSet1.insertElement(99);


        IntegerSet integerSet2 = new IntegerSet();
        integerSet2.insertElement(4);
        integerSet2.insertElement(150);
        integerSet2.insertElement(85);
        integerSet2.insertElement(30);
        integerSet2.insertElement(99);

        IntegerSet result = IntegerSet.union(integerSet1,integerSet2);

        assertEquals("1 4 9 30 55 85 99 100 ", result.toString());
    }

    @Test
    public void shouldBeAbleToDeleteElementFromIntegerSet(){
        IntegerSet integerSet1 = new IntegerSet();
        integerSet1.insertElement(1);
        integerSet1.insertElement(100);
        integerSet1.insertElement(9);
        integerSet1.insertElement(55);
        integerSet1.insertElement(99);

        integerSet1.deleteElement(9);

        assertEquals("1 55 99 100 ", integerSet1.toString());
    }

    @Test
    public void shouldMakeAIntersectionFromTwoIntegerSets(){
        IntegerSet integerSet1 = new IntegerSet();
        integerSet1.insertElement(1);
        integerSet1.insertElement(100);
        integerSet1.insertElement(2);
        integerSet1.insertElement(3);
        integerSet1.insertElement(99);

        IntegerSet integerSet2 = new IntegerSet();
        integerSet2.insertElement(2);
        integerSet2.insertElement(7);
        integerSet2.insertElement(15);
        integerSet2.insertElement(3);
        integerSet2.insertElement(99);
        integerSet2.insertElement(98);

        IntegerSet intersection = IntegerSet.intersection(integerSet1,integerSet2);


        assertEquals("2 3 99 ", intersection.toString());
    }


}