package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p260ly.C6278ks;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C9735xk extends AbstractC9718uz {

    /* JADX INFO: renamed from: du */
    private C6278ks[] f35176du;

    /* JADX INFO: renamed from: h4 */
    private long f35177h4;

    /* JADX INFO: renamed from: k4 */
    private long f35178k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f35179kk;

    /* JADX INFO: renamed from: to */
    private int[] f35180to;

    /* JADX INFO: renamed from: x1 */
    private long f35181x1;

    public C9735xk(C3180k4 c3180k4) {
        super(c3180k4);
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
        return m47842k4((C9735xk) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f35178k4)) * 397) ^ ((int) this.f35181x1)) * 397;
        byte[] bArr = this.f35179kk;
        int iHashCode2 = (iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0)) * 397;
        int[] iArr = this.f35180to;
        int iHashCode3 = (iHashCode2 ^ (iArr != null ? AbstractC14092to.m67208k4((Object) iArr).hashCode() : 0)) * 397;
        C6278ks[] c6278ksArr = this.f35176du;
        return ((iHashCode3 ^ (c6278ksArr != null ? AbstractC14092to.m67208k4((Object) c6278ksArr).hashCode() : 0)) * 397) ^ ((int) this.f35177h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47839k4() {
        return this.f35178k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47843kk(long j) {
        this.f35177h4 = j;
    }

    /* JADX INFO: renamed from: to */
    public final long m47845to() {
        return this.f35177h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47846x1() {
        return this.f35181x1;
    }

    public C9735xk(C9723vw c9723vw) {
        super(c9723vw);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47840k4(long j) {
        this.f35178k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m47844kk() {
        return this.f35180to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47847x1(long j) {
        this.f35181x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47841k4(int[] iArr) {
        if (this.f35180to != iArr) {
            this.f35176du = null;
        }
        this.f35180to = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47842k4(C9735xk c9735xk) {
        return m47765k4((C9723vw) c9735xk) && this.f35178k4 == c9735xk.f35178k4 && this.f35181x1 == c9735xk.f35181x1 && C12530dy.m58330k4(this.f35179kk, c9735xk.f35179kk) && C12530dy.m58332k4(this.f35180to, c9735xk.f35180to) && C12530dy.m58334k4(this.f35176du, c9735xk.f35176du) && this.f35177h4 == c9735xk.f35177h4;
    }
}
