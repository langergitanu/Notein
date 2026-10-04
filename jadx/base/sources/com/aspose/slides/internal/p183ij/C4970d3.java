package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1347ks;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.d3 */
/* JADX INFO: loaded from: classes.dex */
public class C4970d3 extends AbstractC4960bs {

    /* JADX INFO: renamed from: k4 */
    private long f13581k4;

    /* JADX INFO: renamed from: kk */
    private long f13582kk;

    /* JADX INFO: renamed from: to */
    private C1347ks[] f13583to;

    /* JADX INFO: renamed from: x1 */
    private long f13584x1;

    public C4970d3(C5061vw c5061vw) {
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
        return m20902k4((C4970d3) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((((super.hashCode() * 397) ^ ((int) this.f13581k4)) * 397) ^ ((int) this.f13584x1)) * 397) ^ ((int) this.f13582kk)) * 397;
        C1347ks[] c1347ksArr = this.f13583to;
        return iHashCode ^ (c1347ksArr != null ? AbstractC14092to.m67208k4((Object) c1347ksArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20899k4() {
        return this.f13581k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m20903kk() {
        return this.f13582kk;
    }

    /* JADX INFO: renamed from: to */
    public final C1347ks[] m20905to() {
        return this.f13583to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m20906x1() {
        return this.f13584x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20900k4(long j) {
        this.f13581k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m20904kk(long j) {
        this.f13582kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20907x1(long j) {
        this.f13584x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20901k4(C1347ks[] c1347ksArr) {
        this.f13583to = c1347ksArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20902k4(C4970d3 c4970d3) {
        return m21559k4((C5061vw) c4970d3) && this.f13581k4 == c4970d3.f13581k4 && this.f13584x1 == c4970d3.f13584x1 && this.f13582kk == c4970d3.f13582kk && C3022m9.m12723k4(this.f13583to, c4970d3.f13583to);
    }
}
