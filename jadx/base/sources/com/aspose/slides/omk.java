package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class omk extends AbstractC14897zn {

    /* JADX INFO: renamed from: c5 */
    private final IGenericDictionary<String, FontSubstitutionInfo> f47864c5;

    /* JADX INFO: renamed from: ck */
    private C4317dy f47865ck;

    /* JADX INFO: renamed from: dy */
    private final IGenericDictionary<String, dnm> f47866dy;

    /* JADX INFO: renamed from: jd */
    private Presentation f47867jd;

    public omk(Presentation presentation) {
        super((C12009k4) null);
        this.f47866dy = new Dictionary();
        this.f47864c5 = new Dictionary();
        if (presentation == null) {
            throw new ArgumentNullException("presentation");
        }
        this.f47867jd = presentation;
        mo67710k4(new C4317dy());
    }

    /* JADX INFO: renamed from: kk */
    private void m68692kk(int[] iArr) {
        for (ITextFrame iTextFrame : SlideUtil.m2769k4((IPresentation) this.f47867jd, iArr, true)) {
            TextFrame textFrame = (TextFrame) iTextFrame;
            if (!C7019kk.m27469x1(textFrame.m2924kk(), Cell.class) && (!C7019kk.m27469x1(textFrame.m2924kk(), AutoShape.class) || (!C7019kk.m27469x1(((AutoShape) textFrame.m2924kk()).m2576t6(), SmartArt.class) && (!((AutoShape) textFrame.m2924kk()).isTextHolder() || (!C7019kk.m27469x1(((AutoShape) textFrame.m2924kk()).getSlide(), LayoutSlide.class) && !C7019kk.m27469x1(((AutoShape) textFrame.m2924kk()).getSlide(), MasterSlide.class)))))) {
                jq6.m63485k4(textFrame.f3523to, (kg7) null);
                textFrame.f3523to.mo64295k4(this, (kg7) null);
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: c5 */
    public C4317dy mo67706c5() {
        return this.f47865ck;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: du */
    public float mo67707du() {
        return ((Float) C7019kk.m27467x1(Float.TYPE)).floatValue();
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: dy */
    public int mo67708dy() {
        return ((Integer) C7019kk.m27467x1(Integer.TYPE)).intValue();
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: fa */
    public C12007ix mo64335fa() {
        return (C12007ix) C7019kk.m27467x1(C12007ix.class);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: h4 */
    public float mo67709h4() {
        return ((Float) C7019kk.m27467x1(Float.TYPE)).floatValue();
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64337k4(IPPImage iPPImage, C12007ix c12007ix, C12007ix c12007ix2, qta qtaVar) {
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: m9 */
    public int mo67711m9() {
        return ((Integer) C7019kk.m27467x1(Integer.TYPE)).intValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final FontSubstitutionInfo[] m68694x1(int[] iArr) {
        m68692kk(iArr);
        FontSubstitutionInfo[] fontSubstitutionInfoArr = new FontSubstitutionInfo[this.f47864c5.size()];
        this.f47864c5.getValues().copyToTArray(fontSubstitutionInfoArr, 0);
        return fontSubstitutionInfoArr;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo67710k4(C4317dy c4317dy) {
        this.f47865ck = c4317dy;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64338k4(C11896dy c11896dy, azo azoVar, C0962es c0962es) {
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64339k4(AbstractC12002ck abstractC12002ck, float f, float f2, float f3, float f4) {
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64340k4(AbstractC12002ck abstractC12002ck, int i, int i2) {
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64341k4(AbstractC12002ck abstractC12002ck, int i, int i2, int i3, int i4) {
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64342k4(C12007ix c12007ix) {
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64343k4(String str, C12007ix c12007ix, qy7 qy7Var) {
        if (!this.f47866dy.containsKey(qy7Var.m69912ne())) {
            this.f47866dy.addItem(qy7Var.m69912ne(), new dnm(qy7Var.m69882b3().m68819x1(), qy7Var.m69923v4(), qy7Var.m69912ne()));
        }
        if (this.f47864c5.containsKey(qy7Var.m69923v4()) || C14113y2.m67363du(qy7Var.m69923v4(), qy7Var.m69912ne())) {
            return;
        }
        this.f47864c5.addItem(qy7Var.m69923v4(), new FontSubstitutionInfo(qy7Var.m69923v4(), qy7Var.m69912ne()));
    }

    /* JADX INFO: renamed from: k4 */
    public final dnm[] m68693k4(int[] iArr) {
        m68692kk(iArr);
        dnm[] dnmVarArr = new dnm[this.f47866dy.size()];
        this.f47866dy.getValues().copyToTArray(dnmVarArr, 0);
        return dnmVarArr;
    }
}
