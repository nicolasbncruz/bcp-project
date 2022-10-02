package com.bcp.project.repository;

import com.bcp.project.entity.Item;
import com.bcp.project.service.ItemServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Integer> {

   @Query("SELECT new com.bcp.project.service.ItemServiceImpl(i.title , r.reviewName, r.rating) FROM Item i JOIN i.reviews r")
    public List<ItemServiceImpl> getJoinInformation();

   @Query("SELECT new com.bcp.project.entity.Item(i.id, i.title) FROM Item i JOIN i.reviews r where r.rating < :rating")
    public List<Item> findItemsWithAverageRatingLowerThan(@Param("rating") Double rating);

}
