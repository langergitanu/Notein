package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6278ks;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.d3 */
/* JADX INFO: loaded from: classes4.dex */
public class C9632d3 extends AbstractC9622bs {

    /* JADX INFO: renamed from: k4 */
    private long f34828k4;

    /* JADX INFO: renamed from: kk */
    private long f34829kk;

    /* JADX INFO: renamed from: to */
    private C6278ks[] f34830to;

    /* JADX INFO: renamed from: x1 */
    private long f34831x1;

    public C9632d3(C9723vw c9723vw) {
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
        return m47072k4((C9632d3) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((((super.hashCode() * 397) ^ ((int) this.f34828k4)) * 397) ^ ((int) this.f34831x1)) * 397) ^ ((int) this.f34829kk)) * 397;
        C6278ks[] c6278ksArr = this.f34830to;
        return iHashCode ^ (c6278ksArr != null ? AbstractC14092to.m67208k4((Object) c6278ksArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47069k4() {
        return this.f34828k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47073kk() {
        return this.f34829kk;
    }

    /* JADX INFO: renamed from: to */
    public final C6278ks[] m47075to() {
        return this.f34830to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47076x1() {
        return this.f34831x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47070k4(long j) {
        this.f34828k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47074kk(long j) {
        this.f34829kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47077x1(long j) {
        this.f34831x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47071k4(C6278ks[] c6278ksArr) {
        this.f34830to = c6278ksArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47072k4(C9632d3 c9632d3) {
        return m47765k4((C9723vw) c9632d3) && this.f34828k4 == c9632d3.f34828k4 && this.f34831x1 == c9632d3.f34831x1 && this.f34829kk == c9632d3.f34829kk && C12530dy.m58334k4(this.f34830to, c9632d3.f34830to);
    }
}
