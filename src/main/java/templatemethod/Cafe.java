package templatemethod;

public class Cafe extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando café");
    }
}