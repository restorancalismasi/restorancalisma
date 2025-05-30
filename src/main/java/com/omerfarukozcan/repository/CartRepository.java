package com.omerfarukozcan.repository;

import com.omerfarukozcan.entity.CartModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<CartModel, Long> {

    CartModel getFirstByUrunIdAndSessionIdOrderByUpdatedAtDesc(Long urunId, String sessionId);

    List<CartModel> findAllBySessionIdOrderByUpdatedAtDesc(String sessionId);

}
