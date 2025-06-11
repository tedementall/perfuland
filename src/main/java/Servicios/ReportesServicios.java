package Servicios;

import Models.Reportes;
import Repository.RepositorioReportes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportesServicios {
    @Autowired
    private RepositorioReportes repositorioReportes;

    public Reportes guardarReporte(Reportes reporte) {
        return repositorioReportes.save(reporte);
    }

    public List<Reportes> obtenerTodos() {
        return repositorioReportes.findAll();
    }

    public Optional<Reportes> obtenerPorId(Integer id) {
        return repositorioReportes.findById(id);
    }
 
    public void eliminarPorId(Integer id) {
        repositorioReportes.deleteById(id);
    }

    public List<Reportes> obtenerPorTipo(String tipoReporte) {
        return repositorioReportes.findByTipoReporte(tipoReporte);
    }

    public List<Reportes> obtenerPorFecha(String fechaInicio, String fechaFin) {
        return repositorioReportes.findByFechaGeneracionBetween(fechaInicio, fechaFin);
    }
}
