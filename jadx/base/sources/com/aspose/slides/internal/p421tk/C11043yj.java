package com.aspose.slides.internal.p421tk;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p026an.C1495ss;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p539z4.C13366ca;
import com.aspose.slides.internal.p539z4.C13407to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C11043yj extends AbstractC11027u4 {

    /* JADX INFO: renamed from: du */
    private C13407to[] f38377du;

    /* JADX INFO: renamed from: k4 */
    private long f38378k4;

    /* JADX INFO: renamed from: kk */
    private C13366ca f38379kk;

    /* JADX INFO: renamed from: to */
    private long f38380to;

    /* JADX INFO: renamed from: x1 */
    private int f38381x1;

    public C11043yj() {
        m53208x1((short) 16411);
    }

    /* JADX INFO: renamed from: c5 */
    public final long m53455c5() {
        return this.f38378k4;
    }

    /* JADX INFO: renamed from: ck */
    public final C13366ca m53456ck() {
        return this.f38379kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m53457dy() {
        return m53198h4(11);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
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
        return m53463k4((C11043yj) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final long m53458fa() {
        return this.f38380to;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (((((((((int) m53455c5()) * 397) ^ m53459jd()) * 397) ^ (m53456ck() != null ? m53456ck().hashCode() : 0)) * 397) ^ ((int) m53458fa())) * 397) ^ (m53468up() != null ? AbstractC14092to.m67208k4((Object) m53468up()).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final int m53459jd() {
        return this.f38381x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53460k4(long j) {
        this.f38378k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53464kk(int i) {
        this.f38381x1 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m53466m9() {
        return m53198h4(13);
    }

    /* JADX INFO: renamed from: to */
    public final byte m53467to() {
        return m53199ix();
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C13407to c13407to : m53468up()) {
            c6765kpOooO00o.m26791k4(c13407to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Compressed: {1}, ObjectId: {2}, ApplyingAnEffect: {3}, Relative: {4}, ImageAttributesId: {5}, SrcUnit: {6}, SrcRect: {7}, Count: {8}, PointData: {9}", super.toString(), Boolean.valueOf(m53465kk()), Byte.valueOf(m53467to()), Boolean.valueOf(m53466m9()), Boolean.valueOf(m53457dy()), Long.valueOf(m53455c5()), C14042ak.m66410k4(C1495ss.class, m53459jd()), m53456ck(), Long.valueOf(m53458fa()), c6765kpOooO00o);
    }

    /* JADX INFO: renamed from: up */
    public final C13407to[] m53468up() {
        return this.f38377du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53469x1(long j) {
        this.f38380to = j;
    }

    public C11043yj(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53461k4(C13366ca c13366ca) {
        this.f38379kk = c13366ca;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53465kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53462k4(C13407to[] c13407toArr) {
        this.f38377du = c13407toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53463k4(C11043yj c11043yj) {
        return m53455c5() == c11043yj.m53455c5() && m53459jd() == c11043yj.m53459jd() && C14067j2.m66728k4(m53456ck(), c11043yj.m53456ck()) && m53458fa() == c11043yj.m53458fa() && C3022m9.m12723k4(m53468up(), c11043yj.m53468up());
    }
}
