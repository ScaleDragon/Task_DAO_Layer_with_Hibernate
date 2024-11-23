package ru.netology.repositoryEntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.netology.personEntity.Person;

import java.util.List;
import java.util.Optional;


public interface Repository extends JpaRepository<Person, Long> {

    // Поиск по городу
    @Query("SELECT p FROM Person p WHERE p.city = :city")
    List<Person> findByCity(@Param("city") String city);

    // Поиск по возрасту меньше заданного и сортировка по возрасту
    @Query("SELECT p FROM Person p WHERE p.age < :age ORDER BY p.age ASC")
    List<Person> findByAgeLessThanOrdered(@Param("age") int age);

    // Поиск по имени и фамилии
    @Query("SELECT p FROM Person p WHERE p.name = :name AND p.surname = :surname")
    Optional<Person> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}
