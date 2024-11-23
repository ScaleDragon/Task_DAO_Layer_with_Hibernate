package ru.netology;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        var resultCity = entityManager.createQuery(
                        "SELECT p FROM Person p WHERE p.city = :city")
                .setParameter("city", city);
        return resultCity.getResultList();
    }


}
