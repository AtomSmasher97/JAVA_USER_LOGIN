package com.example.demo.appuser;

import jakarta.transaction.Transactional;
 import java.util.Optional;
@Transactional(readOnly  = true)
public interface StudentRepositary {
Optional<AppUser> findByEmail(String Email);
}
