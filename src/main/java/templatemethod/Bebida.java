package templatemethod;

public abstract class Bebida {

    public final void preparar() {
        System.out.println("Fervendo água");
        adicionarIngrediente();
        System.out.println("Bebida pronta");
    }

    protected abstract void adicionarIngrediente();
}