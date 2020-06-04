package com.brique.admcapi.dao;

import com.brique.admcapi.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CardDao {
    public int insertCardMaster(CardMasterDto cardMasterDto);

    public List<CardMasterDto> selectCardMaster();

    public int insertCardMember(CardMemberDto cardMemberDto);

    public List<CardMemberDto> selectCardMember();

    public List<CardUseHistoryDto> selectCardUseHistory();

    public int insertCardUseHistory(CardUseHistoryDto cardUseHistoryDto);

    public List<MemberDto> selectMember();

    public int insertMember(MemberDto memberDto);

    public List<CardCardMemberDto> selectCardCardMember(Map<String, Object> map);

    public List<CardMemberCardUseHistoryDto> selectCardMemberCardUseHistory(Map<String, Object> map);

    public List<CardFullDto> selectCardFull();
}
