package fiap.dvriesman.nubank.spending.dto;

import fiap.dvriesman.nubank.spending.domain.SpendingStatistics;

import java.util.List;

public class ListSpendingResponse {

    public ListSpendingResponse() {

    }

    public ListSpendingResponse(List<SpendingStatistics> list) {
        this.list = list;
    }

    private List<SpendingStatistics> list;

    public List<SpendingStatistics> getAmountByCategoryList() {
        return list;
    }

}
