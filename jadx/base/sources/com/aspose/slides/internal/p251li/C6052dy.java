package com.aspose.slides.internal.p251li;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6052dy extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private int f17164k4;

    /* JADX INFO: renamed from: x1 */
    private C4657to[] f17165x1;

    public C6052dy() {
        m24449x1((short) 16409);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m24487c5() {
        return this.f17164k4;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m24488dy() {
        return m24447wl();
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
        return m24491k4((C6052dy) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        int iMo19017h4 = 4;
        if (this.f17165x1 != null) {
            for (C4657to c4657to : m24489jd()) {
                iMo19017h4 += c4657to.mo19017h4();
            }
        }
        return iMo19017h4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int i = this.f17164k4 * 397;
        C4657to[] c4657toArr = this.f17165x1;
        return i ^ (c4657toArr != null ? AbstractC14092to.m67208k4((Object) c4657toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C4657to[] m24489jd() {
        return this.f17165x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24490k4(C4657to[] c4657toArr) {
        this.f17165x1 = c4657toArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24492kk(int i) {
        this.f17164k4 = i;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m24494to() {
        return m24433h4(11);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C4657to c4657to : this.f17165x1) {
            c6765kpOooO00o.m26791k4(c4657to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Count: {1}, PointData: {2}", super.toString(), Integer.valueOf(this.f17164k4), c6765kpOooO00o);
    }

    public C6052dy(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24491k4(C6052dy c6052dy) {
        return this.f17164k4 == c6052dy.f17164k4 && C12530dy.m58334k4(this.f17165x1, c6052dy.f17165x1);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24493kk() {
        return m24433h4(14);
    }
}
