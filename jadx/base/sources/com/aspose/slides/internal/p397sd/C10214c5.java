package com.aspose.slides.internal.p397sd;

import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10214c5 {

    /* JADX INFO: renamed from: k4 */
    private C3123ar f36598k4;

    /* JADX INFO: renamed from: kk */
    private int f36599kk;

    /* JADX INFO: renamed from: x1 */
    private byte f36600x1;

    public C10214c5() {
        C3123ar c3123ar = new C3123ar(new C3152yj());
        this.f36598k4 = c3123ar;
        c3123ar.m13305k4(true);
        this.f36599kk = 0;
        this.f36600x1 = (byte) 0;
    }

    /* JADX INFO: renamed from: x1 */
    private void m50014x1(int i) {
        int i2 = this.f36600x1 & 255;
        int i3 = this.f36599kk;
        this.f36600x1 = (byte) ((((byte) (i << i3)) & 255) | i2);
        int i4 = i3 + 1;
        this.f36599kk = i4;
        if (i4 == 8) {
            this.f36598k4.m13301k4().writeByte(this.f36600x1);
            this.f36600x1 = (byte) 0;
            this.f36599kk = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50015k4() {
        if (this.f36599kk > 0) {
            this.f36598k4.m13301k4().writeByte(this.f36600x1);
            this.f36600x1 = (byte) 0;
            this.f36599kk = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50016k4(int i) {
        if (i == 0) {
            m50014x1(0);
            return;
        }
        int iM67482k4 = C14116yg.m67482k4(i);
        for (int i2 = 0; i2 < iM67482k4; i2++) {
            m50014x1(1);
        }
        m50014x1(0);
        m50014x1(i <= 0 ? 1 : 0);
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m50017x1() {
        return ((C3152yj) this.f36598k4.m13301k4()).toArray();
    }
}
