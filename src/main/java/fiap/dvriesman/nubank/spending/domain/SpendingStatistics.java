package fiap.dvriesman.nubank.spending.domain;

import java.math.BigDecimal;

public class SpendingStatistics {

    private final String category;
    private BigDecimal value;

    public SpendingStatistics(String category, BigDecimal value) {
        this.category = category;
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
