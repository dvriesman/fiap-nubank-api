package fiap.dvriesman.nubank.spending;

import fiap.dvriesman.nubank.spending.domain.Spending;
import fiap.dvriesman.nubank.spending.repository.SpendingRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class Application {

	DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");

	@Autowired
	private SpendingRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			repository.save(new Spending("denny", Util.getDateFromString("02/03/2020 10:00"), new BigDecimal(513.10), "alimentacao" ));
			repository.save(new Spending("denny", Util.getDateFromString("01/01/2020 10:00"), new BigDecimal(321.00), "combustivel" ));
			repository.save(new Spending("denny", Util.getDateFromString("01/12/2010 10:00"), new BigDecimal(1030.00), "combustivel" ));
			repository.save(new Spending("denny", Util.getDateFromString("15/01/2011 10:00"), new BigDecimal(200.00), "lazer" ));
			repository.save(new Spending("denny", Util.getDateFromString("14/12/2011 10:00"), new BigDecimal(4230.00), "saude" ));
			repository.save(new Spending("denny", Util.getDateFromString("13/12/2012 10:00"), new BigDecimal(20.00), "lazer" ));
			repository.save(new Spending("joao", Util.getDateFromString("15/07/2001 10:00"), new BigDecimal(650.00), "alimentacao" ));
		};
	}


}
