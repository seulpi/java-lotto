package lotto.domain;

import java.util.*;
import java.util.stream.Collectors;

public class Lotto {

    private static final int MATCH_ONE = 1;
    private static final int NOT_MATCH_ZERO = 0;
    public static final int MAX_LOTTO_NUMBER_COUNT = 6;
    private static final String COMMA_EMPTY_STRING = ", ";

    private final List<Number> lotto;

    private Lotto(final List<Number> lotto) {

        this.lotto = lotto;
    }

    public static Lotto from(final String input) {

        validate(input);
        final List<Number> lottoNumbers = split(input);
        validateSize(lottoNumbers);

        return new Lotto(lottoNumbers);
    }

    public static Lotto from(final List<Integer> lottoNumber) {

        return new Lotto(convert(lottoNumber));
    }

    private static void validate(final String input) {

        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("입력 값이 null 또는 빈 공백 입니다.");
        }
    }

    private static void validateSize(final List<Number> lottoNumbers) {

        final Set<Number> numbers = new HashSet<>(lottoNumbers);
        if (numbers.size() != MAX_LOTTO_NUMBER_COUNT) {
            throw new IllegalArgumentException("6개의 숫자를 입력해야 하며 중복 숫자는 입력할 수 없습니다.");
        }
    }

    private static List<Number> split(final String input) {

        return Arrays.stream(input.split(COMMA_EMPTY_STRING))
                .sorted()
                .map(number -> new Number(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }

    private static List<Number> convert(final List<Integer> numbers) {

        return numbers.stream()
                .map(Number::new)
                .collect(Collectors.toList());
    }

    public int match(final WinningLotto winningLotto) {

        int result = 0;
        for (Number winningNumber : winningLotto.getWinnerLotto()) {
            result += compare(winningNumber);
        }
        return result;
    }

    private int compare(final Number winningNumber) {

        if (this.lotto.contains(winningNumber)) {
            return MATCH_ONE;
        }
        return NOT_MATCH_ZERO;
    }

    public List<Number> getLotto() {

        return Collections.unmodifiableList(this.lotto);
    }

    public boolean matchBonus(final WinningLotto winningLotto) {

        return this.lotto.contains(winningLotto.getBonusNumber());
    }
}
