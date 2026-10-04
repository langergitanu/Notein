package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class MathematicalText extends MathElementBase implements IMathematicalText {

    /* JADX INFO: renamed from: du */
    private String f2803du;

    /* JADX INFO: renamed from: k4 */
    private ldn f2804k4;

    /* JADX INFO: renamed from: to */
    private final PortionFormat f2805to;

    public MathematicalText() {
        this(C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m2005k4(IPortionFormat iPortionFormat) {
        if (iPortionFormat == null) {
            return 0;
        }
        if (iPortionFormat.getFontBold() == 1 && iPortionFormat.getFontItalic() == 1) {
            return 4;
        }
        if (iPortionFormat.getFontBold() == 1) {
            return 2;
        }
        return iPortionFormat.getFontItalic() == 1 ? 3 : 1;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return MathElementBase.f2751kk;
    }

    @Override // com.aspose.slides.IMathematicalText
    public final IPortionFormat getFormat() {
        return this.f2805to;
    }

    @Override // com.aspose.slides.IMathematicalText
    public final String getValue() {
        return this.f2803du;
    }

    @Override // com.aspose.slides.IMathematicalText
    public final void setValue(String str) {
        this.f2803du = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final ldn m2007x1() {
        return this.f2804k4;
    }

    public MathematicalText(char c) {
        this(C14113y2.m67389k4(c, 1));
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4394k4(this);
    }

    public MathematicalText(String str) {
        this.f2804k4 = new ldn();
        if (str == null) {
            throw new ArgumentNullException("mathText");
        }
        this.f2803du = str;
        this.f2805to = new PortionFormat();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2006k4(ldn ldnVar) {
        this.f2804k4 = ldnVar;
    }

    public MathematicalText(String str, IPortionFormat iPortionFormat) {
        this.f2804k4 = new ldn();
        if (str == null) {
            throw new ArgumentNullException("mathText");
        }
        if (iPortionFormat == null) {
            throw new ArgumentNullException("portionFormat");
        }
        this.f2805to = (PortionFormat) iPortionFormat;
        this.f2803du = str;
    }
}
