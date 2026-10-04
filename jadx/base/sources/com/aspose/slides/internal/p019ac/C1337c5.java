package com.aspose.slides.internal.p019ac;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p360qg.C9863du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p498xe.C12519um;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.c5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1337c5 extends AbstractC1349ne {

    /* JADX INFO: renamed from: c5 */
    private long f5779c5;

    /* JADX INFO: renamed from: ck */
    private long f5780ck;

    /* JADX INFO: renamed from: du */
    private long f5781du;

    /* JADX INFO: renamed from: dy */
    private int f5782dy;

    /* JADX INFO: renamed from: h4 */
    private long f5784h4;

    /* JADX INFO: renamed from: jd */
    private long f5785jd;

    /* JADX INFO: renamed from: m9 */
    private int f5788m9;

    /* JADX INFO: renamed from: to */
    private long f5789to = 65536;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f5786k4 = new C12521uz();

    /* JADX INFO: renamed from: x1 */
    private C12521uz f5791x1 = new C12521uz();

    /* JADX INFO: renamed from: kk */
    private int f5787kk = ((Integer) C7019kk.m27467x1(Integer.TYPE)).intValue();

    /* JADX INFO: renamed from: fa */
    private C12519um f5783fa = new C12519um();

    /* JADX INFO: renamed from: up */
    private C12519um f5790up = new C12519um();

    /* JADX INFO: renamed from: k4 */
    private static float m7824k4(int i, int i2, int i3) {
        return (i * i3) / (i2 * 100.0f);
    }

    /* JADX INFO: renamed from: c5 */
    public final C12519um m7825c5() {
        return this.f5790up;
    }

    /* JADX INFO: renamed from: ck */
    public final C12014ne m7827ck() {
        C12014ne c12014neClone = m7843x1().m58249dy().Clone();
        C12014ne c12014neClone2 = C12014ne.m56654k4(C14116yg.m67507x1(c12014neClone.m56681to(), c12014neClone.m56668h4()), C14116yg.m67507x1(c12014neClone.m56666dy(), c12014neClone.m56670k4()), C14116yg.m67483k4(c12014neClone.m56681to(), c12014neClone.m56668h4()), C14116yg.m67483k4(c12014neClone.m56666dy(), c12014neClone.m56670k4())).Clone();
        float fM7824k4 = m7824k4((int) this.f5783fa.m58236x1(), (int) m7825c5().m58236x1(), c12014neClone2.m56666dy());
        return C12014ne.m56661x1(new C12007ix(m7824k4((int) this.f5783fa.m58232k4(), (int) m7825c5().m58232k4(), c12014neClone2.m56681to()), fM7824k4, m7824k4((int) this.f5783fa.m58232k4(), (int) m7825c5().m58232k4(), c12014neClone2.m56663c5()) + 1.0f, m7824k4((int) this.f5783fa.m58236x1(), (int) m7825c5().m58236x1(), c12014neClone2.m56683x1()) + 1.0f));
    }

    /* JADX INFO: renamed from: du */
    public final void m7828du(long j) {
        this.f5781du = j;
    }

    /* JADX INFO: renamed from: dy */
    public final C12519um m7829dy() {
        return this.f5783fa;
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
        return m7836k4((C1337c5) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m7831h4() {
        return this.f5779c5;
    }

    public int hashCode() {
        C12521uz c12521uz = this.f5786k4;
        int iHashCode = (c12521uz != null ? c12521uz.hashCode() : 0) * 397;
        C12521uz c12521uz2 = this.f5791x1;
        int iHashCode2 = (((((((((((((((((((iHashCode ^ (c12521uz2 != null ? c12521uz2.hashCode() : 0)) * 397) ^ this.f5787kk) * 397) ^ ((int) this.f5789to)) * 397) ^ ((int) this.f5781du)) * 397) ^ ((int) this.f5784h4)) * 397) ^ C14081nv.m67061k4(this.f5788m9)) * 397) ^ C14081nv.m67061k4(this.f5782dy)) * 397) ^ ((int) this.f5779c5)) * 397) ^ ((int) this.f5785jd)) * 397) ^ ((int) this.f5780ck)) * 397;
        C12519um c12519um = this.f5783fa;
        int iHashCode3 = (iHashCode2 ^ (c12519um != null ? c12519um.hashCode() : 0)) * 397;
        C12519um c12519um2 = this.f5790up;
        return iHashCode3 ^ (c12519um2 != null ? c12519um2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m7833jd() {
        return this.f5787kk == 1179469088;
    }

    /* JADX INFO: renamed from: kk */
    public final long m7837kk() {
        return this.f5784h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m7839m9() {
        return this.f5785jd;
    }

    /* JADX INFO: renamed from: to */
    public final int m7841to() {
        return this.f5788m9;
    }

    public String toString() {
        return C14113y2.m67402k4("[Bonds: {0}, Frame: {1}, RecordSignature: {2}, Version: {3}, Bytes: {4}, Records: {5}, Handles: {6}, Reserved: {7}, NDesription: {8}, OffDescription: {9}, NPalEntries: {10}, Device: {11}, Millimeters: {12}]", this.f5786k4, this.f5791x1, C14042ak.m66410k4(C9863du.class, this.f5787kk), Long.valueOf(this.f5789to), Long.valueOf(this.f5781du), Long.valueOf(this.f5784h4), Integer.valueOf(this.f5788m9), Integer.valueOf(this.f5782dy), Long.valueOf(this.f5779c5), Long.valueOf(this.f5785jd), Long.valueOf(this.f5780ck), this.f5783fa, this.f5790up);
    }

    /* JADX INFO: renamed from: x1 */
    public final C12521uz m7843x1() {
        return this.f5791x1;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m7826c5(long j) {
        this.f5780ck = j;
    }

    /* JADX INFO: renamed from: dy */
    public final void m7830dy(long j) {
        this.f5785jd = j;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m7832h4(long j) {
        this.f5784h4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m7834k4() {
        return this.f5786k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m7838kk(int i) {
        this.f5782dy = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m7840m9(long j) {
        this.f5779c5 = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m7842to(long j) {
        this.f5789to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7844x1(int i) {
        this.f5788m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7835k4(int i) {
        this.f5787kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7836k4(C1337c5 c1337c5) {
        return C14067j2.m66728k4(this.f5786k4, c1337c5.f5786k4) && C14067j2.m66728k4(this.f5791x1, c1337c5.f5791x1) && this.f5787kk == c1337c5.f5787kk && this.f5789to == c1337c5.f5789to && this.f5781du == c1337c5.f5781du && this.f5784h4 == c1337c5.f5784h4 && this.f5788m9 == c1337c5.f5788m9 && this.f5782dy == c1337c5.f5782dy && this.f5779c5 == c1337c5.f5779c5 && this.f5785jd == c1337c5.f5785jd && this.f5780ck == c1337c5.f5780ck && C14067j2.m66728k4(this.f5783fa, c1337c5.f5783fa) && C14067j2.m66728k4(this.f5790up, c1337c5.f5790up);
    }
}
