package com.example.quizzler;

// This is the model class that represents a single quiz question.
public class TrueFalse {

    // These are the placeholders for the question resource id and the correct answer
    private int mQuestionID;
    private boolean mAnswer;

    // This is the constructor that will be called when a new quiz question is created.
    public TrueFalse(int questionResourceID, boolean trueOrFalse) {
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    // This method gives us access to info stored in the (private) question id.
    public int getmQuestionID() {
        return mQuestionID;
    }

    // Not actually using the setters at the moment. Users are not creating questions.
    public void setmQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    // This method gives us access to info stored in the (private) mAnswer.
    public boolean ismAnswer() {
        return mAnswer;
    }

    // Not actually using the setters at the moment. Users are not creating answers.
    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
