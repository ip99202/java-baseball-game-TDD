package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateNumberTest {

    @Test
    void 입력숫자범위검증() {
        assertThat(ValidateUtils.validNum(9)).isEqualTo(true);
        assertThat(ValidateUtils.validNum(1)).isEqualTo(true);
        assertThat(ValidateUtils.validNum(10)).isEqualTo(false);
        assertThat(ValidateUtils.validNum(0)).isEqualTo(false);
    }
}
