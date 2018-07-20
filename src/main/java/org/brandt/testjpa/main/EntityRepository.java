package org.brandt.testjpa.main;



import org.springframework.data.repository.CrudRepository;

public interface EntityRepository extends CrudRepository<EntityEntry,String> {

}
