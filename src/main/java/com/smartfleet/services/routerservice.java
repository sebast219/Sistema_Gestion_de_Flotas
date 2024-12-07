//abierto y cerrrado (ocp)
//el principio de abierto y cerrado se aplica cuando  estas utilizando 
//interfaces para extender una funcionalidad sin tener que modificar el codigo existente.


public interface  routerservice{
    void routerservice(route route);
}

public  class  routeservice implements  routerservice{
    @Override
    public  void routerservice(route route){
       //aqui se añadiria la logica de la optimizacion de la ruta
    }
}