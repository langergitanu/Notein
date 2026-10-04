package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.q6 */
/* JADX INFO: loaded from: classes4.dex */
public class C9690q6 extends AbstractC9685o3 {

    /* JADX INFO: renamed from: du */
    private String f35054du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f35055h4;

    /* JADX INFO: renamed from: k4 */
    private long f35056k4;

    /* JADX INFO: renamed from: kk */
    private long f35057kk;

    /* JADX INFO: renamed from: to */
    private byte[] f35058to;

    /* JADX INFO: renamed from: x1 */
    private long f35059x1;

    public C9690q6(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m47568k4((C9690q6) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((((super.hashCode() * 397) ^ ((int) this.f35056k4)) * 397) ^ ((int) this.f35059x1)) * 397) ^ ((int) this.f35057kk)) * 397;
        byte[] bArr = this.f35058to;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        String str = this.f35054du;
        int iHashCode3 = (iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr2 = this.f35055h4;
        return iHashCode3 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47565k4() {
        return this.f35056k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47569kk() {
        return this.f35057kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m47571to() {
        return this.f35058to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47572x1() {
        return this.f35059x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47566k4(long j) {
        this.f35056k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47570kk(long j) {
        this.f35057kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47573x1(long j) {
        this.f35059x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47567k4(byte[] bArr) {
        this.f35058to = bArr;
        this.f35054du = AbstractC6747ar.m26643rv().mo26682x1(this.f35058to, 0, (int) this.f35059x1);
        byte[] bArr2 = new byte[(int) this.f35057kk];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f35058to), (int) this.f35059x1, AbstractC14092to.m67208k4((Object) bArr2), 0, (int) this.f35057kk);
        this.f35055h4 = bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47568k4(C9690q6 c9690q6) {
        return m47765k4((C9723vw) c9690q6) && this.f35056k4 == c9690q6.f35056k4 && this.f35059x1 == c9690q6.f35059x1 && this.f35057kk == c9690q6.f35057kk && C12530dy.m58330k4(this.f35058to, c9690q6.f35058to) && C14113y2.m67363du(this.f35054du, c9690q6.f35054du) && C12530dy.m58330k4(this.f35055h4, c9690q6.f35055h4);
    }
}
