package com.aspose.slides.internal.p251li;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6046c5 extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private float f17151k4;

    /* JADX INFO: renamed from: kk */
    private C4657to[] f17152kk;

    /* JADX INFO: renamed from: x1 */
    private int f17153x1;

    public C6046c5() {
        m24449x1((short) 16407);
    }

    /* JADX INFO: renamed from: c5 */
    public final float m24451c5() {
        return this.f17151k4;
    }

    /* JADX INFO: renamed from: ck */
    public final C4657to[] m24452ck() {
        return this.f17152kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m24453dy() {
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
        return m24457k4((C6046c5) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        int iMo19017h4 = 8;
        if (this.f17152kk != null) {
            for (C4657to c4657to : m24452ck()) {
                iMo19017h4 += c4657to.mo19017h4();
            }
        }
        return iMo19017h4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int iM66708k4 = ((C14064he.m66708k4(this.f17151k4) * 397) ^ this.f17153x1) * 397;
        C4657to[] c4657toArr = this.f17152kk;
        return iM66708k4 ^ (c4657toArr != null ? AbstractC14092to.m67208k4((Object) c4657toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final int m24454jd() {
        return this.f17153x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24455k4(float f) {
        this.f17151k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m24458kk() {
        return m24447wl();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m24460to() {
        return m24433h4(14);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C4657to c4657to : this.f17152kk) {
            c6765kpOooO00o.m26791k4(c4657to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Tension: {1}, Count: {2}, PointData: {3}", super.toString(), Float.valueOf(this.f17151k4), Integer.valueOf(this.f17153x1), c6765kpOooO00o);
    }

    public C6046c5(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24456k4(C4657to[] c4657toArr) {
        this.f17152kk = c4657toArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24459kk(int i) {
        this.f17153x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24457k4(C6046c5 c6046c5) {
        return C14064he.m66718x1(this.f17151k4, c6046c5.f17151k4) && this.f17153x1 == c6046c5.f17153x1 && C12530dy.m58334k4(this.f17152kk, c6046c5.f17152kk);
    }
}
