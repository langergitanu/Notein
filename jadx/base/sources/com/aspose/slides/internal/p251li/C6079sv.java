package com.aspose.slides.internal.p251li;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C6079sv extends AbstractC6048ca {

    /* JADX INFO: renamed from: k4 */
    private long f17204k4;

    public C6079sv() {
        m24449x1((short) 16422);
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
        return m24623k4((C6079sv) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) m24624kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24622k4(long j) {
        this.f17204k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final long m24624kk() {
        return this.f17204k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, StackIndex: {1}", super.toString(), Long.valueOf(m24624kk()));
    }

    public C6079sv(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24623k4(C6079sv c6079sv) {
        return m24438k4((C6045bz) c6079sv) && m24624kk() == c6079sv.m24624kk();
    }
}
