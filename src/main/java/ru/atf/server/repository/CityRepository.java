package ru.atf.server.repository;

import org.springframework.data.repository.CrudRepository;
import ru.atf.server.entity.City;

public interface CityRepository extends CrudRepository<City,Integer> {
}
