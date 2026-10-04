package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6284u4;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.gi */
/* JADX INFO: loaded from: classes4.dex */
public class C9651gi extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34910k4;

    /* JADX INFO: renamed from: kk */
    private long f34911kk;

    /* JADX INFO: renamed from: to */
    private C6284u4 f34912to;

    /* JADX INFO: renamed from: x1 */
    private long f34913x1;

    public C9651gi(C9723vw c9723vw) {
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
        return m47252k4((C9651gi) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34910k4;
        int iHashCode2 = (((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f34913x1)) * 397) ^ ((int) this.f34911kk)) * 397;
        C6284u4 c6284u4 = this.f34912to;
        return iHashCode2 ^ (c6284u4 != null ? c6284u4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47248k4() {
        return this.f34910k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47253kk() {
        return this.f34911kk;
    }

    /* JADX INFO: renamed from: to */
    public final C6284u4 m47254to() {
        return this.f34912to;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Bounds: {1}, RgnDataSize: {2}, IhBrush: {3}, RgnData: {4}", super.toString(), m47248k4(), Long.valueOf(m47255x1()), Long.valueOf(m47253kk()), m47254to());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47255x1() {
        return this.f34913x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47249k4(long j) {
        this.f34913x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47256x1(long j) {
        this.f34911kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47250k4(C6284u4 c6284u4) {
        this.f34912to = c6284u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47251k4(C12350uz c12350uz) {
        this.f34910k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47252k4(C9651gi c9651gi) {
        return m47765k4((C9723vw) c9651gi) && C14067j2.m66728k4(this.f34910k4, c9651gi.f34910k4) && this.f34913x1 == c9651gi.f34913x1 && this.f34911kk == c9651gi.f34911kk && this.f34912to.equals(c9651gi.f34912to);
    }
}
