package ch.toto.toolbox.datastructures.arrays;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayUtilsTest {

    private ArrayUtils arrayUtils;

    @BeforeEach
    void setUp() {
        this.arrayUtils = new ArrayUtils();
    }

    @Test
    void getSize() {
//        https://www.geeksforgeeks.org/problems/size-of-an-array/1
//        Input: arr[] = [1, 2, 3]
//        Output:
//        3
//        solution.getSize()
        assertThat(arrayUtils.getSize(new int[]{1, 2, 3})).isEqualTo(3);

//        Input: arr[] = [1, 2, 3, 5, 4]
//        Output: 5
//        Explanation: The size of the array is 5.
        assertThat(arrayUtils.getSize(new int[]{1, 2, 3, 5, 4})).isEqualTo(5);

    }

    @Test
    void invalidArrayGreaterThan10() {
        assertThat(arrayUtils.getSize(new int[]{1, 2, 3, 5, 4, 5, 6, 7, 8, 9, 10, 11})).isEqualTo(11);
    }
}