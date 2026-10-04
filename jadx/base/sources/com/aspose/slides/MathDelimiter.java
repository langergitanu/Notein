package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
public final class MathDelimiter extends MathElementBase implements IMathDelimiter, InterfaceC14876z8 {

    /* JADX INFO: renamed from: c5 */
    private IMathElementCollection f2744c5;

    /* JADX INFO: renamed from: du */
    private char f2745du;

    /* JADX INFO: renamed from: dy */
    private int f2746dy;

    /* JADX INFO: renamed from: h4 */
    private char f2747h4;

    /* JADX INFO: renamed from: k4 */
    final p8h f2748k4;

    /* JADX INFO: renamed from: m9 */
    private boolean f2749m9;

    /* JADX INFO: renamed from: to */
    private char f2750to;

    private MathDelimiter() {
        setBeginningCharacter('(');
        setSeparatorCharacter('|');
        setEndingCharacter(')');
        setGrowToMatchOperandHeight(true);
        setDelimiterShape(0);
        this.f2748k4 = new p8h();
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final IMathDelimiter delimit(char c) {
        setSeparatorCharacter(c);
        return this;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public IMathDelimiter enclose(char c, char c2) {
        if (getBeginningCharacter() != 0 || getEndingCharacter() != 0) {
            return super.enclose(c, c2);
        }
        setBeginningCharacter(c);
        setEndingCharacter(c2);
        return this;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final IMathElementCollection getArguments() {
        return this.f2744c5;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final char getBeginningCharacter() {
        return this.f2750to;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        if (getArguments().getCount() == 0) {
            return MathElementBase.f2751kk;
        }
        IMathElement[] iMathElementArr = new IMathElement[getArguments().getCount()];
        getArguments().copyTo(iMathElementArr, 0);
        return iMathElementArr;
    }

    @Override // com.aspose.slides.InterfaceC14876z8
    public final p8h getControlCharacterProperties() {
        return this.f2748k4;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final int getDelimiterShape() {
        return this.f2746dy;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final char getEndingCharacter() {
        return this.f2747h4;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final boolean getGrowToMatchOperandHeight() {
        return this.f2749m9;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final char getSeparatorCharacter() {
        return this.f2745du;
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4382k4(this);
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final void setBeginningCharacter(char c) {
        this.f2750to = c;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final void setDelimiterShape(int i) {
        this.f2746dy = i;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final void setEndingCharacter(char c) {
        this.f2747h4 = c;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final void setGrowToMatchOperandHeight(boolean z) {
        this.f2749m9 = z;
    }

    @Override // com.aspose.slides.IMathDelimiter
    public final void setSeparatorCharacter(char c) {
        this.f2745du = c;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1978x1() {
        return getBeginningCharacter() == '(' && getSeparatorCharacter() == '|' && getEndingCharacter() == ')' && getGrowToMatchOperandHeight() && getDelimiterShape() == 0 && this.f2748k4.m68975k4();
    }

    public MathDelimiter(IGenericEnumerable<IMathElement> iGenericEnumerable, Object obj) {
        this();
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("mathElements");
        }
        this.f2744c5 = new ulh(iGenericEnumerable);
    }

    public MathDelimiter(IMathElement iMathElement) {
        this();
        if (iMathElement != null && ((MathElementBase) iMathElement).mo1971Y_()) {
            this.f2744c5 = new ulh((IGenericEnumerable<IMathElement>) iMathElement);
            return;
        }
        ulh ulhVar = new ulh();
        this.f2744c5 = ulhVar;
        ulhVar.add(iMathElement);
    }
}
