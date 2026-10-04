package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6269ck;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.e0 */
/* JADX INFO: loaded from: classes4.dex */
public class C9641e0 extends AbstractC9629ca {

    /* JADX INFO: renamed from: k4 */
    private long f34874k4;

    /* JADX INFO: renamed from: x1 */
    private C6269ck f34875x1;

    public C9641e0(C9723vw c9723vw) {
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
        return m47170k4((C9641e0) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f34874k4)) * 397;
        C6269ck c6269ck = this.f34875x1;
        return iHashCode ^ (c6269ck != null ? c6269ck.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47167k4() {
        return this.f34874k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IhFonts: {1}, Elw: {2}", super.toString(), Long.valueOf(m47167k4()), m47171x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final C6269ck m47171x1() {
        return this.f34875x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47168k4(long j) {
        this.f34874k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47169k4(C6269ck c6269ck) {
        this.f34875x1 = c6269ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47170k4(C9641e0 c9641e0) {
        return m47765k4((C9723vw) c9641e0) && this.f34874k4 == c9641e0.f34874k4 && C14067j2.m66728k4(this.f34875x1, c9641e0.f34875x1);
    }
}
