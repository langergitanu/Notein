package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.sl */
/* JADX INFO: loaded from: classes3.dex */
class C14460sl extends AbstractC14413rs {

    /* JADX INFO: renamed from: k4 */
    private C14093tq<Byte> f48879k4 = new C14093tq<>();

    /* JADX INFO: renamed from: x1 */
    private IBulletFormat f48880x1;

    public C14460sl(IBulletFormat iBulletFormat) {
        this.f48880x1 = iBulletFormat;
    }

    /* JADX INFO: renamed from: x1 */
    private void m70667x1() {
        if (C7019kk.m27469x1(this.f48880x1, PVIObject.class)) {
            ((PVIObject) this.f48880x1).m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C14093tq<Byte> m70668k4() {
        return this.f48879k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70669k4(C14093tq<Byte> c14093tq) {
        if (C3085sv.m13090k4(this.f48879k4.Clone(), c14093tq.Clone())) {
            return;
        }
        c14093tq.CloneTo(this.f48879k4);
        m70667x1();
    }
}
