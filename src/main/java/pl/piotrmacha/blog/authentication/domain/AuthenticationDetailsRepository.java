package pl.piotrmacha.blog.authentication.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AuthenticationDetailsRepository extends CrudRepository<AuthenticationDetails, UUID> {
    Optional<AuthenticationDetails> findByEmail(String email);
}
