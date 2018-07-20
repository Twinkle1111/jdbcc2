package com.java.repository;

import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.connection.PlayerQueries;
import com.java.model.Player;

	public class EmployeeRepositoryImpl implements IPlayerRepository {

		public void save(Player pla, Connection con) throws SQLException {
			// TODO Auto-generated method stub
			
			PreparedStatement ps=con.prepareStatement(PlayerQueries.INSERT);
			ps.setInt(1, pla.id);
			ps.setString(2, pla.name);
			ps.setString(3, pla.country);
			ps.setInt(4, pla.rank);
			
			ps.executeUpdate();
			
		}

		
		
			
					public void updateCountry(String country, int id, Connection con) throws SQLException {
				 		// TODO Auto-generated method stub
				 
						PreparedStatement ps=con.prepareStatement(PlayerQueries.UPDATE_COUNTRY);
						
						ps.setString(1, country);
						ps.setInt(2, id);
						
					ps.executeUpdate();
				 	}
					public void updateNameAndCountry(String name, String country, int id, Connection con) throws SQLException {
						
						PreparedStatement ps=con.prepareStatement(PlayerQueries.UPDATE_NAME_COUNTRY);
						ps.setString(1,name);
						ps.setString(2,country);
						ps.setInt(3,id);
						ps.executeUpdate();
						}
		

	
			
					public List<Player> findAll(Connection con) throws SQLException {
				 		// TODO Auto-generated method stub
						List<Player> employees=new ArrayList<Player>();
						PreparedStatement ps=con.prepareStatement(PlayerQueries.SELECT_ALL);
						
						ResultSet rs=ps.executeQuery();
						while(rs.next())
						{
							Player e=new Player();
							e.id=rs.getInt("ID");// ID is column_name in the table tbl_employee
							e.name=rs.getString("NAME");
							e.country=rs.getString("COUNTRY");
							e.rank=rs.getInt("RANK");
							
							employees.add(e);
						}
						return employees;
		}

					public Player findById(int id, Connection con) throws SQLException {
				 		// TODO Auto-generated method stub
						Player e=new Player();
						PreparedStatement ps=con.prepareStatement(PlayerQueries.SELECT_BY_ID);
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						if(rs.next())
						{
							e.id=rs.getInt("ID");// ID is column_name in the table tbl_employee
							e.name=rs.getString("NAME");
							e.country=rs.getString("COUNTRY");
							e.rank=rs.getInt("RANK");
						}
						
				return e;
						
		}

		public void deleteById(int id,Connection con)throws SQLException {
			PreparedStatement ps=con.prepareStatement(PlayerQueries.DELETE);
			ps.setInt(1,id);
			ps.executeUpdate();
		}

		public void deleteAll(Connection con)throws SQLException {
			PreparedStatement ps=con.prepareStatement(PlayerQueries.DELETE_ALL);
			ps.executeUpdate();

		}

		
	}	


