// responsabilidad unica (SRP)
// cada clase debe tener una responsabilidad unica donde por ejemplo
//vehicleservice solo se encarga de la logica de negocio de los vehiculos

public class  vehicleservice{
    private vehiculerepository vehiculerepository;

    public vehicleservice(vehiculerepository vehiculerepository){
        this.vehiculerepository = vehiculerepository;
    }

    publc vehicle getvehiclebydid(long id){
        return vehiculerepository.findbyid(id);
    }

    public void addvehicle(vehicle vehicle){
        vehiculerepository.save(vehicle);
    }
}