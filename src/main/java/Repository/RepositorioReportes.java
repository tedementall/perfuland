package Repository;

import Models.Reportes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RepositorioReportes extends JpaRepository<Reportes, Integer> {
    List<Reportes> findByTipoReporte(String tipoReporte);
    List<Reportes> findByFechaGeneracionBetween(String fechaInicio, String fechaFin);
}
