package one.digitalinnovation.gof.Singleton;

/*
 * Singleton "Preguiçoso"
 * @author GabrielAL4
 * */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
