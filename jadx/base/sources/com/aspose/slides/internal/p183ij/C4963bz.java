package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1359x6;
import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.bz */
/* JADX INFO: loaded from: classes.dex */
public class C4963bz extends AbstractC4967ca {

    /* JADX INFO: renamed from: du */
    private long f13547du;

    /* JADX INFO: renamed from: h4 */
    private C1359x6 f13548h4;

    /* JADX INFO: renamed from: k4 */
    private long f13549k4;

    /* JADX INFO: renamed from: kk */
    private long f13550kk;

    /* JADX INFO: renamed from: m9 */
    private C12502c5 f13551m9;

    /* JADX INFO: renamed from: to */
    private long f13552to;

    /* JADX INFO: renamed from: x1 */
    private long f13553x1;

    public C4963bz(C5061vw c5061vw) {
        super(c5061vw);
    }

    /* JADX INFO: renamed from: du */
    public final void m20835du(long j) {
        this.f13547du = j;
    }

    /* JADX INFO: renamed from: dy */
    public final C12502c5 m20836dy() {
        return this.f13551m9;
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
        return m20842k4((C4963bz) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m20837h4() {
        return this.f13547du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((((((((super.hashCode() * 397) ^ ((int) this.f13549k4)) * 397) ^ ((int) this.f13553x1)) * 397) ^ ((int) this.f13550kk)) * 397) ^ ((int) this.f13552to)) * 397) ^ ((int) this.f13547du)) * 397;
        C1359x6 c1359x6 = this.f13548h4;
        int iHashCode2 = (iHashCode ^ (c1359x6 != null ? c1359x6.hashCode() : 0)) * 397;
        C12502c5 c12502c5 = this.f13551m9;
        return iHashCode2 ^ (c12502c5 != null ? c12502c5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20838k4() {
        return this.f13549k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m20843kk() {
        return this.f13550kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C1359x6 m20845m9() {
        return this.f13548h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m20846to() {
        return this.f13552to;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IhPen: {1}, Elp: {2}, BitmapBuffer: {3}", super.toString(), Long.valueOf(m20838k4()), m20845m9(), m20836dy());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m20848x1() {
        return this.f13553x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20839k4(long j) {
        this.f13549k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m20844kk(long j) {
        this.f13550kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m20847to(long j) {
        this.f13552to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20849x1(long j) {
        this.f13553x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20840k4(C1359x6 c1359x6) {
        this.f13548h4 = c1359x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20841k4(C12502c5 c12502c5) {
        this.f13551m9 = c12502c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20842k4(C4963bz c4963bz) {
        return m21559k4((C5061vw) c4963bz) && this.f13549k4 == c4963bz.f13549k4 && this.f13553x1 == c4963bz.f13553x1 && this.f13550kk == c4963bz.f13550kk && this.f13552to == c4963bz.f13552to && this.f13547du == c4963bz.f13547du && C14067j2.m66728k4(this.f13548h4, c4963bz.f13548h4) && C14067j2.m66728k4(this.f13551m9, c4963bz.f13551m9);
    }
}
