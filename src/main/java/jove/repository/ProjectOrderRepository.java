package jove.repository;

import jove.entity.ProjectOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectOrderRepository extends JpaRepository<ProjectOrder, Integer> {

}