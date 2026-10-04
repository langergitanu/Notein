package com.aspose.slides.internal.p298nh;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6893kk implements IDisposable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    protected C11898h4 f18841k4;

    /* JADX INFO: renamed from: kk */
    private C11896dy f18842kk;

    /* JADX INFO: renamed from: x1 */
    private C11896dy f18843x1;

    /* JADX INFO: renamed from: c5 */
    public final C11896dy m27010c5() {
        return this.f18843x1;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        C6893kk c6893kk = new C6893kk();
        c6893kk.f18841k4 = (C11898h4) this.f18841k4.deepClone();
        c6893kk.f18843x1 = (C11896dy) this.f18843x1.deepClone();
        c6893kk.f18842kk = (C11896dy) this.f18842kk.deepClone();
        return c6893kk;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f18841k4.dispose();
        this.f18843x1.dispose();
        this.f18842kk.dispose();
    }

    /* JADX INFO: renamed from: du */
    public final int m27011du() {
        return this.f18841k4.m55601h4();
    }

    /* JADX INFO: renamed from: dy */
    public final float m27012dy() {
        return this.f18841k4.m55596c5();
    }

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
        return m27016k4((C6893kk) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final float m27013h4() {
        return this.f18841k4.m55599dy();
    }

    public int hashCode() {
        C11898h4 c11898h4 = this.f18841k4;
        int iHashCode = (c11898h4 != null ? c11898h4.hashCode() : 0) * 397;
        C11896dy c11896dy = this.f18843x1;
        int iHashCode2 = (iHashCode ^ (c11896dy != null ? c11896dy.hashCode() : 0)) * 397;
        C11896dy c11896dy2 = this.f18842kk;
        return iHashCode2 ^ (c11896dy2 != null ? c11896dy2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C11896dy m27014jd() {
        return this.f18842kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27015k4(int[] iArr, int[] iArr2) {
        this.f18841k4.m55605k4(iArr, iArr2);
    }

    /* JADX INFO: renamed from: m9 */
    public final int m27017m9() {
        return this.f18841k4.m55606m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27016k4(C6893kk c6893kk) {
        return C14067j2.m66728k4(this.f18841k4, c6893kk.f18841k4) && C14067j2.m66728k4(this.f18843x1, c6893kk.f18843x1) && C14067j2.m66728k4(this.f18842kk, c6893kk.f18842kk);
    }
}
