package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: loaded from: classes3.dex */
abstract class msn extends AbstractC14897zn {

    /* JADX INFO: renamed from: c5 */
    protected C4317dy f47433c5;

    /* JADX INFO: renamed from: ck */
    private float f47434ck;

    /* JADX INFO: renamed from: dy */
    protected C4317dy f47435dy;

    /* JADX INFO: renamed from: fa */
    private int f47436fa;

    /* JADX INFO: renamed from: jd */
    private float f47437jd;

    /* JADX INFO: renamed from: up */
    private int f47438up;

    public msn(int i, int i2, float f, float f2) {
        super((C12009k4) null);
        this.f47437jd = f;
        this.f47434ck = f2;
        this.f47436fa = i;
        this.f47438up = i2;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: c5 */
    public C4317dy mo67706c5() {
        return this.f47435dy;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: du */
    public float mo67707du() {
        return this.f47437jd;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: dy */
    public int mo67708dy() {
        return this.f47438up;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: h4 */
    public float mo67709h4() {
        return this.f47434ck;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo67710k4(C4317dy c4317dy) {
        this.f47435dy = c4317dy.m17345kk();
        C4317dy c4317dyM17345kk = c4317dy.m17345kk();
        this.f47433c5 = c4317dyM17345kk;
        c4317dyM17345kk.m17336k4(mo67707du() / 576.0f, mo67709h4() / 576.0f, 1);
        mo68798to();
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: m9 */
    public int mo67711m9() {
        return this.f47436fa;
    }
}
