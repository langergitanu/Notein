package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9730x1 extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12343ne f35163k4;

    /* JADX INFO: renamed from: kk */
    private float f35164kk;

    /* JADX INFO: renamed from: to */
    private float f35165to;

    /* JADX INFO: renamed from: x1 */
    private long f35166x1;

    public C9730x1(C9723vw c9723vw) {
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
        return m47813k4((C9730x1) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12343ne c12343ne = this.f35163k4;
        return ((((((iHashCode ^ (c12343ne != null ? c12343ne.hashCode() : 0)) * 397) ^ ((int) this.f35166x1)) * 397) ^ C14064he.m66708k4(this.f35164kk)) * 397) ^ C14064he.m66708k4(this.f35165to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12343ne m47809k4() {
        return this.f35163k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m47814kk() {
        return this.f35164kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m47815to() {
        return this.f35165to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47816x1() {
        return this.f35166x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47810k4(float f) {
        this.f35164kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47817x1(float f) {
        this.f35165to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47811k4(long j) {
        this.f35166x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47812k4(C12343ne c12343ne) {
        this.f35163k4 = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47813k4(C9730x1 c9730x1) {
        return m47765k4((C9723vw) c9730x1) && C14067j2.m66728k4(this.f35163k4, c9730x1.f35163k4) && this.f35166x1 == c9730x1.f35166x1 && C14064he.m66718x1(this.f35164kk, c9730x1.f35164kk) && C14064he.m66718x1(this.f35165to, c9730x1.f35165to);
    }
}
