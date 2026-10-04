package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: loaded from: classes3.dex */
final class a5o {

    /* JADX INFO: renamed from: du */
    private long f3817du;

    /* JADX INFO: renamed from: kk */
    private final Picture f3819kk;

    /* JADX INFO: renamed from: to */
    private final zn7 f3820to;

    /* JADX INFO: renamed from: k4 */
    private int f3818k4 = 96;

    /* JADX INFO: renamed from: x1 */
    private int f3821x1 = 0;

    public a5o(Picture picture, zn7 zn7Var) {
        this.f3819kk = picture;
        this.f3820to = zn7Var;
    }

    /* JADX INFO: renamed from: dy */
    private void m3286dy() {
        this.f3817du++;
    }

    /* JADX INFO: renamed from: du */
    public final zn7 m3287du() {
        return this.f3820to;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m3288h4() {
        m3287du().m74650m9();
        this.f3819kk.m2240kk();
        this.f3821x1 = 0;
        this.f3818k4 = 96;
        m3286dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m3289k4() {
        return this.f3818k4;
    }

    /* JADX INFO: renamed from: kk */
    public final pj5 m3295kk() {
        ohe oheVarClone = m3287du().m74652x1().m4218k4().Clone();
        return pj5.m69111k4(new pj5(oheVarClone.f47808k4.Clone(), oju.m68622x1(oju.f47835to, oheVarClone.m68567k4()).Clone()), 100.0f);
    }

    /* JADX INFO: renamed from: m9 */
    public final long m3296m9() {
        return ((((this.f3817du & 4294967295L) + (this.f3819kk.getVersion() & 4294967295L)) & 4294967295L) + (this.f3820to.m74640dy() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: to */
    public final pj5 m3297to() {
        ohe oheVarClone = m3287du().m74642k4().Clone();
        return pj5.m69111k4(new pj5(oheVarClone.f47808k4.Clone(), oju.m68622x1(oju.f47835to, oheVarClone.m68567k4()).Clone()), 100.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m3298x1() {
        return this.f3821x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m3290k4(int i, int i2) {
        return m3287du().m74652x1().m4217k4(new C12007ix(0.0f, 0.0f, i, i2));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3299x1(int i) {
        this.f3821x1 = i;
        m3286dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3291k4(int i) {
        this.f3818k4 = C3085sv.m13072k4(i, -1, 1000000);
        m3286dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3300x1(pj5 pj5Var) {
        oju ojuVarClone = oju.m68618k4(new oju(pj5Var.f48081x1, pj5Var.f48079kk), 100).Clone();
        m3287du().m74645k4(new ohe(ojuVarClone.Clone(), oju.m68622x1(oju.m68622x1(oju.f47835to, oju.m68618k4(new oju(pj5Var.f48080to, pj5Var.f48078du), 100)), ojuVarClone).Clone().Clone()));
        m3286dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3292k4(IPictureFillFormatEffectiveData iPictureFillFormatEffectiveData) {
        if (C7019kk.m27469x1(iPictureFillFormatEffectiveData, qxi.class)) {
            qxi qxiVar = (qxi) iPictureFillFormatEffectiveData;
            this.f3820to.m74652x1().m4220k4(qxiVar.m69798kk().m4218k4().Clone());
            this.f3820to.m74645k4(qxiVar.m69800to().m4218k4().Clone());
            this.f3820to.m74643k4(qxiVar.m69791dy());
            this.f3820to.m74644k4(qxiVar.m69799m9());
            this.f3820to.m74647k4(qxiVar.m69790du().Clone());
            this.f3820to.m74646k4(qxiVar.m69792h4().Clone());
        }
        this.f3819kk.m2237k4(iPictureFillFormatEffectiveData.getPicture());
        this.f3821x1 = iPictureFillFormatEffectiveData.getPictureFillMode();
        this.f3818k4 = iPictureFillFormatEffectiveData.getDpi();
        m3286dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3293k4(PictureFillFormat pictureFillFormat) {
        m3287du().m74648k4(pictureFillFormat.m2255m9());
        this.f3819kk.m2238k4((Picture) pictureFillFormat.getPicture());
        this.f3821x1 = pictureFillFormat.getPictureFillMode();
        this.f3818k4 = pictureFillFormat.getDpi();
        m3286dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3294k4(pj5 pj5Var) {
        oju ojuVarClone = oju.m68618k4(new oju(pj5Var.f48081x1, pj5Var.f48079kk), 100).Clone();
        m3287du().m74652x1().m4220k4(new ohe(ojuVarClone.Clone(), oju.m68622x1(oju.m68622x1(oju.f47835to, ojuVarClone), oju.m68618k4(new oju(pj5Var.f48080to, pj5Var.f48078du), 100)).Clone().Clone()).Clone());
        m3286dy();
    }
}
