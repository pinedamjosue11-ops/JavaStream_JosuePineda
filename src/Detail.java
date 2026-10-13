public record Detail (

    Product producto,
    int cantidad,
    double preciountario
){

    public double subtotal(){
        return cantidad*preciountario;
    }
}