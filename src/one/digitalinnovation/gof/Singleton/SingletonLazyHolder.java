package one.digitalinnovation.gof.Singleton;

/*
 * Singleton "Preguiçoso"
 * @author GabrielAL4
 * */
public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}