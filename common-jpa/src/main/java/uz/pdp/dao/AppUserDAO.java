package uz.pdp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.entity.AppUser;

public interface AppUserDAO extends JpaRepository<AppUser, Long> {
    AppUser findAppUserByTelegramUserId(Long id);
}
