package com.brique.admcapi.service;

import com.brique.admcapi.dto.*;
import com.brique.admcapi.dao.CardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class CardService {
    @Autowired
    CardDao cardDao;

    public ResponseDto insertCardMaster(CardMasterDto cardMasterDto) {
        return new ResponseDto().setData(cardDao.insertCardMaster(cardMasterDto));
    }

    public ResponseDto selectCardMaster() {
        return new ResponseDto().setData(cardDao.selectCardMaster());
    }

    public ResponseDto insertCardMember(CardMemberDto cardMemberDto) {
        return new ResponseDto().setData(cardDao.insertCardMember(cardMemberDto));
    }

    public ResponseDto selectCardMember() {
        return new ResponseDto().setData(cardDao.selectCardMember());
    }

    public ResponseDto selectCardUseHistory() {
        return new ResponseDto().setData(cardDao.selectCardUseHistory());
    }

    public ResponseDto insertCardUseHistory(CardUseHistoryDto cardUseHistoryDto) {
        return new ResponseDto().setData(cardDao.insertCardUseHistory(cardUseHistoryDto));
    }

    public ResponseDto selectMember() {
        return new ResponseDto().setData(cardDao.selectMember());
    }

    public ResponseDto insertMember(MemberDto memberDto) {
        return new ResponseDto().setData(cardDao.insertMember(memberDto));
    }

    public ResponseDto selectCardCardMember(String cardName) {
        Map<String, Object> map = new HashMap<>();
        map.put("cardName", cardName);
        return new ResponseDto().setData(cardDao.selectCardCardMember(map));
    }

    public ResponseDto selectCardMemberCardUseHistory(String cardCode, String memberCode) {
        Map<String, Object> map = new HashMap<>();
        map.put("cardCode", cardCode);
        map.put("memberCode", memberCode);
        return new ResponseDto().setData(cardDao.selectCardMemberCardUseHistory(map));
    }

    public ResponseDto selectCardFull() {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setData(cardDao.selectCardFull());
        return responseDto;
    }
}
