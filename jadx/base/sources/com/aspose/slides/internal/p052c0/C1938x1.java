package com.aspose.slides.internal.p052c0;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.c0.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1938x1 {

    /* JADX INFO: renamed from: c5 */
    private short f6892c5;

    /* JADX INFO: renamed from: du */
    private short f6893du;

    /* JADX INFO: renamed from: dy */
    private long f6894dy;

    /* JADX INFO: renamed from: h4 */
    private short f6895h4;

    /* JADX INFO: renamed from: k4 */
    private long f6896k4;

    /* JADX INFO: renamed from: kk */
    private short f6897kk;

    /* JADX INFO: renamed from: m9 */
    private short f6898m9;

    /* JADX INFO: renamed from: to */
    private short f6899to;

    /* JADX INFO: renamed from: x1 */
    private short f6900x1;

    /* JADX INFO: renamed from: to */
    private void m10000to() {
        long j = this.f6896k4;
        short s = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) ((j & 4294901760L) >> 16)) ^ ((short) (j & C18177fb.f54859s)))) ^ this.f6900x1)) ^ this.f6897kk)) ^ this.f6899to)) ^ this.f6893du)) ^ this.f6895h4)) ^ this.f6898m9);
        long j2 = this.f6894dy;
        if (((short) (((short) (s ^ ((short) (j2 & C18177fb.f54859s)))) ^ ((short) ((j2 & 4294901760L) >> 16)))) != this.f6892c5) {
            throw new InvalidOperationException("Metafile checksum is invalid.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10001k4(C3134k4 c3134k4) {
        this.f6896k4 = c3134k4.m13384uz();
        this.f6900x1 = c3134k4.m13381rv();
        this.f6897kk = c3134k4.m13381rv();
        this.f6899to = c3134k4.m13381rv();
        this.f6893du = c3134k4.m13381rv();
        this.f6895h4 = c3134k4.m13381rv();
        this.f6898m9 = c3134k4.m13381rv();
        this.f6894dy = c3134k4.m13384uz();
        this.f6892c5 = c3134k4.m13381rv();
        m10000to();
    }

    /* JADX INFO: renamed from: kk */
    public final int m10003kk() {
        return this.f6898m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12007ix m10004x1() {
        return new C12007ix(0.0f, 0.0f, this.f6893du - this.f6897kk, this.f6895h4 - this.f6899to);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m10002k4() {
        return this.f6893du - this.f6897kk > 0 && this.f6895h4 - this.f6899to > 0;
    }
}
