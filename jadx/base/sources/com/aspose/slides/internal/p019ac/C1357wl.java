package com.aspose.slides.internal.p019ac;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p360qg.C9873to;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.wl */
/* JADX INFO: loaded from: classes3.dex */
public class C1357wl extends AbstractC1349ne {

    /* JADX INFO: renamed from: c5 */
    private long[] f5883c5;

    /* JADX INFO: renamed from: du */
    private C12521uz f5884du;

    /* JADX INFO: renamed from: dy */
    private byte[] f5885dy;

    /* JADX INFO: renamed from: h4 */
    private long f5886h4;

    /* JADX INFO: renamed from: k4 */
    private C12514ne f5887k4;

    /* JADX INFO: renamed from: kk */
    private long f5888kk;

    /* JADX INFO: renamed from: m9 */
    private String f5889m9;

    /* JADX INFO: renamed from: to */
    private long f5890to;

    /* JADX INFO: renamed from: x1 */
    private long f5891x1;

    /* JADX INFO: renamed from: c5 */
    public final byte[] m8004c5() {
        return this.f5885dy;
    }

    /* JADX INFO: renamed from: dy */
    public final String m8005dy() {
        return this.f5889m9;
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
        return m8015k4((C1357wl) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12521uz m8006h4() {
        return this.f5884du;
    }

    public int hashCode() {
        C12514ne c12514ne = this.f5887k4;
        int iHashCode = (((((((c12514ne != null ? c12514ne.hashCode() : 0) * 397) ^ ((int) this.f5891x1)) * 397) ^ ((int) this.f5888kk)) * 397) ^ ((int) this.f5890to)) * 397;
        C12521uz c12521uz = this.f5884du;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f5886h4)) * 397;
        String str = this.f5889m9;
        int iHashCode3 = (iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 397;
        long[] jArr = this.f5883c5;
        return iHashCode3 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final long[] m8007jd() {
        return this.f5883c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12514ne m8008k4() {
        return this.f5887k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m8016kk() {
        return this.f5888kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m8018m9() {
        return this.f5886h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m8019to() {
        return this.f5890to;
    }

    public String toString() {
        return C14113y2.m67402k4("[Reference: {0}, Chars: {1}, OffString: {2}, Options: {3}, Rectangle: {4}, OffDx: {5}, StringBuffer: {6}, DxBuffer: {7}]", m8008k4(), Long.valueOf(m8021x1()), Long.valueOf(m8016kk()), C14042ak.m66410k4(C9873to.class, m8019to()), m8006h4(), Long.valueOf(m8018m9()), m8005dy(), m8007jd());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m8021x1() {
        return this.f5891x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8009k4(long j) {
        this.f5891x1 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m8017kk(long j) {
        this.f5890to = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m8020to(long j) {
        this.f5886h4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8022x1(long j) {
        this.f5888kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8010k4(C12514ne c12514ne) {
        this.f5887k4 = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8011k4(C12521uz c12521uz) {
        this.f5884du = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8012k4(String str) {
        this.f5889m9 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8013k4(byte[] bArr) {
        this.f5885dy = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8014k4(long[] jArr) {
        this.f5883c5 = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m8015k4(C1357wl c1357wl) {
        return C14067j2.m66728k4(this.f5887k4, c1357wl.f5887k4) && this.f5891x1 == c1357wl.f5891x1 && this.f5888kk == c1357wl.f5888kk && this.f5890to == c1357wl.f5890to && C14067j2.m66728k4(this.f5884du, c1357wl.f5884du) && this.f5886h4 == c1357wl.f5886h4 && C14113y2.m67363du(this.f5889m9, c1357wl.f5889m9) && C3022m9.m12722k4(this.f5883c5, c1357wl.f5883c5);
    }
}
