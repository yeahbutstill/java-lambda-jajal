package world.srv.yeahbutstill.lambda.app;

import world.srv.yeahbutstill.lambda.util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {

    public static void main(String[] args) {

        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        // bisa juga menggunakan ini yang penting parameternya harus sama
        Predicate<String> predicateIsLowerCase1 = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("azhilla"));
        System.out.println(predicateIsLowerCase.test("AZHILLA"));
        System.out.println(predicateIsLowerCase1.test("azhilla"));


    }

    public void run() {

        MerhodReferenceApp app = new MerhodReferenceApp();

        // method reference Non static
        Predicate<String> predicate = app::isLowerCase;

        System.out.println(predicate.test("Azhilla"));
        System.out.println(predicate.test("azhilla"));
    }

    public boolean isLowerCase(String value) {

        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;

    }

}
