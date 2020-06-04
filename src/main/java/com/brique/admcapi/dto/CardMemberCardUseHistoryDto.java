package com.brique.admcapi.dto;

import java.sql.Date;

public class CardMemberCardUseHistoryDto {
    Date useDate;
    String useCost;

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
