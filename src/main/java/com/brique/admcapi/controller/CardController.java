package com.brique.admcapi.controller;

import com.brique.admcapi.dto.*;
import com.brique.admcapi.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    CardService cardService;

    @GetMapping("/cardMaster")
    public ResponseDto selectCardMaster() {
        return cardService.selectCardMaster();
    }

    @PostMapping("/cardMaster")
    public ResponseDto insertCardMaster(@RequestBody CardMasterDto cardMasterDto) {
        return cardService.insertCardMaster(cardMasterDto);
    }

    @GetMapping("/cardMember")
    public ResponseDto selectCardMember() {
        return cardService.selectCardMember();
    }

    @PostMapping("/cardMember")
    public ResponseDto insertCardMember(@RequestBody CardMemberDto cardMemberDto) {
        return cardService.insertCardMember(cardMemberDto);
    }

    @GetMapping("/cardUseHistory")
    public ResponseDto selectCardUseHistory() {
        return cardService.selectCardUseHistory();
    }

    @PostMapping("/cardUseHistory")
    public ResponseDto insertCardUseHistory(@RequestBody CardUseHistoryDto cardUseHistoryDto) {
        return cardService.insertCardUseHistory(cardUseHistoryDto);
    }

    @GetMapping("/member")
    public ResponseDto selectMember() {
        return cardService.selectMember();
    }

    @PostMapping("/member")
    public ResponseDto insertMember(@RequestBody MemberDto memberDto) {
        return cardService.insertMember(memberDto);
    }

    @GetMapping("/cardCardMember")
    public ResponseDto selectCardCardMember(@RequestParam String cardName) {
        return cardService.selectCardCardMember(cardName);
    }

    @GetMapping("/cardMemberCardUseHistory")
    public ResponseDto selectCardMemberCardUseHistory(@RequestParam String cardCode, @RequestParam String memberCode) {
        return cardService.selectCardMemberCardUseHistory(cardCode, memberCode);
    }

    @GetMapping("/cardFull")
    public ResponseDto selectCardFull() {
        return cardService.selectCardFull();
    }

    @PutMapping("/cardUseHistory")
    public ResponseDto updateCardUseHistory(@RequestBody CardUseHistoryDto cardUseHistoryDto) {
        return cardService.updateCardUseHistory(cardUseHistoryDto);
    }

    @DeleteMapping("/cardUseHistory")
    public ResponseDto deleteCardUseHistory(@RequestParam String cardCode, @RequestParam String memberCode, @RequestParam Date useDate) {
        return cardService.deleteCardUseHistory(cardCode, memberCode, useDate);
    }
}
