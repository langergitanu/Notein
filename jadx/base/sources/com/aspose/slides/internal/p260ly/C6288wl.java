package com.aspose.slides.internal.p260ly;

import com.aspose.slides.internal.p124f7.C3874to;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C6288wl extends AbstractC6280ne {

    /* JADX INFO: renamed from: c5 */
    private boolean f17867c5 = false;

    /* JADX INFO: renamed from: ck */
    private AbstractC6747ar f17868ck = AbstractC6747ar.m26644to(0);

    /* JADX INFO: renamed from: du */
    private C12350uz f17869du;

    /* JADX INFO: renamed from: dy */
    private long[] f17870dy;

    /* JADX INFO: renamed from: h4 */
    private long f17871h4;

    /* JADX INFO: renamed from: jd */
    private String f17872jd;

    /* JADX INFO: renamed from: k4 */
    private C12343ne f17873k4;

    /* JADX INFO: renamed from: kk */
    private long f17874kk;

    /* JADX INFO: renamed from: m9 */
    private byte[] f17875m9;

    /* JADX INFO: renamed from: to */
    private long f17876to;

    /* JADX INFO: renamed from: x1 */
    private long f17877x1;

    /* JADX INFO: renamed from: c5 */
    public final String m25664c5() {
        if (!this.f17867c5) {
            this.f17872jd = this.f17868ck.m26681x1(this.f17875m9);
            this.f17867c5 = true;
        }
        return this.f17872jd;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC6747ar m25665ck() {
        return this.f17868ck;
    }

    /* JADX INFO: renamed from: dy */
    public final byte[] m25666dy() {
        return this.f17875m9;
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
        return m25677k4((C6288wl) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final long[] m25667fa() {
        return this.f17870dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12350uz m25668h4() {
        return this.f17869du;
    }

    public int hashCode() {
        C12343ne c12343ne = this.f17873k4;
        int iHashCode = (((((((c12343ne != null ? c12343ne.hashCode() : 0) * 397) ^ ((int) this.f17877x1)) * 397) ^ ((int) this.f17874kk)) * 397) ^ ((int) this.f17876to)) * 397;
        C12350uz c12350uz = this.f17869du;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f17871h4)) * 397;
        byte[] bArr = this.f17875m9;
        int iHashCode3 = (iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        long[] jArr = this.f17870dy;
        return iHashCode3 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final int m25669jd() {
        return this.f17868ck.mo26673ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12343ne m25670k4() {
        return this.f17873k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m25678kk() {
        return this.f17874kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m25680m9() {
        return this.f17871h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m25681to() {
        return this.f17876to;
    }

    public String toString() {
        return C14113y2.m67402k4("[Reference: {0}, Chars: {1}, OffString: {2}, Options: {3}, Rectangle: {4}, OffDx: {5}, StringBuffer: {6}, DxBuffer: {7}]", m25670k4(), Long.valueOf(m25683x1()), Long.valueOf(m25678kk()), C14042ak.m66410k4(C3874to.class, m25681to()), m25668h4(), Long.valueOf(m25680m9()), m25664c5(), m25667fa());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m25683x1() {
        return this.f17877x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25671k4(int i) {
        if (i != this.f17868ck.mo26673ks()) {
            this.f17868ck = AbstractC6747ar.m26644to(i);
            this.f17867c5 = false;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m25679kk(long j) {
        this.f17876to = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m25682to(long j) {
        this.f17871h4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25684x1(long j) {
        this.f17874kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25672k4(long j) {
        this.f17877x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25673k4(C12343ne c12343ne) {
        this.f17873k4 = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25674k4(C12350uz c12350uz) {
        this.f17869du = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25675k4(byte[] bArr) {
        this.f17867c5 = false;
        this.f17875m9 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25676k4(long[] jArr) {
        this.f17870dy = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25677k4(C6288wl c6288wl) {
        return C14067j2.m66728k4(this.f17873k4, c6288wl.f17873k4) && this.f17877x1 == c6288wl.f17877x1 && this.f17874kk == c6288wl.f17874kk && this.f17876to == c6288wl.f17876to && C14067j2.m66728k4(this.f17869du, c6288wl.f17869du) && this.f17871h4 == c6288wl.f17871h4 && C14113y2.m67363du(m25664c5(), c6288wl.m25664c5()) && C12530dy.m58333k4(this.f17870dy, c6288wl.f17870dy);
    }
}
