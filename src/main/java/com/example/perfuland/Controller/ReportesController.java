package com.example.perfuland.Controller;

import Models.Reportes;
import Servicios.ReportesServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reportes")
public class ReportesController {
    @Autowired
    private ReportesServicios reportesServicios;

    @PostMapping
    public ResponseEntity<Reportes> crearReporte(@RequestBody Reportes reporte) {
        return ResponseEntity.ok(reportesServicios.guardarReporte(reporte));
    }

    @GetMapping
    public ResponseEntity<List<Reportes>> obtenerTodos() {
        return ResponseEntity.ok(reportesServicios.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reportes> obtenerPorId(@PathVariable Integer id) {
        Optional<Reportes> reporte = reportesServicios.obtenerPorId(id);
        return reporte.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPorId(@PathVariable Integer id) {
        reportesServicios.eliminarPorId(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<Reportes>> obtenerPorTipo(@PathVariable String tipo) {
        return ResponseEntity.ok(reportesServicios.obtenerPorTipo(tipo));
    }

    @GetMapping("/fechas")
    public ResponseEntity<List<Reportes>> obtenerPorFecha(@RequestParam String inicio, @RequestParam String fin) {
        return ResponseEntity.ok(reportesServicios.obtenerPorFecha(inicio, fin));
    }
}
