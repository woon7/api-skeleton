package com.brique.admcapi.dto;

import java.sql.Date;

public class CardFullDto {
    String cardCompName;
    String cardName;
    String memberName;
    Date useDate;
    String useCost;

    public String getCardCompName() {
        return cardCompName;
    }

    public void setCardCompName(String cardCompName) {
        this.cardCompName = cardCompName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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
