package one.digitalinnovation.gof.Singleton;

/*
 * Singleton "Apressado"
 * @author GabrielAL4
 * */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
