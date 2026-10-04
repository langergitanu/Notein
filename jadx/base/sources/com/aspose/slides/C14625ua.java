package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.ua */
/* JADX INFO: loaded from: classes3.dex */
class C14625ua {
    /* JADX INFO: renamed from: k4 */
    public static String m71586k4(IMathElement iMathElement) {
        if (C7019kk.m27469x1(iMathElement, MathAccent.class)) {
            return "acc";
        }
        if (C7019kk.m27469x1(iMathElement, MathBar.class)) {
            return "bar";
        }
        if (C7019kk.m27469x1(iMathElement, MathBox.class)) {
            return "box";
        }
        if (C7019kk.m27469x1(iMathElement, MathGroupingCharacter.class)) {
            return "groupChr";
        }
        if (C7019kk.m27469x1(iMathElement, MathBorderBox.class)) {
            return "borderBox";
        }
        if (C7019kk.m27469x1(iMathElement, MathMatrix.class)) {
            return "m";
        }
        if (C7019kk.m27469x1(iMathElement, MathDelimiter.class)) {
            return "d";
        }
        if (C7019kk.m27469x1(iMathElement, MathArray.class)) {
            return "eqArr";
        }
        if (C7019kk.m27469x1(iMathElement, MathFraction.class)) {
            return "f";
        }
        if (C7019kk.m27469x1(iMathElement, MathFunction.class)) {
            return "func";
        }
        if (C7019kk.m27469x1(iMathElement, MathLimit.class)) {
            return ((MathLimit) C7019kk.m27452k4((Object) iMathElement, MathLimit.class)).getUpperLimit() ? "limUpp" : "limLow";
        }
        if (C7019kk.m27469x1(iMathElement, MathematicalText.class)) {
            return "r";
        }
        if (C7019kk.m27469x1(iMathElement, MathNaryOperator.class)) {
            return "nary";
        }
        if (C7019kk.m27469x1(iMathElement, MathRadical.class)) {
            return "rad";
        }
        if (C7019kk.m27469x1(iMathElement, lv5.class)) {
            return "r";
        }
        if (C7019kk.m27469x1(iMathElement, MathSubscriptElement.class)) {
            return "sSub";
        }
        if (C7019kk.m27469x1(iMathElement, MathSuperscriptElement.class)) {
            return "sSup";
        }
        if (C7019kk.m27469x1(iMathElement, MathRightSubSuperscriptElement.class)) {
            return "sSubSup";
        }
        if (C7019kk.m27469x1(iMathElement, MathLeftSubSuperscriptElement.class)) {
            return "sPre";
        }
        if (C7019kk.m27469x1(iMathElement, MathBlock.class)) {
            return "oMath";
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m71587k4(b3y b3yVar) {
        return "t";
    }
}
