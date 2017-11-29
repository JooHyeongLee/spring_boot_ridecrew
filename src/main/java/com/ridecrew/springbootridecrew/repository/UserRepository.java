package com.ridecrew.springbootridecrew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ridecrew.springbootridecrew.domain.User;

/*@Repository	// create, update, delete�� Spring Data JPA interface�޼ҵ常 ȣ���ϸ� ���ο��� �ڵ����� ó��
public interface UserRepository extends JpaRepository<User, Long>{ //JpaRepository<EntityClass, PK Type>
	
}*/

@Repository
public interface UserRepository extends CrudRepository<User, Long>{ //JpaRepository<EntityClass, PK Type>
	
}