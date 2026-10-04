package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5068x1 extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12514ne f13916k4;

    /* JADX INFO: renamed from: kk */
    private float f13917kk;

    /* JADX INFO: renamed from: to */
    private float f13918to;

    /* JADX INFO: renamed from: x1 */
    private long f13919x1;

    public C5068x1(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m21604k4((C5068x1) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12514ne c12514ne = this.f13916k4;
        return ((((((iHashCode ^ (c12514ne != null ? c12514ne.hashCode() : 0)) * 397) ^ ((int) this.f13919x1)) * 397) ^ C14064he.m66708k4(this.f13917kk)) * 397) ^ C14064he.m66708k4(this.f13918to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12514ne m21600k4() {
        return this.f13916k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m21605kk() {
        return this.f13917kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m21606to() {
        return this.f13918to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21607x1() {
        return this.f13919x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21601k4(float f) {
        this.f13917kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21608x1(float f) {
        this.f13918to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21602k4(long j) {
        this.f13919x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21603k4(C12514ne c12514ne) {
        this.f13916k4 = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21604k4(C5068x1 c5068x1) {
        return m21559k4((C5061vw) c5068x1) && C14067j2.m66728k4(this.f13916k4, c5068x1.f13916k4) && this.f13919x1 == c5068x1.f13919x1 && C14064he.m66718x1(this.f13917kk, c5068x1.f13917kk) && C14064he.m66718x1(this.f13918to, c5068x1.f13918to);
    }
}
