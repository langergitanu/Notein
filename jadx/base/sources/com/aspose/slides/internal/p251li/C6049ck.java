package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.C4680yo;
import com.aspose.slides.internal.p171hq.C4681zj;
import com.aspose.slides.internal.p396sc.C10186jd;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C6049ck extends AbstractC6084u4 {

    /* JADX INFO: renamed from: du */
    private short[] f17154du;

    /* JADX INFO: renamed from: dy */
    private String f17155dy;

    /* JADX INFO: renamed from: h4 */
    private long f17156h4;

    /* JADX INFO: renamed from: k4 */
    private int f17157k4;

    /* JADX INFO: renamed from: kk */
    private int f17158kk;

    /* JADX INFO: renamed from: m9 */
    private C4680yo f17159m9;

    /* JADX INFO: renamed from: to */
    private C4681zj[] f17160to;

    /* JADX INFO: renamed from: x1 */
    private long f17161x1;

    public C6049ck(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m24461c5() {
        return this.f17158kk;
    }

    /* JADX INFO: renamed from: ck */
    public final short[] m24462ck() {
        return this.f17154du;
    }

    /* JADX INFO: renamed from: dy */
    public final long m24463dy() {
        return this.f17161x1;
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
        return m24471k4((C6049ck) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final String m24464fa() {
        return this.f17155dy;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int i = ((((this.f17157k4 * 397) ^ ((int) this.f17161x1)) * 397) ^ this.f17158kk) * 397;
        C4681zj[] c4681zjArr = this.f17160to;
        int iHashCode = (i ^ (c4681zjArr != null ? AbstractC14092to.m67208k4((Object) c4681zjArr).hashCode() : 0)) * 397;
        short[] sArr = this.f17154du;
        int iHashCode2 = (((iHashCode ^ (sArr != null ? AbstractC14092to.m67208k4((Object) sArr).hashCode() : 0)) * 397) ^ ((int) this.f17156h4)) * 397;
        C4680yo c4680yo = this.f17159m9;
        return ((iHashCode2 ^ (c4680yo != null ? c4680yo.hashCode() : 0)) * 397) ^ (m24464fa() != null ? m24464fa().hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C4681zj[] m24465jd() {
        return this.f17160to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24466k4(long j) {
        this.f17161x1 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m24472kk() {
        return m24447wl();
    }

    /* JADX INFO: renamed from: ks */
    public final C4680yo m24474ks() {
        return this.f17159m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m24475to() {
        return this.f17157k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, ObjectId: {1}, BrushId: {2}, DriverStringOptionsFlags: {3}, GlyphCount: {4}, GlyphPos: {5}, Glyphs: {6}, GlyphsString: {7}, IsColor: {8}, MatrixPresent: {9}, TransformMatrix: {10}", super.toString(), Byte.valueOf(m24472kk()), Integer.valueOf(m24475to()), C14042ak.m66410k4(C10186jd.class, m24463dy()), Integer.valueOf(m24461c5()), m24465jd(), m24462ck(), m24464fa(), Boolean.valueOf(m24477up()), Long.valueOf(m24479yj()), m24474ks());
    }

    /* JADX INFO: renamed from: up */
    public final boolean m24477up() {
        return m24433h4(15);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24478x1(long j) {
        this.f17156h4 = j;
    }

    /* JADX INFO: renamed from: yj */
    public final long m24479yj() {
        return this.f17156h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24467k4(C4680yo c4680yo) {
        this.f17159m9 = c4680yo;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24473kk(int i) {
        this.f17157k4 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m24476to(int i) {
        this.f17158kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24468k4(String str) {
        this.f17155dy = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24469k4(C4681zj[] c4681zjArr) {
        this.f17160to = c4681zjArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24470k4(short[] sArr) {
        this.f17154du = sArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24471k4(C6049ck c6049ck) {
        return this.f17157k4 == c6049ck.f17157k4 && this.f17161x1 == c6049ck.f17161x1 && this.f17158kk == c6049ck.f17158kk && C12530dy.m58334k4(this.f17160to, c6049ck.f17160to) && C12530dy.m58335k4(this.f17154du, c6049ck.f17154du) && this.f17156h4 == c6049ck.f17156h4 && C14067j2.m66728k4(this.f17159m9, c6049ck.f17159m9) && C14113y2.m67363du(m24464fa(), c6049ck.m24464fa());
    }
}
