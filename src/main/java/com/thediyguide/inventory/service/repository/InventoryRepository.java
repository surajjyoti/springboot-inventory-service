package com.thediyguide.inventory.service.repository;

import com.thediyguide.inventory.service.model.Inventory;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
@EnableScan
public interface InventoryRepository extends CrudRepository<Inventory, String > {
    Optional<Inventory> findBySkuCode(String skuCode);
}
