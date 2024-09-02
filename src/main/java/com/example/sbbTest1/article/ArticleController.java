package com.example.sbbTest1.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
