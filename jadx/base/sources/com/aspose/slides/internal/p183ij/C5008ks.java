package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p254lp.AbstractC6219k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ks */
/* JADX INFO: loaded from: classes.dex */
public class C5008ks extends C4996ix {

    /* JADX INFO: renamed from: k4 */
    private long f13738k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC6219k4[] f13739kk;

    /* JADX INFO: renamed from: x1 */
    private long f13740x1;

    public C5008ks(C4996ix c4996ix) {
        super(c4996ix);
        m21112to(c4996ix.m21111to());
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21232k4((C5008ks) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f13738k4)) * 397) ^ ((int) this.f13740x1)) * 397;
        AbstractC6219k4[] abstractC6219k4Arr = this.f13739kk;
        return iHashCode ^ (abstractC6219k4Arr != null ? AbstractC14092to.m67208k4((Object) abstractC6219k4Arr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21231k4(long j) {
        this.f13738k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21233x1(long j) {
        this.f13740x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21232k4(C5008ks c5008ks) {
        return m21110k4((C4996ix) c5008ks) && this.f13738k4 == c5008ks.f13738k4 && this.f13740x1 == c5008ks.f13740x1 && C3022m9.m12723k4(this.f13739kk, c5008ks.f13739kk);
    }
}
