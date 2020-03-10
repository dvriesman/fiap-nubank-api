package fiap.dvriesman.nubank.spending.controller;

import fiap.dvriesman.nubank.spending.Util;
import fiap.dvriesman.nubank.spending.dto.ListSpendingRequest;
import fiap.dvriesman.nubank.spending.dto.ListSpendingResponse;
import fiap.dvriesman.nubank.spending.domain.SpendingStatistics;
import fiap.dvriesman.nubank.spending.service.SpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class SpendingController {

    @Autowired
    private SpendingService spendingService;

    @RequestMapping(value = "/listSpending", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    ListSpendingResponse listSpending(@RequestBody ListSpendingRequest request) throws Exception {

        Date initialDate = request.getInitialDate();
        Date finalDate = request.getFinalDate();

        if (initialDate == null) {
            initialDate = Util.getDateFromString("01/01/1900 10:00");
        }

        if (finalDate == null) {
            finalDate = new Date();
        }

        List<SpendingStatistics> list = spendingService.getSpendingByCategory(request.getUsername(), initialDate, finalDate);
        return new ListSpendingResponse(list);

    }
}
