package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.g5 */
/* JADX INFO: loaded from: classes3.dex */
final class C1132g5 extends AbstractC13680jc<FillOverlay, C1132g5> implements IFillOverlayEffectiveData {

    /* JADX INFO: renamed from: k4 */
    static final C1132g5 f5172k4 = m6433x1();

    /* JADX INFO: renamed from: kk */
    private int f5173kk;

    /* JADX INFO: renamed from: x1 */
    private C14176nc f5174x1;

    public C1132g5(FillOverlay fillOverlay) {
        super(fillOverlay, FillOverlay.class, C1132g5.class);
        this.f5174x1 = new C14176nc(this);
        this.f5173kk = 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static C1132g5 m6433x1() {
        C1132g5 c1132g5 = new C1132g5(null);
        c1132g5.f5174x1 = C14176nc.f47496h4;
        c1132g5.f5173kk = 0;
        return c1132g5;
    }

    @Override // com.aspose.slides.IFillOverlayEffectiveData
    public final int getBlend() {
        return this.f5173kk;
    }

    @Override // com.aspose.slides.IFillOverlayEffectiveData
    public final IFillFormatEffectiveData getFillFormat() {
        return this.f5174x1;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public tc4 mo3873k4(tc4 tc4Var) {
        return tc4Var;
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public String mo3874k4() {
        String strMo3874k4 = super.mo3874k4();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        return C14113y2.m67407k4(strMo3874k4, chValueOf, this.f5174x1.toString(), chValueOf, C14042ak.m66410k4(FillBlendMode.class, this.f5173kk));
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f5174x1.mo4833k4(iBaseSlide, dm6Var);
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6434k4(InterfaceC14672vc interfaceC14672vc, FillOverlay fillOverlay) {
        C1132g5 c1132g5 = (C1132g5) interfaceC14672vc;
        this.f5173kk = c1132g5.f5173kk;
        this.f5174x1.m67934k4((InterfaceC14672vc) c1132g5.f5174x1);
        if (fillOverlay.getBlend() != 0) {
            this.f5173kk = fillOverlay.getBlend();
        }
        this.f5174x1.m67936kk((FillFormat) fillOverlay.getFillFormat());
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo6436k4(C1132g5 c1132g5) {
        if (c1132g5 == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, c1132g5)) {
            return true;
        }
        return getBlend() == c1132g5.getBlend() && this.f5174x1.mo4836k4(c1132g5.f5174x1);
    }
}
