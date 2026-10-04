package com.aspose.slides.internal.p019ac;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C1341fa extends C1338ck {

    /* JADX INFO: renamed from: k4 */
    private byte[] f5810k4;

    /* JADX INFO: renamed from: kk */
    private String f5811kk;

    /* JADX INFO: renamed from: to */
    private String f5812to;

    /* JADX INFO: renamed from: x1 */
    private String f5813x1;

    public C1341fa(C1338ck c1338ck) {
        m7858k4(c1338ck.m7855k4());
        m7874x1(c1338ck.m7872x1());
        m7864kk(c1338ck.m7862kk());
        m7870to(c1338ck.m7868to());
        m7849du(c1338ck.m7852h4());
        m7857k4(c1338ck.m7866m9());
        m7873x1(c1338ck.m7850dy());
        m7863kk(c1338ck.m7846c5());
        m7869to(c1338ck.m7854jd());
        m7848du(c1338ck.m7847ck());
        m7853h4(c1338ck.m7851fa());
        m7867m9(c1338ck.m7871up());
        m7859k4(c1338ck.m7875yj());
        m7860k4(c1338ck.m7865ks());
    }

    @Override // com.aspose.slides.internal.p019ac.C1338ck
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
        return m7886k4((C1341fa) obj);
    }

    @Override // com.aspose.slides.internal.p019ac.C1338ck
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        String str = this.f5813x1;
        int iHashCode2 = (iHashCode ^ (str != null ? str.hashCode() : 0)) * 397;
        String str2 = this.f5811kk;
        int iHashCode3 = (iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 397;
        String str3 = this.f5812to;
        return iHashCode3 ^ (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ix */
    public final byte[] m7884ix() {
        return this.f5810k4;
    }

    @Override // com.aspose.slides.internal.p019ac.C1338ck
    /* JADX INFO: renamed from: k4 */
    public C12013m9 mo7856k4(C4201h4 c4201h4) {
        return super.mo7856k4(c4201h4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m7887kk(String str) {
        this.f5811kk = str;
    }

    /* JADX INFO: renamed from: ne */
    public final String m7888ne() {
        return this.f5812to;
    }

    /* JADX INFO: renamed from: rv */
    public final String m7889rv() {
        return this.f5813x1;
    }

    /* JADX INFO: renamed from: to */
    public final void m7890to(String str) {
        this.f5812to = str;
    }

    @Override // com.aspose.slides.internal.p019ac.C1338ck
    public String toString() {
        return C14113y2.m67402k4("{0}, FullName: {1}, Style: {2}, Script: {3}", super.toString(), m7889rv(), m7892x6(), m7888ne());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7891x1(String str) {
        this.f5813x1 = str;
    }

    /* JADX INFO: renamed from: x6 */
    public final String m7892x6() {
        return this.f5811kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7885k4(byte[] bArr) {
        this.f5810k4 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7886k4(C1341fa c1341fa) {
        return m7861k4((C1338ck) c1341fa) && C14113y2.m67363du(this.f5813x1, c1341fa.f5813x1) && C14113y2.m67363du(this.f5811kk, c1341fa.f5811kk) && C14113y2.m67363du(this.f5812to, c1341fa.f5812to);
    }
}
