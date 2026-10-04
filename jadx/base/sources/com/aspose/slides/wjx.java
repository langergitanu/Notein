package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.InterfaceC14089ss;

/* JADX INFO: loaded from: classes3.dex */
class wjx implements IMathNaryOperatorProperties, InterfaceC14089ss<wjx> {

    /* JADX INFO: renamed from: du */
    private boolean f49807du;

    /* JADX INFO: renamed from: h4 */
    private final p8h f49808h4;

    /* JADX INFO: renamed from: k4 */
    private char f49809k4;

    /* JADX INFO: renamed from: kk */
    private boolean f49810kk;

    /* JADX INFO: renamed from: to */
    private boolean f49811to;

    /* JADX INFO: renamed from: x1 */
    private int f49812x1;

    public wjx() {
        this.f49808h4 = new p8h();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14089ss
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof wjx)) {
            return false;
        }
        wjx wjxVar = (wjx) obj;
        return getOperator() == wjxVar.getOperator() && getLimitLocation() == wjxVar.getLimitLocation() && getGrowToMatchOperandHeight() == wjxVar.getGrowToMatchOperandHeight() && getHideSubscript() == wjxVar.getHideSubscript() && getHideSuperscript() == wjxVar.getHideSuperscript() && m72774x1().m68976k4(wjxVar.m72774x1());
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final boolean getGrowToMatchOperandHeight() {
        return this.f49810kk;
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final boolean getHideSubscript() {
        return this.f49811to;
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final boolean getHideSuperscript() {
        return this.f49807du;
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final int getLimitLocation() {
        return this.f49812x1;
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final char getOperator() {
        return this.f49809k4;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Character.valueOf(this.f49809k4), Integer.valueOf(this.f49812x1), Boolean.valueOf(this.f49810kk), Boolean.valueOf(this.f49811to), Boolean.valueOf(this.f49807du), this.f49808h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72773k4() {
        return getOperator() == 0 && getLimitLocation() == 0 && !getGrowToMatchOperandHeight() && !getHideSubscript() && !getHideSuperscript() && m72774x1().m68975k4();
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setGrowToMatchOperandHeight(boolean z) {
        this.f49810kk = z;
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setHideSubscript(boolean z) {
        this.f49811to = z;
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setHideSuperscript(boolean z) {
        this.f49807du = z;
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setLimitLocation(int i) {
        this.f49812x1 = i;
    }

    @Override // com.aspose.slides.IMathNaryOperatorProperties
    public final void setOperator(char c) {
        this.f49809k4 = c;
    }

    /* JADX INFO: renamed from: x1 */
    public final p8h m72774x1() {
        return this.f49808h4;
    }

    public wjx(char c) {
        setOperator(c);
        this.f49808h4 = new p8h();
    }

    public wjx(char c, boolean z, boolean z2) {
        this(c);
        setHideSubscript(z);
        setHideSuperscript(z2);
    }

    public wjx(IMathNaryOperatorProperties iMathNaryOperatorProperties) {
        if (iMathNaryOperatorProperties == null) {
            throw new ArgumentNullException("properties");
        }
        setOperator(iMathNaryOperatorProperties.getOperator());
        setLimitLocation(iMathNaryOperatorProperties.getLimitLocation());
        setGrowToMatchOperandHeight(iMathNaryOperatorProperties.getGrowToMatchOperandHeight());
        setHideSubscript(iMathNaryOperatorProperties.getHideSubscript());
        setHideSuperscript(iMathNaryOperatorProperties.getHideSuperscript());
        this.f49808h4 = ((wjx) iMathNaryOperatorProperties).m72774x1();
    }
}
