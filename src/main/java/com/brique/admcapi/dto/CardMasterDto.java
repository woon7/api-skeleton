package com.brique.admcapi.dto;

public class CardMasterDto {
    private String cardCode;
    private String cardName;
    private String cardCompCode;
    private String cardCompName;

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardCompCode() {
        return cardCompCode;
    }

    public void setCardCompCode(String cardCompCode) {
        this.cardCompCode = cardCompCode;
    }

    public String getCardCompName() {
        return cardCompName;
    }

    public void setCardCompName(String cardCompName) {
        this.cardCompName = cardCompName;
    }
}
