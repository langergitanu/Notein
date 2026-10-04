package com.aspose.slides.internal.p518y4;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.y4.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12790k4 {

    /* JADX INFO: renamed from: k4 */
    private C1569kk f42546k4;

    /* JADX INFO: renamed from: to */
    private String f42548to;

    /* JADX INFO: renamed from: x1 */
    private C14093tq<Integer> f42549x1 = new C14093tq<>();

    /* JADX INFO: renamed from: kk */
    private C14093tq<Float> f42547kk = new C14093tq<>();

    public C12790k4(C1569kk c1569kk) {
        this.f42546k4 = c1569kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m59459k4() {
        if (C14093tq.m67295k4(this.f42549x1, null)) {
            this.f42549x1 = new C14093tq<>(Integer.valueOf(new C12792x1(this.f42546k4).m59485x1()));
        }
        return this.f42549x1.m67297k4().intValue();
    }

    /* JADX INFO: renamed from: kk */
    public final String m59460kk() {
        if (this.f42548to == null) {
            this.f42548to = new C12792x1(this.f42546k4).m59484to();
        }
        return this.f42548to;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m59461x1() {
        if (C14093tq.m67295k4(this.f42547kk, null)) {
            this.f42547kk = new C14093tq<>(Float.valueOf(new C12792x1(this.f42546k4).m59483kk()));
        }
        return this.f42547kk.m67297k4().floatValue();
    }
}
