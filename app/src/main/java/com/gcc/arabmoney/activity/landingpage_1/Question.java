package com.gcc.arabmoney.activity.landingpage_1;

import java.util.Arrays;
import java.util.List;

public class Question {
    private String question;
    private List<Answer> answerList;

    public Question(String question, Answer... answers){
        this.question = question;
        this.answerList = Arrays.asList(answers);
    }

    public String getQuestion() {
        return question;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }
}
