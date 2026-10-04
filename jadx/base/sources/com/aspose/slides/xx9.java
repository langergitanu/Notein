package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class xx9 {

    /* JADX INFO: renamed from: k4 */
    static final C0735a7 f50221k4 = new C0735a7();

    /* JADX INFO: renamed from: du */
    private long f50222du;

    /* JADX INFO: renamed from: x1 */
    C0735a7 f50225x1;

    /* JADX INFO: renamed from: to */
    private int f50224to = -1;

    /* JADX INFO: renamed from: kk */
    private long f50223kk = 1219033472;

    public xx9(C0735a7 c0735a7) {
        this.f50225x1 = c0735a7;
    }

    /* JADX INFO: renamed from: m9 */
    private void m73617m9() {
        this.f50222du++;
    }

    /* JADX INFO: renamed from: du */
    public final long m73618du() {
        return this.f50222du;
    }

    public boolean equals(Object obj) {
        SketchFormat sketchFormat = (SketchFormat) C7019kk.m27452k4(obj, SketchFormat.class);
        return sketchFormat == null ? super.equals(obj) : this.f50223kk == sketchFormat.m2678to() && this.f50224to == sketchFormat.getSketchType();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m73619h4() {
        return this.f50223kk == 1219033472 && this.f50224to == -1;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Long.valueOf(this.f50223kk), Integer.valueOf(this.f50224to));
    }

    /* JADX INFO: renamed from: k4 */
    public final int m73620k4() {
        return this.f50224to;
    }

    /* JADX INFO: renamed from: kk */
    public final C0735a7 m73626kk() {
        return this.f50225x1;
    }

    /* JADX INFO: renamed from: to */
    public final void m73627to() {
        this.f50224to = -1;
        this.f50223kk = 1219033472L;
        this.f50225x1 = f50221k4;
        m73617m9();
    }

    public String toString() {
        return C14113y2.m67408k4("SketchFormat: ", C14042ak.m66410k4(LineSketchType.class, this.f50224to));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m73628x1() {
        return this.f50223kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73621k4(int i) {
        this.f50224to = i;
        m73617m9();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73629x1(SketchFormat sketchFormat) {
        this.f50224to = sketchFormat.getSketchType();
        this.f50223kk = sketchFormat.m2678to();
        this.f50225x1 = sketchFormat.m2670du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73622k4(long j) {
        this.f50223kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73623k4(ISketchFormatEffectiveData iSketchFormatEffectiveData) {
        this.f50224to = iSketchFormatEffectiveData.getSketchType();
        this.f50223kk = ((nw7) iSketchFormatEffectiveData).f47632k4;
        m73617m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73624k4(SketchFormat sketchFormat) {
        m73629x1(sketchFormat);
        m73617m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73625k4(C0735a7 c0735a7) {
        this.f50225x1 = c0735a7;
    }
}
