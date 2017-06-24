package com.thomasvitale.repository;

import com.thomasvitale.model.Account;

public interface AccountRepository {

	Account findByUsername(String username);

}