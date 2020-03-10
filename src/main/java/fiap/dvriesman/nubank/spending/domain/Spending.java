package fiap.dvriesman.nubank.spending.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Spending {

    public Spending() {

    }

    public Spending(String username, Date date, BigDecimal value, String category) {
        this.username = username;
        this.date = date;
        this.value = value;
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private BigDecimal value;

    private String category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
