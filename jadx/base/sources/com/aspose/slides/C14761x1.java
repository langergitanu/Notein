package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.x1 */
/* JADX INFO: loaded from: classes3.dex */
final class C14761x1 extends AbstractC14440s9 implements vbl {

    /* JADX INFO: renamed from: kk */
    private float f49890kk;

    /* JADX INFO: renamed from: x1 */
    private float f49891x1;

    public C14761x1(vbl vblVar, float f, float f2) {
        super(vblVar);
        this.f49891x1 = 0.0f;
        this.f49890kk = 0.0f;
        if (f < 0.0f) {
            throw new ArgumentOutOfRangeException("accelerate");
        }
        if (f2 < 0.0f) {
            throw new ArgumentOutOfRangeException("decelerate");
        }
        float f3 = f + f2;
        if (f3 > 1.0f) {
            f /= f3;
            f2 /= f3;
        }
        this.f49891x1 = f;
        this.f49890kk = f2;
    }

    /* JADX INFO: renamed from: k4 */
    private double m72994k4(double d, float f) {
        return mo4315kk() * (d / ((double) f)) * d;
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: kk */
    public final double mo4315kk() {
        return this.f48787k4.mo4315kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m72996x1() {
        return this.f49890kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m72995k4() {
        return this.f49891x1;
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: k4 */
    public final void mo4312k4(double d) {
        double dMo4315kk = d / mo4315kk();
        if (m72995k4() > 0.0f && dMo4315kk < m72995k4()) {
            this.f48787k4.mo4312k4(m72994k4(dMo4315kk, m72995k4()));
            return;
        }
        if (m72996x1() > 0.0f) {
            double d2 = 1.0d - dMo4315kk;
            if (d2 <= m72996x1()) {
                this.f48787k4.mo4312k4(mo4315kk() - m72994k4(d2, m72996x1()));
                return;
            }
        }
        this.f48787k4.mo4312k4(d);
    }
}
