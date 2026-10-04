package com.aspose.slides.internal.p251li;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C6073qq extends AbstractC6068lr {

    /* JADX INFO: renamed from: k4 */
    private float f17198k4;

    /* JADX INFO: renamed from: kk */
    private C4657to[] f17199kk;

    /* JADX INFO: renamed from: x1 */
    private int f17200x1;

    public C6073qq() {
        m24449x1((short) 16406);
    }

    /* JADX INFO: renamed from: c5 */
    public final float m24596c5() {
        return this.f17198k4;
    }

    /* JADX INFO: renamed from: ck */
    public final C4657to[] m24597ck() {
        return this.f17199kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m24598dy() {
        return m24433h4(11);
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
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
        return m24602k4((C6073qq) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        int iMo19017h4 = 12;
        if (m24597ck() != null) {
            for (C4657to c4657to : m24597ck()) {
                iMo19017h4 += c4657to.mo19017h4();
            }
        }
        return iMo19017h4;
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int iM24578up = ((((m24578up() * 397) ^ C14064he.m66708k4(this.f17198k4)) * 397) ^ this.f17200x1) * 397;
        C4657to[] c4657toArr = this.f17199kk;
        return iM24578up ^ (c4657toArr != null ? AbstractC14092to.m67208k4((Object) c4657toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final int m24599jd() {
        return this.f17200x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24600k4(float f) {
        this.f17198k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24603kk(int i) {
        this.f17200x1 = i;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m24605to() {
        return m24433h4(13);
    }

    @Override // com.aspose.slides.internal.p251li.AbstractC6068lr, com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C4657to c4657to : m24597ck()) {
            c6765kpOooO00o.m26791k4(c4657to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Tension: {1}, Count: {2}, PointData: {3}", super.toString(), Float.valueOf(this.f17198k4), Integer.valueOf(this.f17200x1), c6765kpOooO00o);
    }

    public C6073qq(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24601k4(C4657to[] c4657toArr) {
        this.f17199kk = c4657toArr;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24604kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24602k4(C6073qq c6073qq) {
        return m24576k4((AbstractC6068lr) c6073qq) && C14064he.m66718x1(this.f17198k4, c6073qq.f17198k4) && this.f17200x1 == c6073qq.f17200x1 && C12530dy.m58334k4(this.f17199kk, c6073qq.f17199kk);
    }
}
