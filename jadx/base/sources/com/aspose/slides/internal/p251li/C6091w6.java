package com.aspose.slides.internal.p251li;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.w6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6091w6 extends AbstractC6053e0 {

    /* JADX INFO: renamed from: k4 */
    private long f17216k4;

    /* JADX INFO: renamed from: x1 */
    private long f17217x1;

    public C6091w6() {
        m24449x1((short) 16413);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
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
        return m24669k4((C6091w6) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 8;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (((super.hashCode() * 397) ^ ((int) m24670kk())) * 397) ^ ((int) m24671to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24668k4(long j) {
        this.f17216k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final long m24670kk() {
        return this.f17216k4;
    }

    /* JADX INFO: renamed from: to */
    public final long m24671to() {
        return this.f17217x1;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, X: {1}, Y: {2}", super.toString(), Long.valueOf(m24670kk()), Long.valueOf(m24671to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24672x1(long j) {
        this.f17217x1 = j;
    }

    public C6091w6(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24669k4(C6091w6 c6091w6) {
        return m24438k4((C6045bz) c6091w6) && m24670kk() == c6091w6.m24670kk() && m24671to() == c6091w6.m24671to();
    }
}
