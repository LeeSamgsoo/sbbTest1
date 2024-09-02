package com.example.sbbTest1.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Article> articleList = this.articleService.list();
        model.addAttribute("articleList", articleList);
        return "article_list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable(value = "id") Integer id,
                         Model model) {
        Article article = this.articleService.detail(id);
        if (article == null) {
            return "redirect:/article/list";
        } else {
            model.addAttribute("article", article);
            return "article_detail";
        }
    }

    @GetMapping("/create")
    public String create() {
        return "article_create";
    }


    @PostMapping("/create")
    public String create(Model model,
                         @RequestParam(value = "title") String title,
                         @RequestParam(value = "content") String content) {
        this.articleService.create(title, content);
        return "redirect:/article/list";
    }
}
