package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C9648g8 extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12343ne f34888k4;

    /* JADX INFO: renamed from: kk */
    private long f34889kk;

    /* JADX INFO: renamed from: x1 */
    private C12334dy f34890x1;

    public C9648g8(C9723vw c9723vw) {
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
        return m47205k4((C9648g8) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12343ne c12343ne = this.f34888k4;
        int iHashCode2 = (iHashCode ^ (c12343ne != null ? c12343ne.hashCode() : 0)) * 397;
        C12334dy c12334dy = this.f34890x1;
        return ((iHashCode2 ^ (c12334dy != null ? c12334dy.hashCode() : 0)) * 397) ^ ((int) this.f34889kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12343ne m47201k4() {
        return this.f34888k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47206kk() {
        return this.f34889kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12334dy m47207x1() {
        return this.f34890x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47202k4(long j) {
        this.f34889kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47203k4(C12334dy c12334dy) {
        this.f34890x1 = c12334dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47204k4(C12343ne c12343ne) {
        this.f34888k4 = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47205k4(C9648g8 c9648g8) {
        return m47765k4((C9723vw) c9648g8) && C14067j2.m66728k4(this.f34888k4, c9648g8.f34888k4) && C14067j2.m66728k4(this.f34890x1, c9648g8.f34890x1) && this.f34889kk == c9648g8.f34889kk;
    }
}
