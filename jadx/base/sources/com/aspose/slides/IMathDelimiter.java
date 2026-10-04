package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IMathDelimiter extends IMathElement {
    IMathDelimiter delimit(char c);

    IMathElementCollection getArguments();

    char getBeginningCharacter();

    int getDelimiterShape();

    char getEndingCharacter();

    boolean getGrowToMatchOperandHeight();

    char getSeparatorCharacter();

    void setBeginningCharacter(char c);

    void setDelimiterShape(int i);

    void setEndingCharacter(char c);

    void setGrowToMatchOperandHeight(boolean z);

    void setSeparatorCharacter(char c);
}
