package com.aspose.slides.internal.p251li;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p396sc.C10197ss;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C6100yj extends AbstractC6084u4 {

    /* JADX INFO: renamed from: du */
    private C4657to[] f17228du;

    /* JADX INFO: renamed from: k4 */
    private long f17229k4;

    /* JADX INFO: renamed from: kk */
    private C4616ca f17230kk;

    /* JADX INFO: renamed from: to */
    private long f17231to;

    /* JADX INFO: renamed from: x1 */
    private int f17232x1;

    public C6100yj() {
        m24449x1((short) 16411);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m24711c5() {
        return m24433h4(11);
    }

    /* JADX INFO: renamed from: ck */
    public final int m24712ck() {
        return this.f17232x1;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m24713dy() {
        return m24433h4(13);
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
        return m24721k4((C6100yj) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final C4616ca m24714fa() {
        return this.f17230kk;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        int iMo19017h4 = m24714fa().mo19017h4() + 12;
        if (m24729yj() != null) {
            for (C4657to c4657to : m24729yj()) {
                iMo19017h4 += c4657to.mo19017h4();
            }
        }
        return iMo19017h4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (((((((((int) m24715jd()) * 397) ^ m24712ck()) * 397) ^ (m24714fa() != null ? m24714fa().hashCode() : 0)) * 397) ^ ((int) m24726up())) * 397) ^ (m24729yj() != null ? AbstractC14092to.m67208k4((Object) m24729yj()).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final long m24715jd() {
        return this.f17229k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24716k4(byte b) {
        m24444to(b);
    }

    /* JADX INFO: renamed from: kk */
    public final void m24722kk(int i) {
        this.f17232x1 = i;
    }

    /* JADX INFO: renamed from: to */
    public final byte m24725to() {
        return m24447wl();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C4657to c4657to : m24729yj()) {
            c6765kpOooO00o.m26791k4(c4657to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Compressed: {1}, ObjectId: {2}, ApplyingAnEffect: {3}, Relative: {4}, ImageAttributesId: {5}, SrcUnit: {6}, SrcRect: {7}, Count: {8}, PointData: {9}", super.toString(), Boolean.valueOf(m24724kk()), Byte.valueOf(m24725to()), Boolean.valueOf(m24713dy()), Boolean.valueOf(m24711c5()), Long.valueOf(m24715jd()), C14042ak.m66410k4(C10197ss.class, m24712ck()), m24714fa(), Long.valueOf(m24726up()), c6765kpOooO00o);
    }

    /* JADX INFO: renamed from: up */
    public final long m24726up() {
        return this.f17231to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24727x1(long j) {
        this.f17231to = j;
    }

    /* JADX INFO: renamed from: yj */
    public final C4657to[] m24729yj() {
        return this.f17228du;
    }

    public C6100yj(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24717k4(long j) {
        this.f17229k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24723kk(boolean z) {
        m24436k4(11, z);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24728x1(boolean z) {
        m24436k4(13, z);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24718k4(C4616ca c4616ca) {
        this.f17230kk = c4616ca;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24724kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24719k4(boolean z) {
        m24436k4(14, z);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24720k4(C4657to[] c4657toArr) {
        this.f17228du = c4657toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24721k4(C6100yj c6100yj) {
        return m24715jd() == c6100yj.m24715jd() && m24712ck() == c6100yj.m24712ck() && C14067j2.m66728k4(m24714fa(), c6100yj.m24714fa()) && m24726up() == c6100yj.m24726up() && C12530dy.m58334k4(m24729yj(), c6100yj.m24729yj());
    }
}
