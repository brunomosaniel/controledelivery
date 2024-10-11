package br.com.delivery.controleDelivery.pedido.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delivery.controleDelivery.pedido.domain.Pedido;

public interface PedidoSpringDataJPARepository extends JpaRepository<Pedido, UUID> {

}
