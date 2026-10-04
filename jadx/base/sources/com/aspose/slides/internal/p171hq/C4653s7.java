package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p396sc.C10195qq;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.s7 */
/* JADX INFO: loaded from: classes.dex */
public class C4653s7 extends AbstractC4671x1 {

    /* JADX INFO: renamed from: k4 */
    private long f12997k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f12998kk;

    /* JADX INFO: renamed from: x1 */
    private long f12999x1;

    /* JADX INFO: renamed from: du */
    public final long m19335du() {
        return this.f12999x1;
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
        return m19338k4((C4653s7) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        if (m19339m9() != null) {
            return m19339m9().length + 8;
        }
        return 8;
    }

    public int hashCode() {
        return (((((int) this.f12997k4) * 397) ^ ((int) this.f12999x1)) * 397) ^ (m19339m9() != null ? AbstractC14092to.m67208k4((Object) m19339m9()).hashCode() : 0);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo19122k4() {
        return mo19130x1().mo13505to();
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: kk */
    public byte[] mo19127kk() {
        return m19339m9();
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m19339m9() {
        return this.f12998kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m19340to() {
        return this.f12997k4;
    }

    public String toString() {
        return C14113y2.m67402k4("[Type: {0}, MetafileDataSize: {1}]", C14042ak.m66410k4(C10195qq.class, this.f12997k4), Long.valueOf(this.f12999x1));
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: x1 */
    public AbstractC6888dy mo19130x1() {
        C3152yj c3152yj = new C3152yj(m19339m9());
        try {
            return AbstractC12536x1.m58363k4(c3152yj);
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19336k4(long j) {
        this.f12997k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19341x1(long j) {
        this.f12999x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19337k4(byte[] bArr) {
        this.f12998kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19338k4(C4653s7 c4653s7) {
        return this.f12997k4 == c4653s7.f12997k4 && this.f12999x1 == c4653s7.f12999x1 && C12530dy.m58330k4(m19339m9(), c4653s7.m19339m9());
    }
}
