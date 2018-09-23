package com.example.awesomefat.myapplication;

import java.util.Random;

class Test
{
    private static final Test ourInstance = new Test();

    private int theAnswer;
    private int answerScreenCreateCount = 0;

    static Test getInstance()
    {
        return ourInstance;
    }

    public int getAnswerScreenCreateCount()
    {
        return answerScreenCreateCount;
    }

    public void answerScreenCreateCountPlusPlus()
    {
        this.answerScreenCreateCount++;
    }

    public int getTheAnswer()
    {
        return this.theAnswer;
    }

    public void setTheAnswer()
    {
        Random r = new Random();
        this.theAnswer = r.nextInt();
    }

    private Test()
    {
    }
}
