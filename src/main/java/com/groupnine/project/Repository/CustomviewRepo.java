package com.groupnine.project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupnine.project.Data.Customview;

@Repository
public interface CustomviewRepo extends JpaRepository<Customview, Integer>{

}