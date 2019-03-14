package home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import home.beans.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> { }