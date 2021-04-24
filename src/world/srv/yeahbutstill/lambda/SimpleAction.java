package world.srv.yeahbutstill.lambda;

@FunctionalInterface    // menandakan ini adalah lambda dan doi wajib memiliki method
public interface SimpleAction {

    String action(String name); // just one tidak boleh libih methodnya

}
