package fiap.dvriesman.nubank.spending.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ListSpendingRequest {

    private String username;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date initialDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date finalDate;

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
