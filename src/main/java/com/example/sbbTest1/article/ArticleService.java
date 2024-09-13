package com.example.sbbTest1.article;

import com.example.sbbTest1.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> list() {
        return this.articleRepository.findAll();
    }

    public Article detail(Integer id) {
        Optional<Article> optionalArticle = this.articleRepository.findById(id);
        return optionalArticle.orElse(null);
    }

    public void create(String title, String content, SiteUser user) {
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setCreateDate(LocalDateTime.now());
        article.setWriter(user);
        this.articleRepository.save(article);
    }

    public void modify(String title, String content, Article article) {
        article.setTitle(title);
        article.setContent(content);
        article.setModifyDate(LocalDateTime.now());
        this.articleRepository.save(article);
    }
}
