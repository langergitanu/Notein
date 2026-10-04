package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.q1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10598q1 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC10716xo f37300k4;

    public C10598q1(C3134k4 c3134k4) {
        m51544k4(c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C14047bz m51543k4() {
        return this.f37300k4.mo50989k4();
    }

    /* JADX INFO: renamed from: kk */
    public final long m51546kk() {
        return ((this.f37300k4.mo50992kk() & 4294967295L) + 20) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC10716xo m51547x1() {
        return this.f37300k4;
    }

    public C10598q1(AbstractC10716xo abstractC10716xo) {
        if (abstractC10716xo == null) {
            throw new ArgumentNullException("moniker");
        }
        this.f37300k4 = abstractC10716xo;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51544k4(C3134k4 c3134k4) {
        this.f37300k4 = C10517kw.m51143k4(new C14047bz(c3134k4.m13372dy(16)).Clone(), c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51545k4(C3149x1 c3149x1) {
        c3149x1.m13450k4(m51543k4().m66539k4());
        this.f37300k4.mo50991k4(c3149x1);
    }
}
