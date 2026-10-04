package com.aspose.slides.internal.p251li;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6095x1 extends AbstractC6048ca {

    /* JADX INFO: renamed from: k4 */
    private long f17219k4;

    public C6095x1() {
        m24449x1((short) 16424);
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
        return m24679k4((C6095x1) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (int) m24677k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m24677k4() {
        return this.f17219k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, StackIndex: {1}", super.toString(), Long.valueOf(m24677k4()));
    }

    public C6095x1(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24678k4(long j) {
        this.f17219k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24679k4(C6095x1 c6095x1) {
        return m24677k4() == c6095x1.m24677k4();
    }
}
