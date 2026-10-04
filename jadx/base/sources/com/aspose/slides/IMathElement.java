package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IMathElement {
    IMathAccent accent(char c);

    IMathFunction asArgumentOfFunction(int i);

    IMathFunction asArgumentOfFunction(int i, IMathElement iMathElement);

    IMathFunction asArgumentOfFunction(int i, String str);

    IMathFunction asArgumentOfFunction(IMathElement iMathElement);

    IMathFunction asArgumentOfFunction(String str);

    IMathFraction divide(IMathElement iMathElement);

    IMathFraction divide(IMathElement iMathElement, int i);

    IMathFraction divide(String str);

    IMathFraction divide(String str, int i);

    IMathDelimiter enclose();

    IMathDelimiter enclose(char c, char c2);

    IMathFunction function(IMathElement iMathElement);

    IMathFunction function(String str);

    IMathElement[] getChildren();

    IMathGroupingCharacter group();

    IMathGroupingCharacter group(char c, int i, int i2);

    IMathNaryOperator integral(int i);

    IMathNaryOperator integral(int i, IMathElement iMathElement, IMathElement iMathElement2);

    IMathNaryOperator integral(int i, IMathElement iMathElement, IMathElement iMathElement2, int i2);

    IMathNaryOperator integral(int i, String str, String str2);

    IMathNaryOperator integral(int i, String str, String str2, int i2);

    IMathBlock join(IMathElement iMathElement);

    IMathBlock join(String str);

    IMathNaryOperator nary(int i, IMathElement iMathElement, IMathElement iMathElement2);

    IMathNaryOperator nary(int i, String str, String str2);

    IMathBar overbar();

    IMathRadical radical(IMathElement iMathElement);

    IMathRadical radical(String str);

    IMathLimit setLowerLimit(IMathElement iMathElement);

    IMathLimit setLowerLimit(String str);

    IMathLeftSubSuperscriptElement setSubSuperscriptOnTheLeft(IMathElement iMathElement, IMathElement iMathElement2);

    IMathLeftSubSuperscriptElement setSubSuperscriptOnTheLeft(String str, String str2);

    IMathRightSubSuperscriptElement setSubSuperscriptOnTheRight(IMathElement iMathElement, IMathElement iMathElement2);

    IMathRightSubSuperscriptElement setSubSuperscriptOnTheRight(String str, String str2);

    IMathSubscriptElement setSubscript(IMathElement iMathElement);

    IMathSubscriptElement setSubscript(String str);

    IMathSuperscriptElement setSuperscript(IMathElement iMathElement);

    IMathSuperscriptElement setSuperscript(String str);

    IMathLimit setUpperLimit(IMathElement iMathElement);

    IMathLimit setUpperLimit(String str);

    IMathBorderBox toBorderBox();

    IMathBorderBox toBorderBox(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8);

    IMathBox toBox();

    IMathArray toMathArray();

    IMathBar underbar();
}
