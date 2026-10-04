package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1357wl;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ii */
/* JADX INFO: loaded from: classes.dex */
public class C4995ii extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private long f13675du;

    /* JADX INFO: renamed from: h4 */
    private C1357wl[] f13676h4;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13677k4;

    /* JADX INFO: renamed from: kk */
    private float f13678kk;

    /* JADX INFO: renamed from: to */
    private float f13679to;

    /* JADX INFO: renamed from: x1 */
    private long f13680x1;

    public C4995ii(C5061vw c5061vw) {
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
        return m21103k4((C4995ii) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m21097h4() {
        return this.f13675du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13677k4;
        int iHashCode2 = (((((((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13680x1)) * 397) ^ C14064he.m66708k4(this.f13678kk)) * 397) ^ C14064he.m66708k4(this.f13679to)) * 397) ^ ((int) this.f13675du)) * 397;
        C1357wl[] c1357wlArr = this.f13676h4;
        return iHashCode2 ^ (c1357wlArr != null ? AbstractC14092to.m67208k4((Object) c1357wlArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21098k4() {
        return this.f13677k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m21104kk() {
        return this.f13678kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C1357wl[] m21105m9() {
        return this.f13676h4;
    }

    /* JADX INFO: renamed from: to */
    public final float m21106to() {
        return this.f13679to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21107x1() {
        return this.f13680x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21099k4(float f) {
        this.f13678kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21108x1(float f) {
        this.f13679to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21100k4(long j) {
        this.f13680x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21109x1(long j) {
        this.f13675du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21101k4(C12521uz c12521uz) {
        this.f13677k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21102k4(C1357wl[] c1357wlArr) {
        this.f13676h4 = c1357wlArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21103k4(C4995ii c4995ii) {
        return m21559k4((C5061vw) c4995ii) && C14067j2.m66728k4(this.f13677k4, c4995ii.f13677k4) && this.f13680x1 == c4995ii.f13680x1 && C14064he.m66718x1(this.f13678kk, c4995ii.f13678kk) && C14064he.m66718x1(this.f13679to, c4995ii.f13679to) && this.f13675du == c4995ii.f13675du && C3022m9.m12723k4(this.f13676h4, c4995ii.f13676h4);
    }
}
