package com.example.services.repository;



import com.example.services.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceRepository extends JpaRepository<Service, Long>, JpaSpecificationExecutor<Service> {


}
