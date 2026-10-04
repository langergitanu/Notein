package com.aspose.slides.internal.p251li;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C6067ks extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private long f17190k4;

    /* JADX INFO: renamed from: x1 */
    private C4657to[] f17191x1;

    public C6067ks() {
        m24449x1((short) 16397);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m24565c5() {
        return m24433h4(13);
    }

    /* JADX INFO: renamed from: ck */
    public final C4657to[] m24566ck() {
        return this.f17191x1;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m24567dy() {
        return m24433h4(11);
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
        return m24571k4((C6067ks) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        int iMo19017h4 = 4;
        if (m24566ck() != null) {
            for (C4657to c4657to : m24566ck()) {
                iMo19017h4 += c4657to.mo19017h4();
            }
        }
        return iMo19017h4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int i = ((int) this.f17190k4) * 397;
        C4657to[] c4657toArr = this.f17191x1;
        return i ^ (c4657toArr != null ? AbstractC14092to.m67208k4((Object) c4657toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final long m24568jd() {
        return this.f17190k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24569k4(long j) {
        this.f17190k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m24572kk() {
        return m24447wl();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m24573to() {
        return m24433h4(14);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C4657to c4657to : m24566ck()) {
            c6765kpOooO00o.m26791k4(c4657to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Count: {1}, PointData: {2}", super.toString(), Long.valueOf(this.f17190k4), c6765kpOooO00o);
    }

    public C6067ks(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24570k4(C4657to[] c4657toArr) {
        this.f17191x1 = c4657toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24571k4(C6067ks c6067ks) {
        return this.f17190k4 == c6067ks.f17190k4 && C12530dy.m58334k4(this.f17191x1, c6067ks.f17191x1);
    }
}
