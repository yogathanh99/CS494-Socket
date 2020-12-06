package utils;

import java.util.Random;

public class Question {
    private String keyword;
    private String description;

    public Question(String keyword, String description) {
        this.keyword = keyword;
        this.description = description;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getDescription() {
        return description;
    }
}
