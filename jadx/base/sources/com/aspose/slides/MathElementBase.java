package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MathElementBase implements IMathElement, InterfaceC14397rj {

    /* JADX INFO: renamed from: kk */
    static final IMathElement[] f2751kk = new IMathElement[0];

    /* JADX INFO: renamed from: x1 */
    static final MathematicalText f2752x1 = new MathematicalText("-1");

    /* JADX INFO: renamed from: k4 */
    private MathElementBase f2753k4;

    /* JADX INFO: renamed from: k4 */
    private static char m1979k4(int i) {
        if (i == 0) {
            return (char) 8747;
        }
        if (i == 1) {
            return (char) 8748;
        }
        if (i == 2) {
            return (char) 8749;
        }
        if (i == 3) {
            return (char) 8750;
        }
        if (i == 4) {
            return (char) 8751;
        }
        if (i == 5) {
            return (char) 8752;
        }
        throw new InvalidOperationException(C14113y2.m67402k4("Invalid value = '{0}' of argument '{1}' of function '{2}'", C14042ak.m66410k4(MathIntegralTypes.class, i), "integralType", "GetIntegralCharacterByType"));
    }

    /* JADX INFO: renamed from: kk */
    private static String m1982kk(int i) {
        switch (i) {
            case 0:
                return "sin";
            case 1:
                return "cos";
            case 2:
                return "tan";
            case 3:
                return "csc";
            case 4:
                return "sec";
            case 5:
                return "cot";
            case 6:
                return "sinh";
            case 7:
                return "cosh";
            case 8:
                return "tanh";
            case 9:
                return "csch";
            case 10:
                return "sech";
            case 11:
                return "coth";
            case 12:
                return "log";
            case 13:
                return "ln";
            default:
                throw new NotImplementedException(C14113y2.m67408k4("GetFunctionNameByType: Not implemented type of function ", C14042ak.m66410k4(MathFunctionsOfOneArgument.class, i)));
        }
    }

    /* JADX INFO: renamed from: to */
    private static String m1983to(int i) {
        if (i == 0) {
            return "log";
        }
        if (i == 1) {
            return "lim";
        }
        if (i == 2) {
            return "min";
        }
        if (i == 3) {
            return "max";
        }
        throw new NotImplementedException(C14113y2.m67408k4("GetFunctionNameByType: Not implemented type of function ", C14042ak.m66410k4(MathFunctionsOfTwoArguments.class, i)));
    }

    /* JADX INFO: renamed from: x1 */
    private static char m1984x1(int i) {
        switch (i) {
            case 0:
                return (char) 8721;
            case 1:
                return (char) 8719;
            case 2:
                return (char) 8720;
            case 3:
                return (char) 8745;
            case 4:
                return (char) 8746;
            case 5:
                return (char) 8743;
            case 6:
                return (char) 8744;
            default:
                throw new InvalidOperationException(C14113y2.m67402k4("Invalid value = '{0}' of argument '{1}' of function '{2}'", C14042ak.m66410k4(MathNaryOperatorTypes.class, i), "naryType", "GetNaryCharacterByType"));
        }
    }

    /* JADX INFO: renamed from: Y_ */
    public boolean mo1971Y_() {
        return false;
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathAccent accent(char c) {
        return new MathAccent(this, c);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFunction asArgumentOfFunction(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return asArgumentOfFunction(m1982kk(i));
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return m1981k4(m1982kk(i)).function(this);
            default:
                throw new InvalidOperationException(C14113y2.m67402k4("Invalid value = '{0}' of argument '{1}' of function '{2}'", C14042ak.m66410k4(MathFunctionsOfOneArgument.class, i), "functionType", "AsArgumentOfFunction(FunctionType)"));
        }
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFraction divide(IMathElement iMathElement) {
        return new MathFraction(this, iMathElement);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathDelimiter enclose() {
        return enclose('(', ')');
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFunction function(IMathElement iMathElement) {
        return new MathFunction(this, iMathElement);
    }

    @Override // com.aspose.slides.IMathElement
    public IMathElement[] getChildren() {
        throw new NotImplementedException();
    }

    public InterfaceC14397rj getParent_Immediate() {
        return this.f2753k4;
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathGroupingCharacter group() {
        return new MathGroupingCharacter(this);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathNaryOperator integral(int i) {
        return new MathNaryOperator(m1979k4(i), this);
    }

    @Override // com.aspose.slides.IMathElement
    public IMathBlock join(IMathElement iMathElement) {
        IMathBlock iMathBlock = (IMathBlock) C7019kk.m27452k4((Object) iMathElement, IMathBlock.class);
        if (iMathBlock != null) {
            MathBlock mathBlock = new MathBlock(iMathBlock.getCount() + 1);
            mathBlock.add(this);
            mathBlock.joinBlock(iMathBlock);
            return mathBlock;
        }
        MathBlock mathBlock2 = new MathBlock(2);
        mathBlock2.add(this);
        mathBlock2.add(iMathElement);
        return mathBlock2;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo1966k4(fx0 fx0Var);

    @Override // com.aspose.slides.IMathElement
    public final IMathNaryOperator nary(int i, IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathNaryOperator(m1984x1(i), this, iMathElement, iMathElement2);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathBar overbar() {
        return new MathBar(this, 1);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathRadical radical(IMathElement iMathElement) {
        return new MathRadical(this, iMathElement);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathLimit setLowerLimit(IMathElement iMathElement) {
        return new MathLimit(this, iMathElement, false);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathLeftSubSuperscriptElement setSubSuperscriptOnTheLeft(IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathLeftSubSuperscriptElement(this, iMathElement, iMathElement2);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathRightSubSuperscriptElement setSubSuperscriptOnTheRight(IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathRightSubSuperscriptElement(this, iMathElement, iMathElement2);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathSubscriptElement setSubscript(IMathElement iMathElement) {
        return new MathSubscriptElement(this, iMathElement);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathSuperscriptElement setSuperscript(IMathElement iMathElement) {
        return new MathSuperscriptElement(this, iMathElement);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathLimit setUpperLimit(IMathElement iMathElement) {
        return new MathLimit(this, iMathElement, true);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathBorderBox toBorderBox() {
        return new MathBorderBox(this);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathBox toBox() {
        return new MathBox(this);
    }

    @Override // com.aspose.slides.IMathElement
    public IMathArray toMathArray() {
        return new MathArray(this);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathBar underbar() {
        return new MathBar(this, 2);
    }

    /* JADX INFO: renamed from: k4 */
    private static MathSubscriptElement m1980k4(String str, IMathElement iMathElement) {
        return (MathSubscriptElement) new MathematicalText(str).setSubscript(iMathElement);
    }

    /* JADX INFO: renamed from: x1 */
    private static MathLimit m1985x1(String str, IMathElement iMathElement) {
        return (MathLimit) new MathematicalText(str).setLowerLimit(iMathElement);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFunction asArgumentOfFunction(int i, IMathElement iMathElement) {
        IMathElement iMathElementM1980k4;
        if (i == 0) {
            iMathElementM1980k4 = m1980k4(m1983to(i), iMathElement);
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new NotImplementedException(C14113y2.m67408k4("Not implemented type of function ", C14042ak.m66410k4(MathFunctionsOfTwoArguments.class, i)));
            }
            iMathElementM1980k4 = m1985x1(m1983to(i), iMathElement);
        }
        return iMathElementM1980k4.function(this);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFraction divide(IMathElement iMathElement, int i) {
        return new MathFraction(this, iMathElement, i);
    }

    @Override // com.aspose.slides.IMathElement
    public IMathDelimiter enclose(char c, char c2) {
        MathDelimiter mathDelimiter = new MathDelimiter(this);
        mathDelimiter.setBeginningCharacter(c);
        mathDelimiter.setEndingCharacter(c2);
        mathDelimiter.setSeparatorCharacter((char) 0);
        return mathDelimiter;
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFunction function(String str) {
        return function(new MathematicalText(str));
    }

    public final IMathElement[] getChildren(IMathElement iMathElement) {
        return iMathElement == null ? f2751kk : new IMathElement[]{iMathElement};
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathGroupingCharacter group(char c, int i, int i2) {
        return new MathGroupingCharacter(this, c, i, i2);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathNaryOperator integral(int i, IMathElement iMathElement, IMathElement iMathElement2) {
        return new MathNaryOperator(m1979k4(i), this, iMathElement, iMathElement2);
    }

    @Override // com.aspose.slides.IMathElement
    public IMathBlock join(String str) {
        return join(new MathematicalText(str));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathNaryOperator nary(int i, String str, String str2) {
        return nary(i, new MathematicalText(str), new MathematicalText(str2));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathRadical radical(String str) {
        return radical(new MathematicalText(str));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathLimit setLowerLimit(String str) {
        return setLowerLimit(new MathematicalText(str));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathLeftSubSuperscriptElement setSubSuperscriptOnTheLeft(String str, String str2) {
        return setSubSuperscriptOnTheLeft(new MathematicalText(str), new MathematicalText(str2));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathRightSubSuperscriptElement setSubSuperscriptOnTheRight(String str, String str2) {
        return setSubSuperscriptOnTheRight(new MathematicalText(str), new MathematicalText(str2));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathSubscriptElement setSubscript(String str) {
        return setSubscript(new MathematicalText(str));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathSuperscriptElement setSuperscript(String str) {
        return setSuperscript(new MathematicalText(str));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathLimit setUpperLimit(String str) {
        return setUpperLimit(new MathematicalText(str));
    }

    /* JADX INFO: renamed from: to */
    public final void m1987to() {
        this.f2753k4 = null;
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathBorderBox toBorderBox(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        MathBorderBox mathBorderBox = new MathBorderBox(this);
        mathBorderBox.setHideTop(z);
        mathBorderBox.setHideBottom(z2);
        mathBorderBox.setHideLeft(z3);
        mathBorderBox.setHideRight(z4);
        mathBorderBox.setStrikethroughHorizontal(z5);
        mathBorderBox.setStrikethroughVertical(z6);
        mathBorderBox.setStrikethroughBottomLeftToTopRight(z7);
        mathBorderBox.setStrikethroughTopLeftToBottomRight(z8);
        return mathBorderBox;
    }

    /* JADX INFO: renamed from: k4 */
    private static MathSuperscriptElement m1981k4(String str) {
        return (MathSuperscriptElement) new MathematicalText(str).setSuperscript(f2752x1);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFunction asArgumentOfFunction(int i, String str) {
        return asArgumentOfFunction(i, new MathematicalText(str));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFraction divide(String str) {
        return divide(new MathematicalText(str));
    }

    public final IMathElement[] getChildren(IMathElement iMathElement, IMathElement iMathElement2) {
        return iMathElement == null ? iMathElement2 == null ? f2751kk : new IMathElement[]{iMathElement2} : iMathElement2 == null ? new IMathElement[]{iMathElement} : new IMathElement[]{iMathElement, iMathElement2};
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathNaryOperator integral(int i, IMathElement iMathElement, IMathElement iMathElement2, int i2) {
        MathNaryOperator mathNaryOperator = new MathNaryOperator(m1979k4(i), this, iMathElement, iMathElement2);
        mathNaryOperator.setLimitLocation(i2);
        return mathNaryOperator;
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFunction asArgumentOfFunction(IMathElement iMathElement) {
        return new MathFunction(iMathElement, this);
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFraction divide(String str, int i) {
        return divide(new MathematicalText(str), i);
    }

    public final IMathElement[] getChildren(IMathElement iMathElement, IMathElement iMathElement2, IMathElement iMathElement3) {
        return iMathElement == null ? getChildren(iMathElement2, iMathElement3) : iMathElement2 == null ? getChildren(iMathElement, iMathElement3) : iMathElement3 == null ? getChildren(iMathElement, iMathElement2) : new IMathElement[]{iMathElement, iMathElement2, iMathElement3};
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathNaryOperator integral(int i, String str, String str2) {
        return integral(i, new MathematicalText(str), new MathematicalText(str2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1986k4(MathElementBase mathElementBase) {
        if (this.f2753k4 != null) {
            throw new PptxEditException("It is not possible to set a new math element parent without removing the old one.");
        }
        if (mathElementBase == null) {
            throw new ArgumentNullException("parentImmediate", "To set the value to null you need to call the method ResetParent");
        }
        this.f2753k4 = mathElementBase;
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathFunction asArgumentOfFunction(String str) {
        return asArgumentOfFunction(new MathematicalText(str));
    }

    @Override // com.aspose.slides.IMathElement
    public final IMathNaryOperator integral(int i, String str, String str2, int i2) {
        return integral(i, new MathematicalText(str), new MathematicalText(str2), i2);
    }
}
