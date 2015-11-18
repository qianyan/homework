import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CollectionsOpsTest {

    private List<Integer> numbers;

    @Before
    public void setUp() throws Exception {
        numbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    public void should_get_all_odd_numbers() throws Exception {
        List<Integer> odds = CollectionsOps.odd(numbers);

        assertThat(odds, equalTo(asList(1, 3, 5, 7, 9)));
    }

    @Test
    public void should_double_all_even_numbers() throws Exception {
        List<Integer> numbersWithDoubleEvens = CollectionsOps.doubleEvens(numbers);

        assertThat(numbersWithDoubleEvens, equalTo(asList(1, 4, 3, 8, 5, 12, 7, 16, 9, 20)));
    }

    @Test
    public void should_find_specific_number_or_return_not_found() throws Exception {

        String theOne  = CollectionsOps.tryFind(1, numbers);
        String unknownOne  = CollectionsOps.tryFind(11, numbers);

        assertThat(theOne, is("Hello, 1"));
        assertThat(unknownOne, is("Not Found"));
    }
}
