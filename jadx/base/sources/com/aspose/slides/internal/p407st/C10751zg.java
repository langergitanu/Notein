package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14088s7;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.zg */
/* JADX INFO: loaded from: classes4.dex */
public final class C10751zg implements Comparable<C10751zg> {

    /* JADX INFO: renamed from: k4 */
    C10475i3 f37568k4;

    /* JADX INFO: renamed from: kk */
    private int f37569kk;

    /* JADX INFO: renamed from: x1 */
    private short f37570x1;

    public C10751zg(C3134k4 c3134k4) {
        m52140k4(c3134k4);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C10751zg c10751zg) {
        return C14088s7.m67174k4(m52139k4(), c10751zg.m52139k4());
    }

    /* JADX INFO: renamed from: kk */
    public final int m52143kk() {
        return this.f37569kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10475i3 m52144x1() {
        return this.f37568k4;
    }

    public C10751zg(short s, int i) {
        this.f37570x1 = s;
        this.f37569kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final short m52139k4() {
        return this.f37570x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52140k4(C3134k4 c3134k4) {
        this.f37570x1 = c3134k4.m13381rv();
        this.f37569kk = c3134k4.m13382u4() & 65535;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52141k4(C3149x1 c3149x1) {
        c3149x1.m13448k4(this.f37570x1);
        c3149x1.m13446k4(this.f37569kk & 65535);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52142k4(C10475i3 c10475i3) {
        this.f37568k4 = c10475i3;
    }
}
