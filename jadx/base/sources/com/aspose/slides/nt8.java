package com.aspose.slides;

import com.aspose.slides.internal.p407st.C10380c0;
import com.aspose.slides.internal.p407st.C10399dd;
import com.aspose.slides.internal.p407st.C10542mh;
import com.aspose.slides.internal.p407st.C10668un;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class nt8 {

    /* JADX INFO: renamed from: k4 */
    private int f47610k4;

    /* JADX INFO: renamed from: kk */
    private int f47611kk;

    /* JADX INFO: renamed from: to */
    private byte f47612to;

    /* JADX INFO: renamed from: x1 */
    private long f47613x1;

    private nt8(long j, int i) {
        m68206k4(j);
        m68202x1(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m68203k4() {
        return this.f47610k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m68207kk() {
        return this.f47611kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m68208to() {
        return this.f47612to;
    }

    public String toString() {
        return C14113y2.m67408k4("placeholder [Source: ", C14042ak.m66410k4(n6p.class, m68203k4()), "|Type: ", C14042ak.m66410k4(C10380c0.class, m68207kk()), "]");
    }

    /* JADX INFO: renamed from: x1 */
    public final long m68209x1() {
        return this.f47613x1;
    }

    public nt8(C10399dd c10399dd) {
        this(0L, c10399dd.m50671x1());
        m68204k4((byte) 0);
        m68205k4(2);
    }

    /* JADX INFO: renamed from: x1 */
    private void m68202x1(int i) {
        this.f47611kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68204k4(byte b) {
        this.f47612to = b;
    }

    public nt8(C10542mh c10542mh) {
        this(0L, c10542mh.m51286x1());
        m68204k4((byte) 0);
        m68205k4(1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68205k4(int i) {
        this.f47610k4 = i;
    }

    public nt8(C10668un c10668un) {
        this(((long) c10668un.m51813x1()) & 4294967295L, c10668un.m51810kk());
        m68204k4((byte) c10668un.m51812to());
        if (m68208to() < 0) {
            m68204k4((byte) 0);
        }
        m68205k4(0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68206k4(long j) {
        this.f47613x1 = j;
    }
}
