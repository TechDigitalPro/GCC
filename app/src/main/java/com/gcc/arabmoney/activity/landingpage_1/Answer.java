package com.gcc.arabmoney.activity.landingpage_1;

public class Answer {
    private String answer;
    private boolean isBold;

    public Answer(String answer) {
        this.answer = answer;
        this.isBold = false;
    }
    public Answer(String answer, boolean isBold) {
        this.answer = answer;
        this.isBold = isBold;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isBold() {
        return isBold;
    }
}
