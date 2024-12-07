// inverion de dependencias dip
//la clase de alto nivel no puede depnder de una clase de bajo nivel 
//sino de al revez

public  class  vehiclecontroller{
    private  final vehicleservice vehicleservice;

    public vehiclecontroller(vehicleservice vehicleservice){
        this.vehicleservice = vehicleservice;
    }

    public  void  addvehicle(vehicle vehicle){
    vehicleservice.addvehicle(vehicle);
    }

}

//vehicle controller es la clase de alto nivel