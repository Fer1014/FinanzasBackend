package edu.pe.upc.finanzas.finanzasbackend.serviceimplements;

import edu.pe.upc.finanzas.finanzasbackend.dtos.BonoDTO;
import edu.pe.upc.finanzas.finanzasbackend.entities.Bono;
import edu.pe.upc.finanzas.finanzasbackend.repositories.*;
import edu.pe.upc.finanzas.finanzasbackend.serviceinterfaces.IBonoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BonoServiceImpl implements IBonoService {

    private final BonoRepository bonoRepository;
    private final UsuarioRepository usuarioRepository;
    private final MonedaRepository monedaRepository;
    private final DiasAnioRepository diasAnioRepository;
    private final TipoCapitalizacionRepository tipoCapitalizacionRepository;
    private final AplicanteRepository aplicanteRepository;
    private final FrecuenciaCuponRepository frecuenciaCuponRepository;
    private final TasaInteresRepository tasaInteresRepository;
    private final TipoPeriodoGraciaRepository tipoPeriodoGraciaRepository;

    public BonoServiceImpl(
            BonoRepository bonoRepository,
            UsuarioRepository usuarioRepository,
            MonedaRepository monedaRepository,
            DiasAnioRepository diasAnioRepository,
            TipoCapitalizacionRepository tipoCapitalizacionRepository,
            AplicanteRepository aplicanteRepository,
            FrecuenciaCuponRepository frecuenciaCuponRepository,
            TasaInteresRepository tasaInteresRepository,
            TipoPeriodoGraciaRepository tipoPeriodoGraciaRepository) {
        this.bonoRepository = bonoRepository;
        this.usuarioRepository = usuarioRepository;
        this.monedaRepository = monedaRepository;
        this.diasAnioRepository = diasAnioRepository;
        this.tipoCapitalizacionRepository = tipoCapitalizacionRepository;
        this.aplicanteRepository = aplicanteRepository;
        this.frecuenciaCuponRepository = frecuenciaCuponRepository;
        this.tasaInteresRepository = tasaInteresRepository;
        this.tipoPeriodoGraciaRepository = tipoPeriodoGraciaRepository;
    }

    @Override
    public Bono create(BonoDTO bonoDTO) {
        Bono bono = new Bono();
        return getBono(bonoDTO, bono);
    }

    private Bono getBono(BonoDTO bonoDTO, Bono bono) {
        bono.setValorNominal(bonoDTO.getValorNominal());
        bono.setValorComercial(bonoDTO.getValorComercial());
        bono.setNumAnios(bonoDTO.getNumAnios());
        bono.setTasaInteresPorc(bonoDTO.getTasaInteresPorc());
        bono.setTasaAnualDesc(bonoDTO.getTasaAnualDesc());
        bono.setImpRenta(bonoDTO.getImpRenta());
        bono.setFechaEmision(bonoDTO.getFechaEmision());
        bono.setPorcPrima(bonoDTO.getPorcPrima());
        bono.setPorcEstructuracion(bonoDTO.getPorcEstructuracion());
        bono.setPorcColocacion(bonoDTO.getPorcColocacion());
        bono.setPorcFlotacion(bonoDTO.getPorcFlotacion());
        bono.setPorcCavali(bonoDTO.getPorcCavali());
        bono.setInflacionAnual(bonoDTO.getInflacionAnual());
        bono.setUsuario(usuarioRepository.findById(bonoDTO.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + bonoDTO.getUsuarioId())));

        bono.setMoneda(monedaRepository.findById(bonoDTO.getMonedaId())
                .orElseThrow(() -> new RuntimeException("Moneda no encontrada con ID: " + bonoDTO.getMonedaId())));

        bono.setDiasAnio(diasAnioRepository.findById(bonoDTO.getDiasAnioId())
                .orElseThrow(() -> new RuntimeException("Días del año no encontrado con ID: " + bonoDTO.getDiasAnioId())));

        bono.setTipoCapitalizacion(tipoCapitalizacionRepository.findById(bonoDTO.getTipoCapitalizacionId())
                .orElseThrow(() -> new RuntimeException("Tipo de capitalización no encontrado con ID: " + bonoDTO.getTipoCapitalizacionId())));

        bono.setAplicante(aplicanteRepository.findById(bonoDTO.getAplicanteId())
                .orElseThrow(() -> new RuntimeException("Aplicante no encontrado con ID: " + bonoDTO.getAplicanteId())));

        bono.setFrecuenciaCupon(frecuenciaCuponRepository.findById(bonoDTO.getFrecuenciaCuponId())
                .orElseThrow(() -> new RuntimeException("Frecuencia de cupón no encontrada con ID: " + bonoDTO.getFrecuenciaCuponId())));

        bono.setTasaInteres(tasaInteresRepository.findById(bonoDTO.getTasaInteresId())
                .orElseThrow(() -> new RuntimeException("Tasa de interés no encontrada con ID: " + bonoDTO.getTasaInteresId())));

        if (bonoDTO.getTipoPeriodoGraciaId() != null) {
            bono.setTipoPeriodoGracia(tipoPeriodoGraciaRepository.findById(bonoDTO.getTipoPeriodoGraciaId())
                    .orElseThrow(() -> new RuntimeException("Tipo de periodo de gracia no encontrado con ID: " + bonoDTO.getTipoPeriodoGraciaId())));
        } else {
            bono.setTipoPeriodoGracia(null);
        }

        return bonoRepository.save(bono);
    }

    @Override
    public Bono update(Long bonoId, BonoDTO bonoDTO) {
        Optional<Bono> optionalBono = bonoRepository.findById(bonoId);
        if (optionalBono.isPresent()) {
            Bono bono = optionalBono.get();
            return getBono(bonoDTO, bono);
        }
        return null;
    }

    @Override
    public void delete(Long bonoId) {
        bonoRepository.deleteById(bonoId);
    }

    @Override
    public Optional<Bono> findById(Long bonoId) {
        return bonoRepository.findById(bonoId);
    }

    @Override
    public List<Bono> list() {
        return bonoRepository.findAll();
    }

    @Override
    public List<Bono> findAllByUsuarioId(Long usuarioId) {
        return bonoRepository.findAllByUsuario_UsuarioId(usuarioId);
    }
}
