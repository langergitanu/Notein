package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p183ij.C4996ix;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.yj */
/* JADX INFO: loaded from: classes.dex */
public class C5081yj extends C4996ix {

    /* JADX INFO: renamed from: k4 */
    private long f13950k4;

    /* JADX INFO: renamed from: x1 */
    private C10988bz[] f13951x1;

    public C5081yj() {
        m21557ck(70L);
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
        return m21666k4((C5081yj) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13950k4)) * 397;
        C10988bz[] c10988bzArr = this.f13951x1;
        return iHashCode ^ (c10988bzArr != null ? AbstractC14092to.m67208k4((Object) c10988bzArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21664k4(long j) {
        this.f13950k4 = j;
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26804kk();
        for (C10988bz c10988bz : m21667k4()) {
            c6765kp.m26810x1(C14113y2.m67408k4("\t\t", c10988bz.toString()));
        }
        return C14113y2.m67402k4("{0}, CommentIdentifier: {1}, EmfPlusRecords: {2}", super.toString(), C14042ak.m66410k4(C4996ix.k4.class, this.f13950k4), c6765kp.toString());
    }

    public C5081yj(C4996ix c4996ix) {
        super(c4996ix);
        m21112to(c4996ix.m21111to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21665k4(C10988bz[] c10988bzArr) {
        this.f13951x1 = c10988bzArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21666k4(C5081yj c5081yj) {
        return m21110k4((C4996ix) c5081yj) && this.f13950k4 == c5081yj.f13950k4 && C3022m9.m12723k4(this.f13951x1, c5081yj.f13951x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10988bz[] m21667k4() {
        return this.f13951x1;
    }
}
