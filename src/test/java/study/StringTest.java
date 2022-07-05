package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    @DisplayName("replace test")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split test")
    void split() {
        List<String> strArr = Arrays.asList("1,2".split(","));
        assertThat(strArr).containsExactly("1", "2");

    }

    @Test
    @DisplayName("subString test")
    void subString() {
        String str = "(1,2)".substring(1, 4);
        assertThat(str).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt test")
    void charAt() {
        String str = "abc";
        char spotChar = str.charAt(1);
        assertThat(spotChar).isEqualTo('b');

        assertThatThrownBy(() -> {
            char errorChar = str.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
