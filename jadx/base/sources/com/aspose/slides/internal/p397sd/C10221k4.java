package com.aspose.slides.internal.p397sd;

import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3152yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10221k4 {

    /* JADX INFO: renamed from: k4 */
    private C3123ar f36625k4;

    /* JADX INFO: renamed from: kk */
    private int f36626kk;

    /* JADX INFO: renamed from: x1 */
    private byte f36627x1;

    public C10221k4() {
        C3123ar c3123ar = new C3123ar(new C3152yj());
        this.f36625k4 = c3123ar;
        c3123ar.m13305k4(true);
        this.f36626kk = 0;
        this.f36627x1 = (byte) 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50064k4() {
        if (this.f36626kk > 0) {
            this.f36625k4.m13301k4().writeByte(this.f36627x1);
            this.f36627x1 = (byte) 0;
            this.f36626kk = 0;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m50068x1() {
        return ((C3152yj) this.f36625k4.m13301k4()).toArray();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50065k4(int i) {
        int i2 = this.f36627x1 & 255;
        int i3 = this.f36626kk;
        this.f36627x1 = (byte) ((((byte) (i << (7 - i3))) & 255) | i2);
        int i4 = i3 + 1;
        this.f36626kk = i4;
        if (i4 == 8) {
            this.f36625k4.m13301k4().writeByte(this.f36627x1);
            this.f36627x1 = (byte) 0;
            this.f36626kk = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50066k4(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            m50065k4((i >> i3) & 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50067k4(boolean z) {
        m50065k4(z ? 1 : 0);
    }
}
