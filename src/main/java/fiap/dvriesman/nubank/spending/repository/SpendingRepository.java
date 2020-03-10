package fiap.dvriesman.nubank.spending.repository;

import fiap.dvriesman.nubank.spending.domain.Spending;
import fiap.dvriesman.nubank.spending.domain.SpendingStatistics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SpendingRepository extends CrudRepository<Spending, Long> {


    @Query("SELECT new fiap.dvriesman.nubank.spending.domain.SpendingStatistics(v.category, sum(v.value)) " +
            "FROM Spending v WHERE v.username = ?1 and v.date between ?2 and ?3 GROUP BY v.category")
    List<SpendingStatistics> findSummary(String username, Date initialDate, Date FinalDate);

}
