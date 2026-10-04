package com.aspose.slides.internal.p251li;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6063jd extends AbstractC6084u4 {

    /* JADX INFO: renamed from: du */
    private C4657to[] f17179du;

    /* JADX INFO: renamed from: k4 */
    private int f17180k4;

    /* JADX INFO: renamed from: kk */
    private float f17181kk;

    /* JADX INFO: renamed from: to */
    private int f17182to;

    /* JADX INFO: renamed from: x1 */
    private int f17183x1;

    public C6063jd() {
        m24449x1((short) 16408);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m24535c5() {
        return this.f17180k4;
    }

    /* JADX INFO: renamed from: ck */
    public final int m24536ck() {
        return this.f17182to;
    }

    /* JADX INFO: renamed from: du */
    public final void m24537du(int i) {
        this.f17182to = i;
    }

    /* JADX INFO: renamed from: dy */
    public final float m24538dy() {
        return this.f17181kk;
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
        return m24543k4((C6063jd) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final C4657to[] m24539fa() {
        return this.f17179du;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        int iMo19017h4 = 16;
        if (this.f17179du != null) {
            for (C4657to c4657to : m24539fa()) {
                iMo19017h4 += c4657to.mo19017h4();
            }
        }
        return iMo19017h4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int iM66708k4 = ((((((this.f17180k4 * 397) ^ this.f17183x1) * 397) ^ C14064he.m66708k4(this.f17181kk)) * 397) ^ this.f17182to) * 397;
        C4657to[] c4657toArr = this.f17179du;
        return iM66708k4 ^ (c4657toArr != null ? AbstractC14092to.m67208k4((Object) c4657toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final int m24540jd() {
        return this.f17183x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24541k4(float f) {
        this.f17181kk = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24544kk(int i) {
        this.f17180k4 = i;
    }

    /* JADX INFO: renamed from: to */
    public final byte m24546to() {
        return m24447wl();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C4657to c4657to : this.f17179du) {
            c6765kpOooO00o.m26791k4(c4657to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Offset: {1}, NumSegments: {2}, Tension: {3}, Count: {4}, PointData: {5}", super.toString(), Integer.valueOf(this.f17180k4), Integer.valueOf(this.f17183x1), Float.valueOf(this.f17181kk), Integer.valueOf(this.f17182to), c6765kpOooO00o);
    }

    public C6063jd(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24542k4(C4657to[] c4657toArr) {
        this.f17179du = c4657toArr;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24545kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: to */
    public final void m24547to(int i) {
        this.f17183x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24543k4(C6063jd c6063jd) {
        return this.f17180k4 == c6063jd.f17180k4 && this.f17183x1 == c6063jd.f17183x1 && C14064he.m66718x1(this.f17181kk, c6063jd.f17181kk) && this.f17182to == c6063jd.f17182to && C12530dy.m58334k4(this.f17179du, c6063jd.f17179du);
    }
}
