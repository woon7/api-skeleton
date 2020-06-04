package com.brique.admcapi.dto;

import java.sql.Date;

public class CardUseHistoryDto {
    private String cardCode;
    private String memberCode;
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
//    private LocalDateTime useDate;
    private Date useDate;
    private String useCost;

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public Date getUseDate() {
        return useDate;
    }

    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    public String getUseCost() {
        return useCost;
    }

    public void setUseCost(String useCost) {
        this.useCost = useCost;
    }
}
