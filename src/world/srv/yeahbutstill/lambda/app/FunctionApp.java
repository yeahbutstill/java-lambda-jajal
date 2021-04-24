package world.srv.yeahbutstill.lambda.app;

import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {

        // interface<parameter, result>
        Function<String, Integer> functionLength = value -> value.length();
        System.out.println(functionLength.apply("Azhilla"));

    }

}
