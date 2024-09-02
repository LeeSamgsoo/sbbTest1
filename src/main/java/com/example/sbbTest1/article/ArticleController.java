package com.example.sbbTest1.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;
}
