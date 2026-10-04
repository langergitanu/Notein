package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14098up;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.rq */
/* JADX INFO: loaded from: classes.dex */
public class C5036rq {

    /* JADX INFO: renamed from: k4 */
    private long f13828k4;

    /* JADX INFO: renamed from: kk */
    private byte f13829kk;

    /* JADX INFO: renamed from: to */
    private byte f13830to;

    /* JADX INFO: renamed from: x1 */
    private int f13831x1;

    public C5036rq(long j) {
        m21415k4(j);
    }

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
        return m21416k4((C5036rq) obj);
    }

    public int hashCode() {
        return (((((((int) this.f13828k4) * 397) ^ C14081nv.m67061k4(this.f13831x1)) * 397) ^ C14098up.m67317k4(this.f13829kk)) * 397) ^ C14098up.m67317k4(this.f13830to);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21415k4(long j) {
        this.f13828k4 = j;
        this.f13831x1 = (int) (C18177fb.f54859s & j);
        this.f13829kk = (byte) (((16711680 & j) >> 16) & 4294967295L);
        this.f13830to = (byte) (((j & 4278190080L) >> 24) & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21416k4(C5036rq c5036rq) {
        return this.f13828k4 == c5036rq.f13828k4 && this.f13831x1 == c5036rq.f13831x1 && this.f13829kk == c5036rq.f13829kk && this.f13830to == c5036rq.f13830to;
    }
}
