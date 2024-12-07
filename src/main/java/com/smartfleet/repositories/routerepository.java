//segregacion de interfaces (isp)
// en esta no forzamos a una clase a que implemente un metodo
//el cual no va a necesitar entonces creamos interfaces espeecificas para que 
//las funcionalidades que necesite 


public interface  vehiculerepository{
    vehicle findbyid(long id);
    void save(vehicle vehicle);
}

public interface  routerepository{
    route findbyid(long id);
    void save(route route);
}
