package com.aspose.slides.internal.p329p4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14091t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C7188ks {

    /* JADX INFO: renamed from: k4 */
    private long f19756k4;

    /* JADX INFO: renamed from: x1 */
    private long f19757x1;

    public C7188ks(long j, long j2) {
        m27817k4(j);
        m27818x1(j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C7019kk.m27469x1(obj, C7188ks.class)) {
            C7188ks c7188ks = (C7188ks) C7019kk.m27452k4(obj, C7188ks.class);
            if (m27819k4() == c7188ks.m27819k4() && m27820x1() == c7188ks.m27820x1()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C14091t6.m67182k4(m27820x1()) + C14091t6.m67182k4(m27819k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final long m27819k4() {
        return this.f19756k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m27820x1() {
        return this.f19757x1;
    }

    public C7188ks(C7184h4 c7184h4) {
        this(c7184h4.m27769k4().m27752kk(), c7184h4.m27773x1().m27752kk());
    }

    /* JADX INFO: renamed from: k4 */
    private void m27817k4(long j) {
        this.f19756k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    private void m27818x1(long j) {
        this.f19757x1 = j;
    }
}
