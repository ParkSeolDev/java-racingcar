import java.util.HashSet;
import java.util.Set;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("size 메소드를 이용해 set 의 크기를 확인하는 테스트")
    public void setSizeTest() {

        int numbersSize = numbers.size();

        assertThat(numbersSize).isEqualTo(3);
    }

    @DisplayName("contains 메소드를 통해 주어지는 파라미터 값이 set에 존재하는지 확인하는 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void setContainsTest(int testCase) {

        assertThat(numbers.contains(testCase)).isTrue();
    }

    @DisplayName("contains 메소드를 사용하고, set에 존재하지 않는 입력값의 유무도 확인하는 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    public void setNotContainsTest(int testCase, boolean expect) {

        assertThat(numbers.contains(testCase)).isEqualTo(expect);
    }
}