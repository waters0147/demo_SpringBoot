package com.example.demo.repository;

import com.example.demo.model.activityModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface activityRepository extends CrudRepository<activityModel, Long> {

    List<activityModel> findAll();

    List<activityModel> findByOwner(String owner);

    activityModel save(activityModel activity);

}
