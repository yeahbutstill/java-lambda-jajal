package world.srv.yeahbutstill.lambda.app;

import world.srv.yeahbutstill.lambda.SimpleAction;

public class SimpleActionApp {

    public static void main(String[] args) {

        // version anonymous classes
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Dani";
            }
        };
        System.out.println(simpleAction.action("Dani"));

        // jadi lambda itu versi sederhana dari anonymous classes
        SimpleAction simpleAction1 = (String name) -> {
            return "Azhilla";
        };
        System.out.println(simpleAction1.action("Azhilla"));


        // beberapa cara membuat lambda
        SimpleAction simpleAction2 = (String value) -> {
            return "Hello " + value;
        };
        System.out.println(simpleAction2.action("Yeahbutstill"));

        SimpleAction simpleAction3 = (name) -> {
            return "Sup " + name;
        };
        System.out.println(simpleAction3.action("Sayang"));

        // lambda tanpa block
        SimpleAction simpleAction4 = (String name) -> "Hello " + name;
        SimpleAction simpleAction5 = (name) -> "Hello " + name;
        SimpleAction simpleAction6 = name -> "Hello " + name;
    }

}
