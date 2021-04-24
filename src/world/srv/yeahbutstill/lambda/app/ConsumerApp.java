package world.srv.yeahbutstill.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {

    public static void main(String[] args) {

        // interface consumer if u needed lambda dimana hanya menerima data
        Consumer<String> consumer = value -> System.out.println(value);
        consumer.accept("Azhilla");

        // interface function


    }

}
