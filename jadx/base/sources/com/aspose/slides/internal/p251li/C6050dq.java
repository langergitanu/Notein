package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.C4680yo;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.dq */
/* JADX INFO: loaded from: classes4.dex */
public class C6050dq extends AbstractC6043bs {

    /* JADX INFO: renamed from: k4 */
    private C4680yo f17162k4;

    public C6050dq() {
        m24449x1((short) 16428);
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
        return m24481k4((C6050dq) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return m24483to().mo19017h4();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        if (m24483to() != null) {
            return m24483to().hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24480k4(C4680yo c4680yo) {
        this.f17162k4 = c4680yo;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24482kk() {
        return m24433h4(13);
    }

    /* JADX INFO: renamed from: to */
    public final C4680yo m24483to() {
        return this.f17162k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PostMultipledMatrix: {1}, MatrixData: {2}", super.toString(), Boolean.valueOf(m24482kk()), m24483to());
    }

    public C6050dq(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24481k4(C6050dq c6050dq) {
        return C14067j2.m66728k4(m24483to(), c6050dq.m24483to());
    }
}
