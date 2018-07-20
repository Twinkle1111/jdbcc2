package com.java.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.java.model.Player;

public interface IPlayerRepository  {
	public void save(Player pla,Connection con) throws SQLException;
	public void updateNameAndCountry(String name, String country, int id,Connection con)throws SQLException;
	public void updateCountry(String country, int id,Connection con)throws SQLException;
	public List<Player> findAll(Connection con) throws SQLException;
	public Player findById(int id,Connection con)throws SQLException;
	public void deleteById(int id,Connection con)throws SQLException;
	public void deleteAll(Connection con)throws SQLException;
}

	


