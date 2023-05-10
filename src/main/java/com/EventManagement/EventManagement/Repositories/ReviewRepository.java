package com.EventManagement.EventManagement.Repositories;

import com.EventManagement.EventManagement.Models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews,Long> {
}
