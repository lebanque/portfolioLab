package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Donation;

import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {

    @Query(value = "select quantity from donations;", nativeQuery = true)
    List<Long> findQuantity();
    @Query(value = "SELECT COUNT(*) FROM donations;", nativeQuery = true)
    Long findAllDonationAmount();

}
