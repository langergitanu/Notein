package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1357wl;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.zm */
/* JADX INFO: loaded from: classes.dex */
public class C5088zm extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private long f13984du;

    /* JADX INFO: renamed from: h4 */
    private C1357wl[] f13985h4;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13986k4;

    /* JADX INFO: renamed from: kk */
    private float f13987kk;

    /* JADX INFO: renamed from: to */
    private float f13988to;

    /* JADX INFO: renamed from: x1 */
    private long f13989x1;

    public C5088zm(C5061vw c5061vw) {
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
        return m21741k4((C5088zm) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m21735h4() {
        return this.f13984du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13986k4;
        int iHashCode2 = (((((((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13989x1)) * 397) ^ C14064he.m66708k4(this.f13987kk)) * 397) ^ C14064he.m66708k4(this.f13988to)) * 397) ^ ((int) this.f13984du)) * 397;
        C1357wl[] c1357wlArr = this.f13985h4;
        return iHashCode2 ^ (c1357wlArr != null ? AbstractC14092to.m67208k4((Object) c1357wlArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21736k4() {
        return this.f13986k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m21742kk() {
        return this.f13987kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C1357wl[] m21743m9() {
        return this.f13985h4;
    }

    /* JADX INFO: renamed from: to */
    public final float m21744to() {
        return this.f13988to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21745x1() {
        return this.f13989x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21737k4(float f) {
        this.f13987kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21746x1(float f) {
        this.f13988to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21738k4(long j) {
        this.f13989x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21747x1(long j) {
        this.f13984du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21739k4(C12521uz c12521uz) {
        this.f13986k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21740k4(C1357wl[] c1357wlArr) {
        this.f13985h4 = c1357wlArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21741k4(C5088zm c5088zm) {
        return m21559k4((C5061vw) c5088zm) && C14067j2.m66728k4(this.f13986k4, c5088zm.f13986k4) && this.f13989x1 == c5088zm.f13989x1 && C14064he.m66718x1(this.f13987kk, c5088zm.f13987kk) && C14064he.m66718x1(this.f13988to, c5088zm.f13988to) && this.f13984du == c5088zm.f13984du && C3022m9.m12723k4(this.f13985h4, c5088zm.f13985h4);
    }
}
