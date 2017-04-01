package list1;

import static java.util.Arrays.asList;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


import com.company.ArraysExec;
import com.company.CollectionUtils;
import org.junit.Test;

import java.util.*;

public class ArraysTest {

    @Test
    public void shouldFindLastElementFromAlist(){

        assertThat(ArraysExec.last(asList("a", "b", "c")),
                is(equalTo("c")));
    }

    @Test
    public void shouldFindLastElementALinkedList(){
        LinkedList<String> list = CollectionUtils.linkedList("a", "v", "c");
        assertThat(ArraysExec.last(list), is(equalTo("c")));
    }

    @Test
    public void listOfEmptyListShouldBe0(){
        long length = ArraysExec.length(Collections.emptyList());
        assertThat(length, is(equalTo(0L)));
    }

    @Test
    public void shouldFindListOfNonEmptyList() {
        assertThat(ArraysExec.length(asList(1, 2, 3, 4, 5, 6)), is(equalTo(6)));
    }

    @Test
    public void shouldReverseAList(){
        List<Integer> numbers = asList(1,2,3,4,5,6,7,8,9,10);
        assertThat(ArraysExec.reverse(numbers), is(equalTo(asList(10,9,8,7,6,5,4,3,2,1))));
    }


    @Test
    public void shouldReturnTrueWhenListIsPalidrome(){
        assertTrue(ArraysExec.isPalidrome(asList("a", "l", "a")));
    }

    @Test
    public void shouldRemoveConsecutiveDuplicatesInAList(){
        List<String> compressedList = ArraysExec.compress(asList("a","a","b", "b"));
        assertThat(compressedList,contains("a", "b"));
    }





   /* @Test
    public void shouldFindLastElementsAListUsingRecursion(){
        assertThat(ArraysExec.lastRecursive(asList("a", "b", "c")), is(equalTo("c")));
    }
    */



}
