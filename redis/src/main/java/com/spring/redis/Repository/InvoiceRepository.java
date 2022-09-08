package com.spring.redis.Repository;

import com.spring.redis.InvoiceDO.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
