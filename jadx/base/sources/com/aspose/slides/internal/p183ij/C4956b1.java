package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.b1 */
/* JADX INFO: loaded from: classes.dex */
public class C4956b1 extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private C12514ne[] f13532du;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13533k4;

    /* JADX INFO: renamed from: kk */
    private long f13534kk;

    /* JADX INFO: renamed from: to */
    private long[] f13535to;

    /* JADX INFO: renamed from: x1 */
    private long f13536x1;

    public C4956b1(C5061vw c5061vw) {
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
        return m20806k4((C4956b1) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13533k4;
        int iHashCode2 = (((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13536x1)) * 397) ^ ((int) this.f13534kk)) * 397;
        long[] jArr = this.f13535to;
        int iHashCode3 = (iHashCode2 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397;
        C12514ne[] c12514neArr = this.f13532du;
        return iHashCode3 ^ (c12514neArr != null ? AbstractC14092to.m67208k4((Object) c12514neArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20801k4() {
        return this.f13536x1;
    }

    /* JADX INFO: renamed from: kk */
    public final long[] m20807kk() {
        return this.f13535to;
    }

    /* JADX INFO: renamed from: to */
    public final C12514ne[] m20808to() {
        return this.f13532du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m20809x1() {
        return this.f13534kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20802k4(long j) {
        this.f13536x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20810x1(long j) {
        this.f13534kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20803k4(C12521uz c12521uz) {
        this.f13533k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20804k4(long[] jArr) {
        this.f13535to = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20805k4(C12514ne[] c12514neArr) {
        this.f13532du = c12514neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20806k4(C4956b1 c4956b1) {
        return m21559k4((C5061vw) c4956b1) && C14067j2.m66728k4(this.f13533k4, c4956b1.f13533k4) && this.f13536x1 == c4956b1.f13536x1 && this.f13534kk == c4956b1.f13534kk && C3022m9.m12722k4(this.f13535to, c4956b1.f13535to) && C3022m9.m12723k4(this.f13532du, c4956b1.f13532du);
    }
}
