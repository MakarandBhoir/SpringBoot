package org.makarands.boot.repository;

import org.springframework.stereotype.Repository;

@Repository(value="userRepo")
public class UserRepository {
	@Override
	public String toString() {
		return "user repository.";
	}
}
