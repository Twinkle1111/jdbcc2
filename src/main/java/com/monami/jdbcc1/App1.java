package com.monami.jdbcc1;

import com.java.model.Player;
import com.java.repository.EmployeeRepositoryImpl;
import com.java.service.IPlayerService;
import com.java.service.PlayerServiceImpl;

public class App1 {
	public static void main(String args[]) {
		EmployeeRepositoryImpl repository = new EmployeeRepositoryImpl();
		IPlayerService ipl = new PlayerServiceImpl(repository);
		Player pl3 = new Player();
		pl3.id = 1;
		pl3.name = "Pallavi";
		pl3.country = "India";
		pl3.rank = 1;
		ipl.save(pl3);
		Player pl1 = new Player();
		pl1.id = 2;
		pl1.name = "Stiti";
		pl1.country = "Pakistan";
		pl1.rank = 2;
		ipl.save(pl1);
		Player pl2 = new Player();
		pl2.id = 3;
		pl2.name = "Bikash";
		pl2.country = "Afganisthan";
		pl2.rank = 3;
		ipl.save(pl2);
		//SELECT ALL or FIND ALL
    	System.out.println(ipl.findAll());
    	
    	//SELECT ONE
    	System.out.println(ipl.findById(3));
    	ipl.updateCountry("Pakistan",3);
    	ipl.updateNameAndCountry("payal", "Afganisthan", 2);
    	ipl.deleteById(3);
    	ipl.deleteAll();
	}

}
