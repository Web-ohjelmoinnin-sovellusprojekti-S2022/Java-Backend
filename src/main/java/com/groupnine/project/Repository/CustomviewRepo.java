package com.groupnine.project.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.Customview;

@Repository
public interface CustomviewRepo extends JpaRepository<Customview, String>{

    Customview findById(Integer Id);

    List<Customview> findByOwner(String owner);

    List<Customview> deleteById(Integer Id);

    List<Customview> deleteByOwner(String owner);

}