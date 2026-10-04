package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.um */
/* JADX INFO: loaded from: classes.dex */
public class C5054um extends AbstractC4967ca {

    /* JADX INFO: renamed from: du */
    private long f13876du;

    /* JADX INFO: renamed from: h4 */
    private long f13877h4;

    /* JADX INFO: renamed from: k4 */
    private long f13878k4;

    /* JADX INFO: renamed from: kk */
    private long f13879kk;

    /* JADX INFO: renamed from: m9 */
    private C12502c5 f13880m9;

    /* JADX INFO: renamed from: to */
    private long f13881to;

    /* JADX INFO: renamed from: x1 */
    private long f13882x1;

    public C5054um(C5061vw c5061vw) {
        super(c5061vw);
    }

    /* JADX INFO: renamed from: du */
    public final void m21513du(long j) {
        this.f13876du = j;
    }

    /* JADX INFO: renamed from: dy */
    public final C12502c5 m21514dy() {
        return this.f13880m9;
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
        return m21520k4((C5054um) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m21515h4() {
        return this.f13876du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((((((((((super.hashCode() * 397) ^ ((int) this.f13878k4)) * 397) ^ ((int) this.f13882x1)) * 397) ^ ((int) this.f13879kk)) * 397) ^ ((int) this.f13881to)) * 397) ^ ((int) this.f13876du)) * 397) ^ ((int) this.f13877h4)) * 397;
        C12502c5 c12502c5 = this.f13880m9;
        return iHashCode ^ (c12502c5 != null ? c12502c5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21517k4() {
        return this.f13878k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m21521kk() {
        return this.f13879kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m21523m9() {
        return this.f13877h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m21524to() {
        return this.f13881to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21526x1() {
        return this.f13882x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m21516h4(long j) {
        this.f13877h4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21518k4(long j) {
        this.f13878k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21522kk(long j) {
        this.f13879kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m21525to(long j) {
        this.f13881to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21527x1(long j) {
        this.f13882x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21519k4(C12502c5 c12502c5) {
        this.f13880m9 = c12502c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21520k4(C5054um c5054um) {
        return m21559k4((C5061vw) c5054um) && this.f13878k4 == c5054um.f13878k4 && this.f13882x1 == c5054um.f13882x1 && this.f13879kk == c5054um.f13879kk && this.f13881to == c5054um.f13881to && this.f13876du == c5054um.f13876du && this.f13877h4 == c5054um.f13877h4 && C14067j2.m66728k4(this.f13880m9, c5054um.f13880m9);
    }
}
