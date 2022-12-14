package com.groupnine.project.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.Customview;

@Repository
public interface CustomviewRepo extends JpaRepository<Customview, String>{

    // Etsii ID:n perusteella näkymät
    Customview findById(Integer Id);

    // Etsii omistajan perusteella näkymät
    List<Customview> findByOwner(String owner);

    // Poistaa näkymän ID:n perusteella
    List<Customview> deleteById(Integer Id);

    // Poistaa näkymät omistajan perusteella
    List<Customview> deleteByOwner(String owner);

}