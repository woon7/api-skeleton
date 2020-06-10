package com.brique.admcapi.dto;

import java.sql.Date;

public class CardFull2Dto {
    String cardCompName;
    String cardName;
    String memberName;
    Date useDate;
    String useCost;
    String cardCode;
    String memberCode;
    String cardCompCode;

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

    public String getCardCompCode() {
        return cardCompCode;
    }

    public void setCardCompCode(String cardCompCode) {
        this.cardCompCode = cardCompCode;
    }
}
