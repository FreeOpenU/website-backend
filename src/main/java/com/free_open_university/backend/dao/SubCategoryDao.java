
package com.free_open_university.backend.dao;

// import com.free_open_university.backend.bean.Category;
import com.free_open_university.backend.bean.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;

public interface SubCategoryDao extends JpaRepository<SubCategory, Integer> {
}

