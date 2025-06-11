package Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
//reportes

@Entity 
@Table(name= "reportes")
@Data
public class Reportes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_reporte;
private String tipo_reporte;
private String fecha_generacion;
private String descripcion;
private String json_Datos;

}
