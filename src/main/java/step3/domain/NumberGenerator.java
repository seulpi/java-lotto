package step3.domain;

import java.util.List;

@FunctionalInterface
public interface NumberGenerator {
    List<Integer> generateNumbers();
}