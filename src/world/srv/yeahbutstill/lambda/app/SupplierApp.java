package world.srv.yeahbutstill.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Azhilla";
        System.out.println(supplier.get());

    }

}
