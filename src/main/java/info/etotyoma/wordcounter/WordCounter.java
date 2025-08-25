package info.etotyoma.wordcounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class WordCounter {

//    Программа на вход принимает строку(str) и количество совпадений(n),
//    подсчитать какие слова встречаются (n). Результат вывести на экран.
//    Пример: hello world qwerty world; n = 2;
//    Результат: world
//    Имя проекта: word_counter

    public static void main(String[] args) {
        // test cases
        System.out.println(getDuplicate("hello world qwerty world", 2));
        // output: "world"
        System.out.println(getDuplicate("hello qwerty world", 2));
        // output: ""
        System.out.println(getDuplicate("hello hello world", 3));
        // output: ""
    }

    private static String getDuplicate(String str, int n) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : str.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);

        Optional<String> word = map.entrySet().stream()
                .filter(entry -> entry.getValue() == n)
                .map(Map.Entry::getKey)
                .findFirst();

        return word.orElse("");
    }
}
