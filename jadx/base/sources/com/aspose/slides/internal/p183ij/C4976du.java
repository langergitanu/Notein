package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1354um;
import com.aspose.slides.internal.p100e4.C3576um;
import com.aspose.slides.internal.p360qg.C9875x1;
import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.du */
/* JADX INFO: loaded from: classes.dex */
public class C4976du extends AbstractC4991h4 {

    /* JADX INFO: renamed from: c5 */
    private C1354um f13607c5;

    /* JADX INFO: renamed from: ck */
    private long f13608ck;

    /* JADX INFO: renamed from: du */
    private int f13609du;

    /* JADX INFO: renamed from: dy */
    private int f13610dy;

    /* JADX INFO: renamed from: fa */
    private long f13611fa;

    /* JADX INFO: renamed from: h4 */
    private long f13612h4;

    /* JADX INFO: renamed from: jd */
    private C12505dy f13613jd;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13614k4;

    /* JADX INFO: renamed from: kk */
    private int f13615kk;

    /* JADX INFO: renamed from: ks */
    private long f13616ks;

    /* JADX INFO: renamed from: m9 */
    private int f13617m9;

    /* JADX INFO: renamed from: rv */
    private C12502c5 f13618rv;

    /* JADX INFO: renamed from: to */
    private int f13619to;

    /* JADX INFO: renamed from: up */
    private long f13620up;

    /* JADX INFO: renamed from: x1 */
    private int f13621x1;

    /* JADX INFO: renamed from: yj */
    private long f13622yj;

    public C4976du() {
        m21557ck(76L);
    }

    /* JADX INFO: renamed from: c5 */
    public final C1354um m20950c5() {
        return this.f13607c5;
    }

    /* JADX INFO: renamed from: ck */
    public final long m20951ck() {
        return this.f13608ck;
    }

    /* JADX INFO: renamed from: du */
    public final void m20952du(int i) {
        this.f13617m9 = i;
    }

    /* JADX INFO: renamed from: dy */
    public final int m20954dy() {
        return this.f13610dy;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m20967k4((C4976du) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final long m20955fa() {
        return this.f13611fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m20956h4() {
        return this.f13612h4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13614k4;
        int iHashCode2 = (((((((((((((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ this.f13621x1) * 397) ^ this.f13615kk) * 397) ^ this.f13619to) * 397) ^ this.f13609du) * 397) ^ ((int) this.f13612h4)) * 397) ^ this.f13617m9) * 397) ^ this.f13610dy) * 397;
        C1354um c1354um = this.f13607c5;
        int iHashCode3 = (iHashCode2 ^ (c1354um != null ? c1354um.hashCode() : 0)) * 397;
        C12505dy c12505dy = this.f13613jd;
        int iHashCode4 = (((((((((((iHashCode3 ^ (c12505dy != null ? c12505dy.hashCode() : 0)) * 397) ^ ((int) this.f13608ck)) * 397) ^ ((int) this.f13611fa)) * 397) ^ ((int) this.f13620up)) * 397) ^ ((int) this.f13622yj)) * 397) ^ ((int) this.f13616ks)) * 397;
        C12502c5 c12502c5 = this.f13618rv;
        return iHashCode4 ^ (c12502c5 != null ? c12502c5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C12505dy m20959jd() {
        return this.f13613jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m20960k4() {
        return this.f13621x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m20968kk() {
        return this.f13619to;
    }

    /* JADX INFO: renamed from: ks */
    public final long m20971ks() {
        return this.f13616ks;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m20972m9() {
        return this.f13617m9;
    }

    /* JADX INFO: renamed from: rv */
    public final C12502c5 m20973rv() {
        return this.f13618rv;
    }

    /* JADX INFO: renamed from: to */
    public final int m20974to() {
        return this.f13609du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Bounds: {1}, XDest: {2}, YDest: {3}, CxDest: {4}, CyDest: {5}, BitBltRasterOperation: {6}, XSrc: {7}, YSrc: {8}, XformSrc: {9}, BkColorSrc: {10}, UsageSrc: {11}, OffBmiSrc: {12}, CbBmiSrc: {13}, OffBitsSrc: {14}, CbBitsSrc: {15}, SourceBitmap: {16}", super.toString(), this.f13614k4, Integer.valueOf(this.f13621x1), Integer.valueOf(this.f13615kk), Integer.valueOf(this.f13619to), Integer.valueOf(this.f13609du), C14042ak.m66410k4(C3576um.class, this.f13612h4), Integer.valueOf(this.f13617m9), Integer.valueOf(this.f13610dy), this.f13607c5, this.f13613jd, C14042ak.m66410k4(C9875x1.class, this.f13608ck), Long.valueOf(this.f13611fa), Long.valueOf(this.f13620up), Long.valueOf(this.f13622yj), Long.valueOf(this.f13616ks), this.f13618rv);
    }

    /* JADX INFO: renamed from: up */
    public final long m20977up() {
        return this.f13620up;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m20978x1() {
        return this.f13615kk;
    }

    /* JADX INFO: renamed from: yj */
    public final long m20981yj() {
        return this.f13622yj;
    }

    public C4976du(C5061vw c5061vw) {
        super(c5061vw);
    }

    /* JADX INFO: renamed from: du */
    public final void m20953du(long j) {
        this.f13622yj = j;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m20957h4(int i) {
        this.f13610dy = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20961k4(int i) {
        this.f13621x1 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m20969kk(int i) {
        this.f13619to = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m20975to(int i) {
        this.f13609du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20979x1(int i) {
        this.f13615kk = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m20958h4(long j) {
        this.f13616ks = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20962k4(long j) {
        this.f13612h4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m20970kk(long j) {
        this.f13611fa = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m20976to(long j) {
        this.f13620up = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20980x1(long j) {
        this.f13608ck = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20963k4(C1354um c1354um) {
        this.f13607c5 = c1354um;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20964k4(C12502c5 c12502c5) {
        this.f13618rv = c12502c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20965k4(C12505dy c12505dy) {
        this.f13613jd = c12505dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20966k4(C12521uz c12521uz) {
        this.f13614k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20967k4(C4976du c4976du) {
        return m21559k4((C5061vw) c4976du) && C14067j2.m66728k4(this.f13614k4, c4976du.f13614k4) && this.f13621x1 == c4976du.f13621x1 && this.f13615kk == c4976du.f13615kk && this.f13619to == c4976du.f13619to && this.f13609du == c4976du.f13609du && this.f13612h4 == c4976du.f13612h4 && this.f13617m9 == c4976du.f13617m9 && this.f13610dy == c4976du.f13610dy && C14067j2.m66728k4(this.f13607c5, c4976du.f13607c5) && C14067j2.m66728k4(this.f13613jd, c4976du.f13613jd) && this.f13608ck == c4976du.f13608ck && this.f13611fa == c4976du.f13611fa && this.f13620up == c4976du.f13620up && this.f13622yj == c4976du.f13622yj && this.f13616ks == c4976du.f13616ks && C14067j2.m66728k4(this.f13618rv, c4976du.f13618rv);
    }
}
