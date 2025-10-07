package com.example.repaso.mappers;

import com.example.repaso.dto.ParticipaDTO;
import com.example.repaso.entity.Participa;
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
public class ParticipaMapperImpl implements ParticipaMapper {

    @Override
    public ParticipaDTO toDTO(Participa entity) {
        if ( entity == null ) {
            return null;
        }

        ParticipaDTO participaDTO = new ParticipaDTO();

        participaDTO.setIdparticipa( entity.getIdparticipa() );

        return participaDTO;
    }

    @Override
    public Participa toEntity(ParticipaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Participa.ParticipaBuilder participa = Participa.builder();

        participa.idparticipa( dto.getIdparticipa() );

        return participa.build();
    }

    @Override
    public List<ParticipaDTO> toDTOs(List<Participa> list) {
        if ( list == null ) {
            return null;
        }

        List<ParticipaDTO> list1 = new ArrayList<ParticipaDTO>( list.size() );
        for ( Participa participa : list ) {
            list1.add( toDTO( participa ) );
        }

        return list1;
    }

    @Override
    public List<Participa> toEntityList(List<ParticipaDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Participa> list1 = new ArrayList<Participa>( list.size() );
        for ( ParticipaDTO participaDTO : list ) {
            list1.add( toEntity( participaDTO ) );
        }

        return list1;
    }
}
