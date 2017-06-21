package com.example.potluck;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by student on 6/21/17.
 */
public interface PotluckRepository extends CrudRepository<PersonFood, String> {
}
