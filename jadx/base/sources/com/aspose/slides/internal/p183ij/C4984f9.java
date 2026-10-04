package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1353u4;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.f9 */
/* JADX INFO: loaded from: classes.dex */
public class C4984f9 extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private int f13634du;

    /* JADX INFO: renamed from: h4 */
    private C1353u4 f13635h4;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13636k4;

    /* JADX INFO: renamed from: kk */
    private long f13637kk;

    /* JADX INFO: renamed from: to */
    private int f13638to;

    /* JADX INFO: renamed from: x1 */
    private long f13639x1;

    public C4984f9(C5061vw c5061vw) {
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
        return m21016k4((C4984f9) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C1353u4 m21010h4() {
        return this.f13635h4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13636k4;
        int iHashCode2 = (((((((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13639x1)) * 397) ^ ((int) this.f13637kk)) * 397) ^ this.f13638to) * 397) ^ this.f13634du) * 397;
        C1353u4 c1353u4 = this.f13635h4;
        return iHashCode2 ^ (c1353u4 != null ? c1353u4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21011k4() {
        return this.f13636k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m21017kk() {
        return this.f13638to;
    }

    /* JADX INFO: renamed from: to */
    public final int m21018to() {
        return this.f13634du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21019x1() {
        return this.f13637kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21012k4(int i) {
        this.f13638to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21020x1(int i) {
        this.f13634du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21013k4(long j) {
        this.f13639x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21021x1(long j) {
        this.f13637kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21014k4(C1353u4 c1353u4) {
        this.f13635h4 = c1353u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21015k4(C12521uz c12521uz) {
        this.f13636k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21016k4(C4984f9 c4984f9) {
        return m21559k4((C5061vw) c4984f9) && C14067j2.m66728k4(this.f13636k4, c4984f9.f13636k4) && this.f13639x1 == c4984f9.f13639x1 && this.f13637kk == c4984f9.f13637kk && this.f13638to == c4984f9.f13638to && this.f13634du == c4984f9.f13634du && this.f13635h4.equals(c4984f9.f13635h4);
    }
}
