package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14098up;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.rq */
/* JADX INFO: loaded from: classes4.dex */
public class C9698rq {

    /* JADX INFO: renamed from: k4 */
    private long f35075k4;

    /* JADX INFO: renamed from: kk */
    private byte f35076kk;

    /* JADX INFO: renamed from: to */
    private byte f35077to;

    /* JADX INFO: renamed from: x1 */
    private int f35078x1;

    public C9698rq(long j) {
        m47612k4(j);
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
        return m47613k4((C9698rq) obj);
    }

    public int hashCode() {
        return (((((((int) this.f35075k4) * 397) ^ C14081nv.m67061k4(this.f35078x1)) * 397) ^ C14098up.m67317k4(this.f35076kk)) * 397) ^ C14098up.m67317k4(this.f35077to);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47611k4() {
        return this.f35075k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47612k4(long j) {
        this.f35075k4 = j;
        this.f35078x1 = (int) (C18177fb.f54859s & j);
        this.f35076kk = (byte) (((16711680 & j) >> 16) & 4294967295L);
        this.f35077to = (byte) (((j & 4278190080L) >> 24) & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47613k4(C9698rq c9698rq) {
        return this.f35075k4 == c9698rq.f35075k4 && this.f35078x1 == c9698rq.f35078x1 && this.f35076kk == c9698rq.f35076kk && this.f35077to == c9698rq.f35077to;
    }
}
