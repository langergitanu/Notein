package com.aspose.slides;

import com.aspose.slides.internal.p407st.C10593po;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class zlb {

    /* JADX INFO: renamed from: k4 */
    private C10626rv f50592k4 = null;

    /* JADX INFO: renamed from: com.aspose.slides.zlb$k4 */
    public static abstract class AbstractC14894k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo6736k4(C10626rv c10626rv);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74562k4(C10593po c10593po) {
        if (c10593po.m51500ix() == null) {
            return;
        }
        this.f50592k4 = new C10626rv(c10593po.m51500ix().m51659x1(), c10593po.m51500ix().m51408lr());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74566x1() {
        this.f50592k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74563k4(AbstractC14894k4 abstractC14894k4) {
        C10626rv c10626rv = this.f50592k4;
        if (c10626rv == null) {
            return;
        }
        abstractC14894k4.mo6736k4(c10626rv);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m74567x1(String str) {
        C10626rv c10626rv;
        if (C14113y2.m67411k4(str) || (c10626rv = this.f50592k4) == null) {
            return false;
        }
        return C14113y2.m67363du(c10626rv.m51659x1(), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74564k4(String str) {
        this.f50592k4 = new C10626rv(str, (short) 3);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m74565k4() {
        return this.f50592k4 != null;
    }
}
