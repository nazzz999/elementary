package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort34125() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort310() {
        int[] data = new int[] {3, 1, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort94124() {
        int[] data = new int[] {9, 4, 1, 2, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4, 4, 9};
        assertThat(result).containsExactly(expected);
    }
}
