package templatemethod;

public class Cha extends Bebida {

    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando chá");
    }
}