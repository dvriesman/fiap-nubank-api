package fiap.dvriesman.nubank.spending.service;

import fiap.dvriesman.nubank.spending.domain.SpendingStatistics;
import fiap.dvriesman.nubank.spending.repository.SpendingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SpendingServiceImpl implements SpendingService {

    @Autowired
    private SpendingRepository spendingRepository;

    public List<SpendingStatistics> getSpendingByCategory(String username, Date initialDate, Date finalDate) {
        return spendingRepository.findSummary(username, initialDate, finalDate);
    }


}
