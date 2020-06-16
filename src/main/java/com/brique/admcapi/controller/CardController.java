package com.brique.admcapi.controller;

import com.brique.admcapi.dto.*;
import com.brique.admcapi.service.CardService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/card")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/cardMaster")
    public ResponseDto selectCardMaster() {
        return cardService.selectCardMaster();
    }

    @GetMapping("/cardMember")
    public ResponseDto selectCardMember() {
        return cardService.selectCardMember();
    }

    @GetMapping("/cardUseHistory")
    public ResponseDto selectCardUseHistory() {
        return cardService.selectCardUseHistory();
    }

    @GetMapping("/member")
    public ResponseDto selectMember() {
        return cardService.selectMember();
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

    @GetMapping("/cardFull2")
    public ResponseDto selectCardFull2() {
        return cardService.selectCardFull2();
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 받은 토큰 값",
                    required = true, dataType = "string", paramType = "header")
    })
    @PostMapping("/cardMaster")
    public ResponseDto insertCardMaster(@RequestBody CardMasterDto cardMasterDto) {
        return cardService.insertCardMaster(cardMasterDto);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 받은 토큰 값",
                    required = true, dataType = "string", paramType = "header")
    })
    @PostMapping("/cardMember")
    public ResponseDto insertCardMember(@RequestBody CardMemberDto cardMemberDto) {
        return cardService.insertCardMember(cardMemberDto);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 받은 토큰 값",
                    required = true, dataType = "string", paramType = "header")
    })
    @PostMapping("/cardUseHistory")
    public ResponseDto insertCardUseHistory(@RequestBody CardUseHistoryDto cardUseHistoryDto) {
        return cardService.insertCardUseHistory(cardUseHistoryDto);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 받은 토큰 값",
                    required = true, dataType = "string", paramType = "header")
    })
    @PostMapping("/member")
    public ResponseDto insertMember(@RequestBody MemberDto memberDto) {
        return cardService.insertMember(memberDto);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 받은 토큰 값",
                    required = true, dataType = "string", paramType = "header")
    })
    @PutMapping("/cardUseHistory")
    public ResponseDto updateCardUseHistory(@RequestBody UpdateCardUseHistoryDto cardUseHistoryDto) {
        return cardService.updateCardUseHistory(cardUseHistoryDto);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 받은 토큰 값",
                    required = true, dataType = "string", paramType = "header")
    })
    @DeleteMapping("/cardUseHistory")
    public ResponseDto deleteCardUseHistory(@RequestParam String cardCode, @RequestParam String memberCode, @RequestParam Date useDate) {
        return cardService.deleteCardUseHistory(cardCode, memberCode, useDate);
    }
}
