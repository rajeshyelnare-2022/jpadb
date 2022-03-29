package com.finance.account;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AccountRepository<Account> extends JpaRepository<Account,Long>{
	//List<Account> findByName(String name);
	//Account findById(long id);

}
