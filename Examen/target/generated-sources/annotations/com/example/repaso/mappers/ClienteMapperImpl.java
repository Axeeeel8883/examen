package com.example.repaso.mappers;

import com.example.repaso.dto.ClienteDTO;
import com.example.repaso.entity.Cliente;
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
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDTO toDTO(Cliente entity) {
        if ( entity == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setIdcliente( entity.getIdcliente() );
        clienteDTO.setTelefono( entity.getTelefono() );
        clienteDTO.setDomicilio( entity.getDomicilio() );
        clienteDTO.setRazonsocial( entity.getRazonsocial() );

        return clienteDTO;
    }

    @Override
    public Cliente toEntity(ClienteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cliente.ClienteBuilder cliente = Cliente.builder();

        cliente.idcliente( dto.getIdcliente() );
        cliente.telefono( dto.getTelefono() );
        cliente.domicilio( dto.getDomicilio() );
        cliente.razonsocial( dto.getRazonsocial() );

        return cliente.build();
    }

    @Override
    public List<ClienteDTO> toDTOs(List<Cliente> list) {
        if ( list == null ) {
            return null;
        }

        List<ClienteDTO> list1 = new ArrayList<ClienteDTO>( list.size() );
        for ( Cliente cliente : list ) {
            list1.add( toDTO( cliente ) );
        }

        return list1;
    }

    @Override
    public List<Cliente> toEntityList(List<ClienteDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Cliente> list1 = new ArrayList<Cliente>( list.size() );
        for ( ClienteDTO clienteDTO : list ) {
            list1.add( toEntity( clienteDTO ) );
        }

        return list1;
    }
}
