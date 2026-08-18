package LeetCode;
import java.util.*;
public class BasicCalculator4 {
    class Solution {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> values = new HashMap<>();

        public List<String> basicCalculatorIV(
                String expression,
                String[] evalvars,
                int[] evalints) {

            for (int i = 0; i < evalvars.length; i++) {
                values.put(evalvars[i], evalints[i]);
            }

            String[] tokens = expression.replace("(", " ( ")
                    .replace(")", " ) ")
                    .trim()
                    .split("\\s+");

            int[] index = {0};

            Map<String, Integer> result = parse(tokens, index);

            List<String> ans = new ArrayList<>();

            for (String key : result.keySet()) {
                int coefficient = result.get(key);

                if (coefficient == 0)
                    continue;

                if (key.equals("")) {
                    ans.add(String.valueOf(coefficient));
                } else {
                    ans.add(coefficient + "*" + key);
                }
            }

            Collections.sort(ans, (a, b) -> {

                String[] x = a.split("\\*");
                String[] y = b.split("\\*");

                // Degree descending
                if (x.length != y.length) {
                    return y.length - x.length;
                }

                // Ignore coefficient
                String sx = a.substring(a.indexOf('*') + 1);
                String sy = b.substring(b.indexOf('*') + 1);

                return sx.compareTo(sy);
            });

            return ans;
        }

        // expression -> terms separated by + / -
        private Map<String, Integer> parse(String[] tokens, int[] index) {

            Map<String, Integer> result = parseTerm(tokens, index);

            while (index[0] < tokens.length &&
                    !tokens[index[0]].equals(")")) {

                String op = tokens[index[0]++];

                Map<String, Integer> next = parseTerm(tokens, index);

                if (op.equals("+")) {
                    result = add(result, next, 1);
                } else {
                    result = add(result, next, -1);
                }
            }

            return result;
        }

        // expression * expression
        private Map<String, Integer> parseTerm(
                String[] tokens, int[] index) {

            Map<String, Integer> result = parseFactor(tokens, index);

            while (index[0] < tokens.length &&
                    tokens[index[0]].equals("*")) {

                index[0]++;

                Map<String, Integer> next = parseFactor(tokens, index);

                result = multiply(result, next);
            }

            return result;
        }

        private Map<String, Integer> parseFactor(
                String[] tokens, int[] index) {

            String token = tokens[index[0]++];

            // Parentheses
            if (token.equals("(")) {

                Map<String, Integer> result = parse(tokens, index);

                // Skip ')'
                index[0]++;

                return result;
            }

            // Number
            if (Character.isDigit(token.charAt(0))) {

                Map<String, Integer> result = new HashMap<>();

                result.put("", Integer.parseInt(token));

                return result;
            }

            // Variable
            if (values.containsKey(token)) {

                Map<String, Integer> result = new HashMap<>();

                result.put("", values.get(token));

                return result;
            }

            // Free variable
            Map<String, Integer> result = new HashMap<>();

            result.put(token, 1);

            return result;
        }

        private Map<String, Integer> add(
                Map<String, Integer> a,
                Map<String, Integer> b,
                int sign) {

            Map<String, Integer> result = new HashMap<>(a);

            for (String key : b.keySet()) {

                result.put(
                        key,
                        result.getOrDefault(key, 0)
                                + sign * b.get(key)
                );
            }

            return result;
        }

        private Map<String, Integer> multiply(
                Map<String, Integer> a,
                Map<String, Integer> b) {

            Map<String, Integer> result = new HashMap<>();

            for (String key1 : a.keySet()) {
                for (String key2 : b.keySet()) {

                    String key = combine(key1, key2);

                    int value = a.get(key1) * b.get(key2);

                    result.put(
                            key,
                            result.getOrDefault(key, 0) + value
                    );
                }
            }

            return result;
        }

        private String combine(String a, String b) {

            if (a.equals(""))
                return b;

            if (b.equals(""))
                return a;

            List<String> vars = new ArrayList<>();

            if (!a.equals(""))
                vars.addAll(Arrays.asList(a.split("\\*")));

            if (!b.equals(""))
                vars.addAll(Arrays.asList(b.split("\\*")));

            Collections.sort(vars);

            return String.join("*", vars);
        }
    }
}
