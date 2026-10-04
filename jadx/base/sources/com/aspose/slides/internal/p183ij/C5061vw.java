package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p058c7.C1988k4;
import com.aspose.slides.internal.p360qg.C9877yj;
import com.aspose.slides.internal.p374qz.C9966k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.vw */
/* JADX INFO: loaded from: classes.dex */
public class C5061vw extends C1988k4 {

    /* JADX INFO: renamed from: k4 */
    private C9966k4 f13895k4;

    /* JADX INFO: renamed from: kk */
    private int f13896kk;

    /* JADX INFO: renamed from: to */
    private long f13897to;

    /* JADX INFO: renamed from: x1 */
    private long f13898x1;

    public C5061vw() {
    }

    /* JADX INFO: renamed from: bv */
    public final C9966k4 m21555bv() {
        return this.f13895k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m21556c5(int i) {
        this.f13896kk = i;
    }

    /* JADX INFO: renamed from: ck */
    public final void m21557ck(long j) {
        this.f13898x1 = j;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m21559k4((C5061vw) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final void m21558fa(long j) {
        this.f13897to = j;
    }

    public int hashCode() {
        return (((int) this.f13898x1) * 397) ^ this.f13896kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21559k4(C5061vw c5061vw) {
        return this.f13898x1 == c5061vw.f13898x1 && this.f13896kk == c5061vw.f13896kk && this.f13897to == c5061vw.f13897to;
    }

    /* JADX INFO: renamed from: lr */
    public final int m21560lr() {
        return this.f13896kk;
    }

    public String toString() {
        return C14113y2.m67402k4("Type: {0}, Size: {1}, Offset: {2}", C14042ak.m66410k4(C9877yj.class, this.f13898x1), Integer.valueOf(this.f13896kk), Long.valueOf(this.f13897to));
    }

    /* JADX INFO: renamed from: v4 */
    public final long m21561v4() {
        return this.f13898x1;
    }

    public C5061vw(C5061vw c5061vw) {
        this.f13895k4 = c5061vw.f13895k4;
        m21556c5(c5061vw.m21560lr());
        m21557ck(c5061vw.m21561v4());
        m21558fa(c5061vw.f13897to);
    }

    public C5061vw(C9966k4 c9966k4) {
        this.f13895k4 = c9966k4;
    }
}
