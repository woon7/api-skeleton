package com.brique.admcapi.dto;

import java.sql.Date;

public class UpdateCardUseHistoryDto {
    private String cardCode;
    private String memberCode;
    private Date useDate;
    private String useCost;
    private String memberName;
    private String cardName;

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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
