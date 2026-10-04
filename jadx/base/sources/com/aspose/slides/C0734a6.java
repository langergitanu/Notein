package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.a6 */
/* JADX INFO: loaded from: classes3.dex */
final class C0734a6 {

    /* JADX INFO: renamed from: du */
    private final C0808b8 f3822du;

    /* JADX INFO: renamed from: h4 */
    private long f3823h4;

    /* JADX INFO: renamed from: k4 */
    private final FillFormat f3824k4;

    /* JADX INFO: renamed from: kk */
    private final EffectFormat f3825kk;

    /* JADX INFO: renamed from: to */
    private final ThreeDFormat f3826to;

    /* JADX INFO: renamed from: x1 */
    private final LineFormat f3827x1;

    public C0734a6(FillFormat fillFormat, LineFormat lineFormat, EffectFormat effectFormat, ThreeDFormat threeDFormat, C0808b8 c0808b8) {
        this.f3822du = c0808b8;
        this.f3824k4 = fillFormat;
        this.f3827x1 = lineFormat;
        this.f3825kk = effectFormat;
        this.f3826to = threeDFormat;
    }

    /* JADX INFO: renamed from: x1 */
    private void m3301x1() {
        this.f3823h4++;
    }

    public boolean equals(Object obj) {
        Format format = (Format) C7019kk.m27452k4(obj, Format.class);
        return format == null ? super.equals(obj) : this.f3824k4.equals(format.getFill()) && this.f3827x1.equals(format.getLine()) && this.f3825kk.equals(format.getEffect()) && this.f3826to.equals(format.getEffect3D());
    }

    public int hashCode() {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m3302k4() {
        return ((((((((this.f3823h4 & 4294967295L) + (this.f3824k4.getVersion() & 4294967295L)) & 4294967295L) + (this.f3827x1.getVersion() & 4294967295L)) & 4294967295L) + (this.f3825kk.getVersion() & 4294967295L)) & 4294967295L) + (this.f3826to.getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3303k4(Format format) {
        this.f3824k4.m1456k4(format.getFill());
        this.f3827x1.m1896k4(format.getLine());
        this.f3825kk.m1387k4(format.getEffect());
        this.f3826to.m3007k4(format.getEffect3D());
        if (format.m1556to().m4044k4() != null) {
            this.f3822du.m4045k4(format.m1556to().m4044k4().m29645to());
        }
        m3301x1();
    }
}
