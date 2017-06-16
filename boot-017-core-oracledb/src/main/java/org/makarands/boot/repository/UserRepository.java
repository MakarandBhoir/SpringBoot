package org.makarands.boot.repository;

import org.makarands.boot.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{
/*	public User create(User user);
	public List<User> read();
	public User update(User user);
	public void delete(User user);*/
}
