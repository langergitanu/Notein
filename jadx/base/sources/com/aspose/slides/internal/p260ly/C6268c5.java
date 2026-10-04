package com.aspose.slides.internal.p260ly;

import com.aspose.slides.internal.p124f7.C3864du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p488x0.C12348um;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6268c5 extends AbstractC6280ne {

    /* JADX INFO: renamed from: c5 */
    private long f17762c5;

    /* JADX INFO: renamed from: ck */
    private long f17763ck;

    /* JADX INFO: renamed from: du */
    private long f17764du;

    /* JADX INFO: renamed from: dy */
    private int f17765dy;

    /* JADX INFO: renamed from: h4 */
    private long f17767h4;

    /* JADX INFO: renamed from: jd */
    private long f17768jd;

    /* JADX INFO: renamed from: m9 */
    private int f17771m9;

    /* JADX INFO: renamed from: to */
    private long f17772to = 65536;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f17769k4 = new C12350uz();

    /* JADX INFO: renamed from: x1 */
    private C12350uz f17774x1 = new C12350uz();

    /* JADX INFO: renamed from: kk */
    private int f17770kk = ((Integer) C7019kk.m27467x1(Integer.TYPE)).intValue();

    /* JADX INFO: renamed from: fa */
    private C12348um f17766fa = new C12348um();

    /* JADX INFO: renamed from: up */
    private C12348um f17773up = new C12348um();

    /* JADX INFO: renamed from: k4 */
    private static float m25427k4(int i, int i2, int i3) {
        return (i * i3) / (i2 * 100.0f);
    }

    /* JADX INFO: renamed from: c5 */
    public final long m25428c5() {
        return this.f17764du;
    }

    /* JADX INFO: renamed from: ck */
    public final int m25430ck() {
        return this.f17771m9;
    }

    /* JADX INFO: renamed from: du */
    public final void m25431du(long j) {
        this.f17764du = j;
    }

    /* JADX INFO: renamed from: dy */
    public final long m25432dy() {
        return this.f17772to;
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
        return m25442k4((C6268c5) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final int m25434fa() {
        return this.f17765dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12350uz m25435h4() {
        return this.f17774x1;
    }

    public int hashCode() {
        C12350uz c12350uz = this.f17769k4;
        int iHashCode = (c12350uz != null ? c12350uz.hashCode() : 0) * 397;
        C12350uz c12350uz2 = this.f17774x1;
        int iHashCode2 = (((((((((((((((((((iHashCode ^ (c12350uz2 != null ? c12350uz2.hashCode() : 0)) * 397) ^ this.f17770kk) * 397) ^ ((int) this.f17772to)) * 397) ^ ((int) this.f17764du)) * 397) ^ ((int) this.f17767h4)) * 397) ^ C14081nv.m67061k4(this.f17771m9)) * 397) ^ C14081nv.m67061k4(this.f17765dy)) * 397) ^ ((int) this.f17762c5)) * 397) ^ ((int) this.f17768jd)) * 397) ^ ((int) this.f17763ck)) * 397;
        C12348um c12348um = this.f17766fa;
        int iHashCode3 = (iHashCode2 ^ (c12348um != null ? c12348um.hashCode() : 0)) * 397;
        C12348um c12348um2 = this.f17773up;
        return iHashCode3 ^ (c12348um2 != null ? c12348um2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ix */
    public final C12014ne m25437ix() {
        C12014ne c12014neClone = m25435h4().m57842dy().Clone();
        C12014ne c12014neClone2 = C12014ne.m56654k4(C14116yg.m67507x1(c12014neClone.m56681to(), c12014neClone.m56668h4()), C14116yg.m67507x1(c12014neClone.m56666dy(), c12014neClone.m56670k4()), C14116yg.m67483k4(c12014neClone.m56681to(), c12014neClone.m56668h4()), C14116yg.m67483k4(c12014neClone.m56666dy(), c12014neClone.m56670k4())).Clone();
        float fM25427k4 = m25427k4((int) this.f17766fa.m57820x1(), (int) m25455x6().m57820x1(), c12014neClone2.m56666dy());
        return C12014ne.m56661x1(new C12007ix(m25427k4((int) this.f17766fa.m57816k4(), (int) m25455x6().m57816k4(), c12014neClone2.m56681to()), fM25427k4, m25427k4((int) this.f17766fa.m57816k4(), (int) m25455x6().m57816k4(), c12014neClone2.m56663c5()) + 1.0f, m25427k4((int) this.f17766fa.m57820x1(), (int) m25455x6().m57820x1(), c12014neClone2.m56683x1()) + 1.0f));
    }

    /* JADX INFO: renamed from: jd */
    public final long m25438jd() {
        return this.f17767h4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m25443kk(int i) {
        this.f17765dy = i;
    }

    /* JADX INFO: renamed from: ks */
    public final long m25444ks() {
        return this.f17763ck;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m25445m9() {
        return this.f17770kk;
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m25447ne() {
        return this.f17770kk == 1179469088;
    }

    /* JADX INFO: renamed from: rv */
    public final C12348um m25448rv() {
        return this.f17766fa;
    }

    /* JADX INFO: renamed from: to */
    public final C12350uz m25449to() {
        return this.f17769k4;
    }

    public String toString() {
        return C14113y2.m67402k4("[Bonds: {0}, Frame: {1}, RecordSignature: {2}, Version: {3}, Bytes: {4}, Records: {5}, Handles: {6}, Reserved: {7}, NDesription: {8}, OffDescription: {9}, NPalEntries: {10}, Device: {11}, Millimeters: {12}]", this.f17769k4, this.f17774x1, C14042ak.m66410k4(C3864du.class, this.f17770kk), Long.valueOf(this.f17772to), Long.valueOf(this.f17764du), Long.valueOf(this.f17767h4), Integer.valueOf(this.f17771m9), Integer.valueOf(this.f17765dy), Long.valueOf(this.f17762c5), Long.valueOf(this.f17768jd), Long.valueOf(this.f17763ck), this.f17766fa, this.f17773up);
    }

    /* JADX INFO: renamed from: up */
    public final long m25451up() {
        return this.f17762c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25452x1(int i) {
        this.f17771m9 = i;
    }

    /* JADX INFO: renamed from: x6 */
    public final C12348um m25455x6() {
        return this.f17773up;
    }

    /* JADX INFO: renamed from: yj */
    public final long m25456yj() {
        return this.f17768jd;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m25429c5(long j) {
        this.f17763ck = j;
    }

    /* JADX INFO: renamed from: dy */
    public final void m25433dy(long j) {
        this.f17768jd = j;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m25436h4(long j) {
        this.f17767h4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25439k4(int i) {
        this.f17770kk = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m25446m9(long j) {
        this.f17762c5 = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m25450to(long j) {
        this.f17772to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25453x1(C12348um c12348um) {
        this.f17773up = c12348um;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25440k4(C12348um c12348um) {
        this.f17766fa = c12348um;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25454x1(C12350uz c12350uz) {
        this.f17774x1 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25441k4(C12350uz c12350uz) {
        this.f17769k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25442k4(C6268c5 c6268c5) {
        return C14067j2.m66728k4(this.f17769k4, c6268c5.f17769k4) && C14067j2.m66728k4(this.f17774x1, c6268c5.f17774x1) && this.f17770kk == c6268c5.f17770kk && this.f17772to == c6268c5.f17772to && this.f17764du == c6268c5.f17764du && this.f17767h4 == c6268c5.f17767h4 && this.f17771m9 == c6268c5.f17771m9 && this.f17765dy == c6268c5.f17765dy && this.f17762c5 == c6268c5.f17762c5 && this.f17768jd == c6268c5.f17768jd && this.f17763ck == c6268c5.f17763ck && C14067j2.m66728k4(this.f17766fa, c6268c5.f17766fa) && C14067j2.m66728k4(this.f17773up, c6268c5.f17773up);
    }
}
