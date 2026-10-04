package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1493qq;
import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p436u8.AbstractC11290x1;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.s7 */
/* JADX INFO: loaded from: classes5.dex */
public class C13403s7 extends AbstractC13421x1 {

    /* JADX INFO: renamed from: k4 */
    private long f44850k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f44851kk;

    /* JADX INFO: renamed from: x1 */
    private long f44852x1;

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
        return m62326k4((C13403s7) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        if (m62328to() != null) {
            return m62328to().length + 8;
        }
        return 8;
    }

    public int hashCode() {
        return (((((int) this.f44850k4) * 397) ^ ((int) this.f44852x1)) * 397) ^ (m62328to() != null ? AbstractC14092to.m67208k4((Object) m62328to()).hashCode() : 0);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13421x1
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo62121k4() {
        return mo62129x1().mo12732to();
    }

    /* JADX INFO: renamed from: kk */
    public final long m62327kk() {
        return this.f44852x1;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m62328to() {
        return this.f44851kk;
    }

    public String toString() {
        return C14113y2.m67402k4("[Type: {0}, MetafileDataSize: {1}]", C14042ak.m66410k4(C1493qq.class, this.f44850k4), Long.valueOf(this.f44852x1));
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13421x1
    /* JADX INFO: renamed from: x1 */
    public AbstractC11290x1 mo62129x1() {
        C3152yj c3152yj = new C3152yj(m62328to());
        try {
            return AbstractC3024x1.m12727k4(c3152yj);
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62324k4(long j) {
        this.f44850k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62329x1(long j) {
        this.f44852x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62325k4(byte[] bArr) {
        this.f44851kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62326k4(C13403s7 c13403s7) {
        return this.f44850k4 == c13403s7.f44850k4 && this.f44852x1 == c13403s7.f44852x1 && C3022m9.m12719k4(m62328to(), c13403s7.m62328to());
    }
}
