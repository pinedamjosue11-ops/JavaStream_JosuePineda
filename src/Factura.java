import java.time.LocalDate;
import java.util.List;

public record Factura(

    int id,
    String cliente,
    LocalDate fecha,
    List<Detail> detalles
)
{

    public double total(){
        double total;
        return detalles.stream().mapToDouble(Detail::subtotal).sum();
    }
}