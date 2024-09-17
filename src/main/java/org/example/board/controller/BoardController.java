package org.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("board/write")
    public String write() {
        return "boardWrite";
    }

    @PostMapping("board/writepro")
    public String writepro(String title, String content){
        System.out.println("제목 : " + title);
        System.out.println("내용 : " + content);

        return " ";
    }
}
