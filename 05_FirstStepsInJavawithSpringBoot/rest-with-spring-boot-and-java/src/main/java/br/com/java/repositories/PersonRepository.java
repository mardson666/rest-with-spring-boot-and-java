package br.com.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.java.model.Person;

@Repository												//objeto e tipo do objeto
public interface PersonRepository extends JpaRepository<Person, Long> {

}
