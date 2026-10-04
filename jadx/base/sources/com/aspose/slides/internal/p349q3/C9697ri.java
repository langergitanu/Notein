package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ri */
/* JADX INFO: loaded from: classes4.dex */
public class C9697ri extends AbstractC9628c6 {

    /* JADX INFO: renamed from: k4 */
    private long f35071k4;

    /* JADX INFO: renamed from: kk */
    private String f35072kk;

    /* JADX INFO: renamed from: to */
    private byte[] f35073to;

    /* JADX INFO: renamed from: x1 */
    private long f35074x1;

    public C9697ri(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.AbstractC9628c6, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47607k4((C9697ri) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m47602h4() {
        return this.f35073to;
    }

    @Override // com.aspose.slides.internal.p349q3.AbstractC9628c6, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f35071k4)) * 397) ^ ((int) this.f35074x1)) * 397;
        String str = this.f35072kk;
        int iHashCode2 = (iHashCode ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr = this.f35073to;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47603k4() {
        return this.f35071k4;
    }

    /* JADX INFO: renamed from: to */
    public final String m47608to() {
        return this.f35072kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47609x1() {
        return this.f35074x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47604k4(long j) {
        this.f35071k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47610x1(long j) {
        this.f35074x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47605k4(String str) {
        this.f35072kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47606k4(byte[] bArr) {
        this.f35073to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47607k4(C9697ri c9697ri) {
        return m47019k4((AbstractC9628c6) c9697ri) && this.f35071k4 == c9697ri.f35071k4 && this.f35074x1 == c9697ri.f35074x1 && C14113y2.m67363du(this.f35072kk, c9697ri.f35072kk) && C12530dy.m58330k4(this.f35073to, c9697ri.f35073to);
    }
}
