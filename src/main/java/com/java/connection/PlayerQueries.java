package com.java.connection;
public class PlayerQueries  {
	public static final String INSERT="INSERT INTO tbl_player(ID,NAME,COUNTRY,RANK) VALUES(?,?,?,?)";
	public static final String SELECT_BY_ID="SELECT * FROM tbl_player WHERE ID=?";
	public static final String SELECT_ALL="SELECT * FROM tbl_player";
	public static final String UPDATE_COUNTRY="UPDATE TBL_PLAYER SET COUNTRY=? WHERE ID=?";
	public static final String UPDATE_NAME_COUNTRY="UPDATE TBL_PLAYER SET NAME=?,COUNTRY=? WHERE ID=?";
	public static final String DELETE="DELETE FROM TBL_PLAYER WHERE ID=?";
	public static final String DELETE_ALL="DELETE FROM TBL_PLAYER";
}
