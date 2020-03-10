package fiap.dvriesman.nubank.spending.service;

import fiap.dvriesman.nubank.spending.domain.SpendingStatistics;

import java.util.Date;
import java.util.List;

public interface SpendingService {

    List<SpendingStatistics> getSpendingByCategory(String username, Date initialDate, Date finalDate);

}
