package com.example.repaso.mappers;

import com.example.repaso.dto.ProyectoDTO;
import com.example.repaso.entity.Cliente;
import com.example.repaso.entity.Proyecto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-07T12:13:03-0500",
    comments = "version: 1.6.0, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class ProyectoMapperImpl implements ProyectoMapper {

    @Override
    public List<ProyectoDTO> toDTOs(List<Proyecto> list) {
        if ( list == null ) {
            return null;
        }

        List<ProyectoDTO> list1 = new ArrayList<ProyectoDTO>( list.size() );
        for ( Proyecto proyecto : list ) {
            list1.add( toDTO( proyecto ) );
        }

        return list1;
    }

    @Override
    public List<Proyecto> toEntityList(List<ProyectoDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Proyecto> list1 = new ArrayList<Proyecto>( list.size() );
        for ( ProyectoDTO proyectoDTO : list ) {
            list1.add( toEntity( proyectoDTO ) );
        }

        return list1;
    }

    @Override
    public ProyectoDTO toDTO(Proyecto proyecto) {
        if ( proyecto == null ) {
            return null;
        }

        ProyectoDTO proyectoDTO = new ProyectoDTO();

        proyectoDTO.setIdcliente( proyectoClienteIdcliente( proyecto ) );
        proyectoDTO.setIdproyecto( proyecto.getIdproyecto() );
        proyectoDTO.setDescripcion( proyecto.getDescripcion() );
        proyectoDTO.setCuantia( proyecto.getCuantia() );
        proyectoDTO.setFechainicio( proyecto.getFechainicio() );
        proyectoDTO.setFechafin( proyecto.getFechafin() );

        return proyectoDTO;
    }

    @Override
    public Proyecto toEntity(ProyectoDTO proyectoDTO) {
        if ( proyectoDTO == null ) {
            return null;
        }

        Proyecto.ProyectoBuilder proyecto = Proyecto.builder();

        proyecto.idproyecto( proyectoDTO.getIdproyecto() );
        proyecto.descripcion( proyectoDTO.getDescripcion() );
        proyecto.cuantia( proyectoDTO.getCuantia() );
        proyecto.fechainicio( proyectoDTO.getFechainicio() );
        proyecto.fechafin( proyectoDTO.getFechafin() );

        return proyecto.build();
    }

    private Long proyectoClienteIdcliente(Proyecto proyecto) {
        Cliente cliente = proyecto.getCliente();
        if ( cliente == null ) {
            return null;
        }
        return cliente.getIdcliente();
    }
}
