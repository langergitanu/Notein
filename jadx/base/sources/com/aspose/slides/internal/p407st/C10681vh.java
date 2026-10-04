package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.vh */
/* JADX INFO: loaded from: classes4.dex */
public class C10681vh {

    /* JADX INFO: renamed from: k4 */
    private long f37444k4;

    /* JADX INFO: renamed from: k4 */
    public static C10681vh m51849k4(AbstractC3150x6 abstractC3150x6) {
        C10681vh c10681vh = new C10681vh();
        c10681vh.m51850k4(((long) C3110yd.m13255x1(abstractC3150x6)) & 4294967295L);
        return c10681vh;
    }

    /* JADX INFO: renamed from: kk */
    public final long m51853kk() {
        return this.f37444k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51854x1(boolean z) {
        long j;
        long jM51853kk = m51853kk();
        if (z) {
            j = 4294967295L;
            jM51853kk = (jM51853kk & 4294967295L) | 8;
        } else {
            j = 4294967287L;
        }
        m51850k4(jM51853kk & j);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51850k4(long j) {
        this.f37444k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m51855x1() {
        return 0 != (m51853kk() & 16);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51851k4(boolean z) {
        long j;
        long jM51853kk = m51853kk();
        if (z) {
            j = 4294967295L;
            jM51853kk = (jM51853kk & 4294967295L) | 4;
        } else {
            j = 4294967291L;
        }
        m51850k4(jM51853kk & j);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m51852k4() {
        return 0 != (m51853kk() & 8);
    }
}
