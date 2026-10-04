package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ri */
/* JADX INFO: loaded from: classes.dex */
public class C5035ri extends AbstractC4966c6 {

    /* JADX INFO: renamed from: k4 */
    private long f13824k4;

    /* JADX INFO: renamed from: kk */
    private String f13825kk;

    /* JADX INFO: renamed from: to */
    private byte[] f13826to;

    /* JADX INFO: renamed from: x1 */
    private long f13827x1;

    public C5035ri(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.AbstractC4966c6, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21412k4((C5035ri) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.AbstractC4966c6, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f13824k4)) * 397) ^ ((int) this.f13827x1)) * 397;
        String str = this.f13825kk;
        int iHashCode2 = (iHashCode ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr = this.f13826to;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21408k4() {
        return this.f13824k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21413x1() {
        return this.f13827x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21409k4(long j) {
        this.f13824k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21414x1(long j) {
        this.f13827x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21410k4(String str) {
        this.f13825kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21411k4(byte[] bArr) {
        this.f13826to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21412k4(C5035ri c5035ri) {
        return m20854k4((AbstractC4966c6) c5035ri) && this.f13824k4 == c5035ri.f13824k4 && this.f13827x1 == c5035ri.f13827x1 && C14113y2.m67363du(this.f13825kk, c5035ri.f13825kk) && C3022m9.m12719k4(this.f13826to, c5035ri.f13826to);
    }
}
