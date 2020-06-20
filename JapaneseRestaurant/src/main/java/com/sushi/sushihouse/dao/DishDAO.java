package com.sushi.sushihouse.dao;

import java.util.List;

import com.sushi.sushihouse.entity.Dish;


public interface DishDAO extends DAO<Dish>{
	public List<Dish> findDishByCategory(String category);
}
