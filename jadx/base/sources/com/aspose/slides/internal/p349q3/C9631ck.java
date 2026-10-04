package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C9631ck extends AbstractC9685o3 {

    /* JADX INFO: renamed from: du */
    private byte[] f34821du;

    /* JADX INFO: renamed from: h4 */
    private String f34822h4;

    /* JADX INFO: renamed from: k4 */
    private long f34823k4;

    /* JADX INFO: renamed from: kk */
    private long f34824kk;

    /* JADX INFO: renamed from: m9 */
    private byte[] f34825m9;

    /* JADX INFO: renamed from: to */
    private long f34826to;

    /* JADX INFO: renamed from: x1 */
    private long f34827x1;

    public C9631ck(C9723vw c9723vw) {
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
        return m47062k4((C9631ck) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m47058h4() {
        return this.f34821du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((((((super.hashCode() * 397) ^ ((int) this.f34823k4)) * 397) ^ ((int) this.f34827x1)) * 397) ^ ((int) this.f34824kk)) * 397) ^ ((int) this.f34826to)) * 397;
        byte[] bArr = this.f34821du;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        String str = this.f34822h4;
        int iHashCode3 = (iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 397;
        byte[] bArr2 = this.f34825m9;
        return iHashCode3 ^ (bArr2 != null ? AbstractC14092to.m67208k4((Object) bArr2).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47059k4() {
        return this.f34823k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47063kk() {
        return this.f34824kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m47065to() {
        return this.f34826to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47067x1() {
        return this.f34827x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47060k4(long j) {
        this.f34823k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47064kk(long j) {
        this.f34824kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m47066to(long j) {
        this.f34826to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47068x1(long j) {
        this.f34827x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47061k4(byte[] bArr) {
        this.f34821du = bArr;
        this.f34822h4 = AbstractC6747ar.m26643rv().mo26682x1(this.f34821du, 0, (int) this.f34824kk);
        byte[] bArr2 = new byte[(int) this.f34826to];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f34821du), (int) this.f34824kk, AbstractC14092to.m67208k4((Object) bArr2), 0, (int) this.f34826to);
        this.f34825m9 = bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47062k4(C9631ck c9631ck) {
        return m47765k4((C9723vw) c9631ck) && this.f34823k4 == c9631ck.f34823k4 && this.f34827x1 == c9631ck.f34827x1 && this.f34824kk == c9631ck.f34824kk && this.f34826to == c9631ck.f34826to && C12530dy.m58330k4(this.f34821du, c9631ck.f34821du) && C14113y2.m67363du(this.f34822h4, c9631ck.f34822h4) && C12530dy.m58330k4(this.f34825m9, c9631ck.f34825m9);
    }
}
