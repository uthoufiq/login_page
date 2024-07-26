package com.sr.login.login_page.repository;

import com.sr.login.login_page.model.loginEntityClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<loginEntityClass, Long> {
}