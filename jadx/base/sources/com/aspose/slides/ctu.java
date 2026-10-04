package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p464vq.AbstractC11840w6;
import com.aspose.slides.internal.p464vq.C11867z9;

/* JADX INFO: loaded from: classes3.dex */
class ctu extends AbstractC11840w6 {

    /* JADX INFO: renamed from: k4 */
    private final ChartDataWorkbook f4440k4;

    /* JADX INFO: renamed from: kk */
    private int f4441kk;

    /* JADX INFO: renamed from: to */
    private int f4442to;

    /* JADX INFO: renamed from: x1 */
    private final x5k f4443x1;

    public ctu(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        super(c11867z9);
        this.f4440k4 = chartDataWorkbook;
        this.f4443x1 = new x5k();
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11840w6
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C11867z9 mo4812qm() {
        return (C11867z9) super.mo4812qm();
    }

    /* JADX INFO: renamed from: kk */
    public int m4811kk() {
        int i = this.f4442to + 1;
        this.f4442to = i;
        return i;
    }

    /* JADX INFO: renamed from: to */
    public final x5k m4813to() {
        return this.f4443x1;
    }

    /* JADX INFO: renamed from: x1 */
    public int m4814x1() {
        int i = this.f4441kk + 1;
        this.f4441kk = i;
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m4810k4(String str, int i) {
        if (this.f4440k4.m688to() == null || this.f4440k4.m688to().m74879k4() == null) {
            return;
        }
        new C3100wp(str, i).sendWarning(this.f4440k4.m688to().m74879k4());
    }
}
