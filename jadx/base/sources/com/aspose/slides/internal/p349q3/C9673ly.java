package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ly */
/* JADX INFO: loaded from: classes4.dex */
public class C9673ly extends AbstractC9685o3 {

    /* JADX INFO: renamed from: du */
    private String f34991du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f34992h4;

    /* JADX INFO: renamed from: k4 */
    private long f34993k4;

    /* JADX INFO: renamed from: kk */
    private long f34994kk;

    /* JADX INFO: renamed from: to */
    private byte[] f34995to;

    /* JADX INFO: renamed from: x1 */
    private long f34996x1;

    public C9673ly(C9723vw c9723vw) {
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
        return m47430k4((C9673ly) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((((super.hashCode() * 397) ^ ((int) this.f34993k4)) * 397) ^ ((int) this.f34996x1)) * 397) ^ ((int) this.f34994kk)) * 397;
        byte[] bArr = this.f34995to;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        String str = this.f34991du;
        int iHashCode3 = (iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr2 = this.f34992h4;
        return iHashCode3 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47427k4() {
        return this.f34993k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47431kk() {
        return this.f34994kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m47433to() {
        return this.f34995to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47434x1() {
        return this.f34996x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47428k4(long j) {
        this.f34993k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47432kk(long j) {
        this.f34994kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47435x1(long j) {
        this.f34996x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47429k4(byte[] bArr) {
        this.f34995to = bArr;
        this.f34991du = AbstractC6747ar.m26650yj().mo26682x1(this.f34995to, 0, (int) this.f34996x1);
        byte[] bArr2 = new byte[(int) this.f34994kk];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f34995to), (int) this.f34996x1, AbstractC14092to.m67208k4((Object) bArr2), 0, (int) this.f34994kk);
        this.f34992h4 = bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47430k4(C9673ly c9673ly) {
        return m47765k4((C9723vw) c9673ly) && this.f34993k4 == c9673ly.f34993k4 && this.f34996x1 == c9673ly.f34996x1 && this.f34994kk == c9673ly.f34994kk && C12530dy.m58330k4(this.f34995to, c9673ly.f34995to) && C14113y2.m67363du(this.f34991du, c9673ly.f34991du) && C12530dy.m58330k4(this.f34992h4, c9673ly.f34992h4);
    }
}
