package com.aspose.slides.internal.p180ib;

import com.aspose.slides.internal.p475wh.C12026yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ib.dy */
/* JADX INFO: loaded from: classes.dex */
public class C4804dy {

    /* JADX INFO: renamed from: k4 */
    private final C12026yj f13381k4;

    /* JADX INFO: renamed from: kk */
    private final float f13382kk;

    /* JADX INFO: renamed from: x1 */
    private final float f13383x1;

    public C4804dy(C12026yj c12026yj, float f) {
        C12026yj c12026yj2 = (C12026yj) c12026yj.deepClone();
        this.f13381k4 = c12026yj2;
        this.f13382kk = f;
        this.f13383x1 = c12026yj2.m56930ne();
        if (c12026yj2.m56930ne() < f) {
            c12026yj2.m56926kk(f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C12026yj m19879k4() {
        return this.f13381k4;
    }

    /* JADX INFO: renamed from: kk */
    public float m19880kk() {
        float f = this.f13383x1;
        if (f > 0.0f) {
            return f;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: to */
    public float m19881to() {
        return this.f13382kk;
    }

    /* JADX INFO: renamed from: x1 */
    public float m19882x1() {
        return this.f13383x1;
    }
}
